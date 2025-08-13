letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

chave = str(input("CHAVE: "))
chave = chave.upper()

texto = str(input("TEXTO: "))
texto = texto.upper()

def cripto(chave, texto):
    for i in range(len(texto) - len(chave)):
        chave = chave + chave[i]

    texto_criptografado = ""

    for index, i in enumerate(chave):
        busca = letras.find(chave[index]) + letras.find(texto[index])
        if busca > 26:
            busca -= 26
        texto_criptografado += letras[busca]

    return texto_criptografado

def decripto(chave, texto_criptografado):
    texto_descriptografado = ""

    for index, i in enumerate(chave):
        busca = letras.find(texto_criptografado[index]) - letras.find(chave[index])
        if busca < 0:
            busca += 26
        texto_descriptografado += letras[busca]

    return texto_descriptografado

texto_criptografado = cripto(chave, texto)
print(f"Texto Criptografado: {texto_criptografado}")

texto_descriptografado = decripto(chave, texto_criptografado)
print(f"Texto Descriptografado: {texto_descriptografado}")


                                