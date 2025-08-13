def decimal_para_binario(n):
    binario = ""
    while (n>0):
        resto = n%2
        binario = str(resto) + binario
        n = n//2
    return "0" if binario == "" else binario
    
def decimal_para_oct(n):
    oct= ""
    while(n>0):
        resto =n%8
        oct = str(resto) + oct
        n = n//8

    return "0" if oct == "" else oct
    
def decimal_para_hex(n):
    hex =""
    hex_chars = "0123456789ABCDEF"
    while(n<0):
        hexa = hex_chars[n%16] + hex
        n=n//16
    return "0" if hex == "" else hex
    


def bin_para_decimal(bin):
    decimal = 0
    for i,numero in enumerate (reversed(bin)):
        decimal += int(numero) * (2**i)
    return decimal
        

def oct_para_decimal(oct):
    decimal = 0
    for i,numero in enumerate (reversed(oct)):
        decimal += int(numero) * (8**i)
    return decimal
           

def bin_para_oct(binario):
    # Converter binário para decimal
    decimal = 0
    for i, numero in enumerate(reversed(binario)):  
        decimal += int(numero) * (2 ** i)

    # Converter decimal para octal
    octal = ""
    n = decimal
    while n > 0:
        resto = n % 8
        octal = str(resto) + octal  # Concatena os restos
        n = n // 8  # Divisão inteira

    return "0" if oct == "" else oct

def oct_para_binario(oct):
    decimal =0
    for i,numero in enumerate(reversed(oct)):
        decimal += int(numero) * (8**i)
    n= decimal
    binario = ""
    while(n>0):
        resto = n%2
        binario = str(resto) + binario
        n = n//2
    return "0" if binario =="" else binario


def hexadecimal_para_decimal(hex_str):
    hex_chars = "0123456789ABCDEF"
    decimal = 0
    for i, digito in enumerate(reversed(hex_str.upper())):
        decimal += hex_chars.index(digito) * (16 ** i)
    return decimal