
#GRUPO: Gabriel Losekann Paiva Murga
#Cauã Neves
# Não conseguimos achar o erro de colisão do codigo, o fogo ta colidindo antes e o contador ta bugado





import pygame
import sys

width = 100 * 14
height = 100 * 9
mapa = []
hero_walk = []
hero_anim_frame = 1
hero_pos_x = 100
hero_pos_y = 400
hero_vel_y = 0
hero_jump_force = -30.0
hero_anim_time = 0
correndo = False
correr_count = 0
hero_vel_x = 0
mortes = 0
nivel = 1
gravity = 0.5*nivel
mensagem_tempo = 0
mostrar_mensagem = False


def load_mapa(filename):
    global mapa
    file = open(filename, "r")
    i = 0
    for line in file.readlines():
        mapa.append([])
        for j in line:
            mapa[i].append(j)
        i += 1
    file.close()


def load():
    global clock, tile_fogo, tile_lava, tile_textura, background_image, hero_walk, hero, fire, audio, sys_font,bowser,monstro,bowser
    clock = pygame.time.Clock()
    load_mapa("mapa.txt")
    tile_fogo = pygame.image.load("fogo.png")
    tile_lava = pygame.image.load("lava.png")
    sys_font = pygame.font.Font(pygame.font.get_default_font(), 20)
    tile_textura = pygame.image.load("textura.png")
    bowser=pygame.image.load("bowser.png")
    background_image = pygame.image.load("textura.png")
    background_image = pygame.transform.scale(background_image, (width, height))
    audio = pygame.mixer.Sound("tema.ogg")
    hero = {
        "x": hero_pos_x,
        "y": hero_pos_y,
        "dim": 128,
        "collided": False
    }
    fire = {
        "x": 500,
        "y": 700,
        "dim": 256
    }
    monstro = {
        "x": 800,
        "y": 250,
        "dim": 500
    }

    for i in range(1, 9):
        hero_walk.append(pygame.image.load("Hero_Walk_0" + str(i) + ".png"))

    return hero_pos_x, hero_pos_y


def check_box_collision(x1, y1, w1, h1, x2, y2, w2, h2):
    return (x1 < x2 + w2) and (x2 < x1 + w1) and (y1 < y2 + h2) and (y2 < y1 + h1)


