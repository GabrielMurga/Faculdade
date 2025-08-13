# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
numero=int(input("Diga um numero de 1 a 10: "))
for multiplicador in range (10):
    print("%d x %d= %d" % (numero,multiplicador,numero*(multiplicador+1)))