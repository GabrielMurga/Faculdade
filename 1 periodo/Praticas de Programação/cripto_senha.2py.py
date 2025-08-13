import re

def valida_cpf(cpf):
    # Remove a formatação do CPF, mantendo apenas os dígitos
    cpf = ''.join(filter(str.isdigit, cpf))

    if len(cpf) != 11:
        return False

    # Calcula o primeiro dígito verificador
    soma = 0
    peso = 10
    for i in range(9):
        soma += int(cpf[i]) * peso
        peso -= 1
    resto = soma % 11
    digito_verificador1 = 11 - resto if resto > 1 else 0

    # Calcula o segundo dígito verificador
    soma = 0
    peso = 11
    for i in range(10):
        soma += int(cpf[i]) * peso
        peso -= 1
    resto = soma % 11
    digito_verificador2 = 11 - resto if resto > 1 else 0

    if int(cpf[9]) == digito_verificador1 and int(cpf[10]) == digito_verificador2:
        return True
    else:
        return False

def senha_segura(senha):
    if len(senha) < 8:
        return False
    if not re.search(r'[A-Z]', senha) or not re.search(r'[a-z]', senha) or not re.search(r'[0-9]', senha):
        return False
    else:
        return True

def cifra_cesar(texto,):
    texto_cifrado = ""
    for caractere in texto:
        if 'A' <= caractere <= 'Z':
            novo_caractere = chr(((ord(caractere) - ord('A') + 10) % 26) + ord('A'))
        elif 'a' <= caractere <= 'z':
            novo_caractere = chr(((ord(caractere) - ord('a') + 10) % 26) + ord('a'))
        else:
            novo_caractere = caractere
        texto_cifrado += novo_caractere
    return texto_cifrado

cpf = input("Digite um CPF para validar: ")
senha = input("Digite uma senha para verificar se é segura: ")

if valida_cpf(cpf):
    print("CPF válido.")
else:
    print("CPF inválido.")

if senha_segura(senha):
    print("A senha é segura.")
else:
    print("A senha não é segura.")

senha_criptografada = cifra_cesar(senha, 10)
senha_descriptografada = cifra_cesar(senha_criptografada, -10)

print("Senha original:", senha)
print("Senha criptografada:", senha_criptografada)
print("Senha descriptografada:", senha_descriptografada)