def update(dt):
    global hero_walk, hero_anim_frame, hero_pos_x, hero_pos_y, hero_vel_y, hero_anim_time, correndo, correr_count, \
        hero_vel_x, fire_rect, mapa, hero, fogo1, fogo2, mensagem_tempo, mostrar_mensagem, mortes, width
    keys = pygame.key.get_pressed()

    if keys[pygame.K_RIGHT]:
        hero_pos_x += 0.1 * dt
        hero_anim_time += dt
        if keys[pygame.K_UP] and hero_pos_y == 580:
            hero_vel_y = hero_jump_force
        if hero_anim_time > 100:
            hero_anim_frame = (hero_anim_frame + 1) % 4
            hero_anim_time = 0

    elif keys[pygame.K_LEFT]:
        hero_pos_x -= 0.1 * dt
        hero_anim_time += dt
        if keys[pygame.K_UP] and hero_pos_y == 580:
            hero_vel_y = hero_jump_force
        if hero_anim_time > 100:
            hero_anim_frame = (hero_anim_frame + 1) % 4 + 4
            hero_anim_time = 0

    elif keys[pygame.K_UP] and hero_pos_y == 580:
        hero_vel_y = hero_jump_force

    if keys[pygame.K_UP] and keys[pygame.K_LEFT] and hero_pos_y == 580:
        hero_vel_y = hero_jump_force
        hero_pos_x -= 0.1 * dt
        hero_anim_time += dt
        if hero_anim_time > 100:
            hero_anim_frame = (hero_anim_frame + 1) % 4
            hero_anim_time = 0

    elif keys[pygame.K_UP] and keys[pygame.K_RIGHT] and hero_pos_y == 580:
        hero_vel_y = hero_jump_force
        hero_pos_x += 0.1 * dt
        hero_anim_time += dt
        if hero_anim_time > 100:
            hero_anim_frame = (hero_anim_frame + 1) % 4
            hero_anim_time = 0

    if keys[pygame.K_LEFT] or keys[pygame.K_RIGHT]:
        correr_count += 1
        if correr_count >= 30:
            correndo = True
    else:
        correndo = False
        correr_count = 0

    if correndo and keys[pygame.K_RIGHT]:
        hero_pos_x += 0.5 * dt
    elif correndo and keys[pygame.K_LEFT]:
        hero_pos_x -= 0.5 * dt
    if not keys[pygame.K_LEFT] and not keys[pygame.K_RIGHT]:
        hero_vel_x = 0

    hero_vel_y += gravity
    hero_pos_y += hero_vel_y

    if hero_pos_y > 580:
        hero_pos_y = 580

    if hero_pos_y < 0:
        hero_pos_y = 0

    hero["x"] = hero_pos_x
    hero["y"] = hero_pos_y
    hero_fire_collision = check_box_collision(hero["x"], hero["y"], hero["dim"], hero["dim"], fire["x"], fire["y"],
                                           fire["dim"], fire["dim"])
    hero_monstro_collision = check_box_collision(hero["x"], hero["y"], hero["dim"], hero["dim"], monstro["x"], monstro["y"],
                                              monstro["dim"], monstro["dim"])
    hero["collided"] = hero_fire_collision or hero_monstro_collision



    if hero["collided"]:
        mortes += 1
        deaths_text = sys_font.render("Mortes %d" % mortes, True, (255, 255, 255))
        mensagem_tempo += dt
        if mensagem_tempo < 3000:
            screen.fill((0, 0, 0))
            t = sys_font.render("Você morreu, tente novamente!", True, (255, 0, 0))  # Cor vermelha para a mensagem
            screen.blit(t, (width // 2 - t.get_width() // 2, height // 2 - t.get_height() // 2))
            screen.blit(deaths_text, (1000, 100))
            mostrar_mensagem = True
        else:
            hero_pos_x = 0
            hero_pos_y = 570  # Reposiciona o herói na altura inicial
            mensagem_tempo = 0
            mostrar_mensagem = False

    if hero_pos_x > width:
        mensagem_tempo += dt
        if mensagem_tempo < 3000:
            screen.fill((0, 0, 0))
            t = sys_font.render("Você Passou de fase!", True, (255, 255, 255))
            screen.blit(t, (width // 2 - t.get_width() // 2, height // 2 - t.get_height() // 2))
    
            mostrar_mensagem = True
        else:
            hero_pos_x = 0
            hero_pos_y = 570  # Reposiciona o herói na altura inicial
            mensagem_tempo = 0
            mostrar_mensagem = False

    draw_screen(screen)
    pygame.display.update()



def draw_screen(screen):
    deaths_text = sys_font.render("Mortes %d" % mortes, True, (255, 255, 255))

    screen.blit(background_image, (0, 0))
    screen.blit(bowser, (800,250))
    screen.blit(deaths_text, (1000, 100))
    screen.blit(hero_walk[hero_anim_frame], (hero_pos_x, hero_pos_y))
    for i in range(9):
        for j in range(14):
            if mapa[i][j] == "L":
                if i == 0 or (i > 0 and mapa[i - 1][j] != "F"):
                    screen.blit(tile_lava, ((j * 100), (i * 100)))
            elif mapa[i][j] == "F":
                screen.blit(tile_fogo, ((j * 100), (i * 100)))


def show_start_screen(screen):
    font = pygame.font.Font(None, 36)
    text = font.render("Pressione qualquer tecla para começar", True, (255, 255, 255))
    text_rect = text.get_rect(center=(width // 2, height // 2))

    screen.blit(text, text_rect)
    pygame.display.flip()
    audio.play()
    waiting_for_key = True
    while waiting_for_key:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                quit()
            elif event.type == pygame.KEYDOWN or event.type == pygame.KEYUP:
                waiting_for_key = False


def main_loop(screen):
    global clock, hero_pos_x, hero_pos_y, mostrar_mensagem, mensagem_tempo, mortes
    deaths_text = sys_font.render("Mortes %d" % mortes, True, (255, 255, 255))
    show_start_screen(screen)
    running = True
    while running:
        for e in pygame.event.get():
            if e.type == pygame.QUIT:
                running = False
                break

        clock.tick(60)
        dt = clock.get_time()
        if hero["collided"] == True:
            mortes += 1
            deaths_text = sys_font.render("Mortes %d" % mortes, True, (255, 255, 255))
            mensagem_tempo += dt
            if mensagem_tempo < 3000:
                screen.fill((0, 0, 0))
                t = sys_font.render("Voce morreu!", True, (255,0, 0))
                screen.blit(t, (width // 2 - t.get_width() // 2, height // 2 - t.get_height() // 2))
                screen.blit(deaths_text, (1000, 100))
            else:
                hero_pos_x = 0
                mensagem_tempo = 0
                mostrar_mensagem = False
        elif not hero["collided"] and mostrar_mensagem==True:
            mensagem_tempo += dt
            if mensagem_tempo < 3000:
                screen.fill((0, 0, 0))
                t = sys_font.render("Voce Passou de fase!", True, (255, 255, 255))
                screen.blit(t, (width // 2 - t.get_width() // 2, height // 2 - t.get_height() // 2))
                screen.blit(deaths_text, (1000, 100))
            else:
                hero_pos_x = 0
                mensagem_tempo = 0
                mostrar_mensagem = False
        if not mostrar_mensagem:
            draw_screen(screen)
            update(dt)

        pygame.display.update()



pygame.init()
pygame.mixer.init()
screen = pygame.display.set_mode((width, height))
pygame.display.set_caption("Jogo")
load()
main_loop(screen)
pygame.quit()
