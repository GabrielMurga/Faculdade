import turtle
def desenha_quadrado(t,tam,nivel):
    if nivel==0:
        return
    for x in range(4):
        t.fd(tam)
        t.rt(90)
        desenha_quadrado(tart,tam/3,nivel-1)
nivel = 4
tart=turtle.Turtle()
tart.lt(90)
tam=300
tart.speed(0)
desenha_quadrado(tart, tam , nivel)
