# mapas
import pygame
import random
width = 30 * 26 
height = 30 * 20
mapa = []
def load():
    global clock, mapa
    clock = pygame.time.Clock() 
    for i in range(26): #Gera aleatoriamente uma matriz 26 x 20 
        mapa.append([])
        for j in range(20):
            mapa[i].append(random.randint(0, 3))
            print(mapa[i][j],end='')
        print(' - ')
            
def update(dt):
    pass

def draw_screen(screen):
    screen.fill((255,255,255))
    for i in range(26): #Percorre a matriz e desenha quadrados coloridos 
        for j in range(20):
            color = (0,0,0)
            if mapa[i][j] == 0:
                color = (255,0,0) 
            elif mapa[i][j] == 1:
                color = (0,255,0) 
            elif mapa[i][j] == 2: 
                color = (0,0,255) 
            elif mapa[i][j] == 3:
                color = (255,255,0) 
            pygame.draw.rect(screen, color, ((i * 30), (j * 30), 30, 30))


def main_loop(screen): 
    global clock
    running = True
    while running:
        for e in pygame.event.get(): 
            if e.type == pygame.QUIT:
                running = False
                break
        clock.tick(60)
        dt = clock.get_time() 
        draw_screen(screen) 
        update(dt)
        pygame.display.update()
        
pygame.init()
screen = pygame.display.set_mode((width, height))
load()
main_loop(screen)
pygame.quit()
