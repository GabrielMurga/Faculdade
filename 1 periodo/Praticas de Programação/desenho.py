import turtle
t=turtle.Turtle()
quadrados=int(input("Quantos quadrados vc quer desenhar? "))
quadrados=quadrados+1
for n in range(quadrados):
    t.fd(10*n)
    t.lt(90)
    t.fd(10*n)
    t.lt(90)
    t.fd(10*n)
    t.lt(90)
    t.fd(10*n)
    t.lt(90)
                  
