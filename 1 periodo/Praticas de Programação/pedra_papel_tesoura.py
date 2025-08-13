# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
from random import randint
o=[1,2,3]
nome=input("Digite o seu nome: ")
Eu = 0
PC= 0
mensagem=""
def ganhou():
    global Eu
    Eu +=1
    print(mensagem)
    print("Pontuação = PC = ", PC,"e ",nome," = ",Eu)
def perdeu():
    global PC
    PC+=1
    print(mensagem)
    print("Pontuação = PC = ", PC,"e ",nome," = ",Eu)
continua="sim"
while(continua=="sim"):
    computador=o[randint(0, 2)]
    jogador=int((input("Escolha entre Pedra(1), Papel(2) ou Tesoura(3): ")))
    if (jogador == computador):
        print("Empate!")
        print(nome ," = ", Eu)
        print("Computador = ",PC)
    elif(jogador==1):
        if(computador==2):
            mensagem=("Voce perdeu! Papel ganha de Pedra")
            perdeu()
        else:
            mensagem=("Você ganhou! Pedra ganha de Tesoura")
            ganhou()
    elif(jogador==2):
        if(computador==3):
            mensagem=("Voce perdeu! Tesoura ganha de Pepel")
            perdeu()
        else:
            mensagem=("Você ganhou! Papel ganha de Pedra")
            ganhou()
    elif(jogador==3):
        if(computador==1):
            mensagem=("Você perdeu! Pedra ganha de Tesoura")
            perdeu()
        else:
            mensagem=("Você ganhou Tesoura ganha de Papel")
    else:
        print("Erro, opção inválida!")
    continua=input("Desejas continuar?(sim/não) ").lower()
