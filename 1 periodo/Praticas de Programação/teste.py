import turtle
# Cria uma nova janela de desenho
janela = turtle.Screen()
# Cria uma nova tartaruga
tartaruga = turtle.Turtle()
# Define a velocidade da tartaruga
tartaruga.speed(0)
# Define a cor da tartaruga
tartaruga.color("green")
# Move a tartaruga para o centro da tela
tartaruga.penup()
tartaruga.goto(0, 0)
tartaruga.pendown()
# Desenha a parte vermelha da bandeira
def desenha_parte_vermelha():
  tartaruga.begin_fill()
  tartaruga.forward(200)
  tartaruga.left(90)
  tartaruga.forward(100)
  tartaruga.left(90)
  tartaruga.forward(200)
  tartaruga.left(90)
  tartaruga.forward(100)
  tartaruga.end_fill()
# Desenha a parte amarela da bandeira
def desenha_parte_amarela():
  # Move a tartaruga para o canto superior esquerdo da tela
  tartaruga.penup()
  tartaruga.goto(-100, 100)
  tartaruga.pendown()
  # Desenha o círculo amarelo
  tartaruga.begin_fill()
  tartaruga.circle(50)
  tartaruga.end_fill()
# Desenha a parte verde da bandeira
def desenha_parte_verde():
  # Move a tartaruga para o centro da tela
  tartaruga.penup()
  tartaruga.goto(0, 0)
  tartaruga.pendown()
  # Desenha a estrela verde
  tartaruga.begin_fill()
  tartaruga.left(90)
  tartaruga.forward(50)
  tartaruga.right(144)
  tartaruga.forward(50)
  tartaruga.right(144)
  tartaruga.forward(50)
  tartaruga.right(144)
  tartaruga.forward(50)
