# -*- coding: utf-8 -*-
"""
Created on Mon Jun 13 11:25:26 2022

@author: augba
"""

import pygame

width = 800  #Largura Janela
height = 600 #Altura Janela

def load():
    global clock, px, player1, box1, box2
    clock = pygame.time.Clock() 
    player1 = {
      "x": 390,
      "y": 300,
      "width": 50,
      "height": 50,
      "speed": 0.5,
      "collided": False
    }
    box1 = {
      "x": 100,
      "y": 300,
      "width": 50,
      "height": 50,
      "collided": False
    }
    box2 = {
      "x":  650,
      "y":  275,
      "width":  100,
      "height":  100,
      "collided": False
    }


def check_box_collision(x1, y1, w1, h1, x2, y2, w2, h2):
   return (x1 < x2 + w2) and (x2 < x1 + w1) and (y1 < y2 + h2) and (y2 < y1 + h1)


def update(dt):
    global player1
    
    keys = pygame.key.get_pressed()
    
    if keys[pygame.K_LEFT]:
       player1["x"] = player1["x"] - (player1["speed"] * dt)
    
    if keys[pygame.K_RIGHT]:
       player1["x"] = player1["x"] + (player1["speed"] * dt)
    
    if keys[pygame.K_UP]:
       player1["y"] = player1["y"] - (player1["speed"] * dt)
    
    if keys[pygame.K_DOWN]:
       player1["y"] = player1["y"] + (player1["speed"] * dt)


    
    player1["collided"] = False
    
    if check_box_collision(player1["x"], player1["y"], player1["width"], player1["height"], 
                           box1["x"], box1["y"], box1["width"], box1["height"]):
        player1["collided"] = True
        box1["collided"] = True
    else:
        box1["collided"] = False
        

   
    if check_box_collision(player1["x"], player1["y"], player1["width"], 
                       player1["height"], box2["x"], box2["y"], box2["width"], box2["height"]):
        player1["collided"] = True
        box2["collided"] = True
    else:
        box2["collided"] = False

def draw_screen(screen):
    screen.fill((0,0,0))
    
    
    color_box1 = (255,255,255)
    if box1["collided"] == True:
        color_box1 = (0,0,255)
    
    pygame.draw.rect(screen,color_box1, (box1["x"], box1["y"], box1["width"], box1["height"]))
    
    color_box2 = (255,255,255)
    if box2["collided"] == True:
        color_box2 = (0,255,0)

    pygame.draw.rect(screen,color_box2, (box2["x"], box2["y"], box2["width"], box2["height"]))
    
    if player1["collided"] == True:
        pygame.draw.rect(screen,(255,0,0), (player1["x"], player1["y"], player1["width"], player1["height"]))
    else:
        pygame.draw.rect(screen,(255,255,255), (player1["x"], player1["y"], player1["width"], player1["height"]))


def main_loop(screen):  
    global clock
    running = True
    while running:
        for e in pygame.event.get(): 
            if e.type == pygame.QUIT:
                running = False
                break
        
        clock.tick(60) 			# Define FPS máximo
 
        # Calcula tempo transcorrido desde
        # a última atualização 
        dt = clock.get_time()
         
        draw_screen(screen)		# Desenha objetos na tela
        
        update(dt) 			# Atualiza posição dos objetos da tela

        pygame.display.update() 	# Pygame atualiza o seu estado


pygame.init()
screen = pygame.display.set_mode((width, height))
load()
main_loop(screen)
pygame.quit()
