import pygame
import math

width = 800  #Largura Janela
height = 600 #Altura Janela

def load():
    global clock, px, player1, circle1, circle2

    clock = pygame.time.Clock() 

    player1 = {
      "x": 390,
      "y": 300,
      "raio": 50,
      "collided": False
    }
    circle1 = {
      "x": 100,
      "y": 300,
      "raio": 50
    }
    circle2 = {
      "x":  650,
      "y":  300,
      "raio": 100
    }


def check_box_collision(x1, y1, w1, h1, x2, y2, w2, h2):
   return (x1 < x2 + w2) and (x2 < x1 + w1) and (y1 < y2 + h2) and (y2 < y1 + h1)

def check_circular_collision(ax, ay, ar, bx, by, br):
   dx = bx - ax
   dy = by - ay
   dist = math.sqrt(dx * dx + dy * dy)
   return dist < ar + br



def update(dt):
    keys = pygame.key.get_pressed()
    if keys[pygame.K_LEFT]:
       player1["x"] = player1["x"] - (0.12 * dt)
    
    if keys[pygame.K_RIGHT]:
       player1["x"] = player1["x"] + (0.12 * dt)
    
    if keys[pygame.K_UP]:
       player1["y"] = player1["y"] - (0.12 * dt)
    
    if keys[pygame.K_DOWN]:
       player1["y"] = player1["y"] + (0.12 * dt)
    
    if check_circular_collision(player1["x"], player1["y"], player1["raio"], circle1["x"], circle1["y"], circle1["raio"]) or check_circular_collision(player1["x"], player1["y"], player1["raio"], circle2["x"], circle2["y"], circle2["raio"]):
       player1["collided"] = True
    else:
       player1["collided"] = False

    
def draw_screen(screen):
    screen.fill((0,0,0))
    
    pygame.draw.circle(screen,(255,255,255), (circle1["x"], circle1["y"]), circle1["raio"])
    pygame.draw.circle(screen,(255,255,255), (circle2["x"], circle2["y"]), circle2["raio"])
 

    if player1["collided"] == True:
        pygame.draw.circle(screen,(255,0,0), (player1["x"], player1["y"]), player1["raio"])
    else:
        pygame.draw.circle(screen,(255,255,255), (player1["x"], player1["y"]), player1["raio"])



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
         
        draw_screen(screen)			 # Desenha objetos na tela
        
        update(dt) 			# Atualiza posição dos objetos da tela

        pygame.display.update() 	# Pygame atualiza o seu estado


pygame.init()
screen = pygame.display.set_mode((width, height))
load()
main_loop(screen)
pygame.quit()
