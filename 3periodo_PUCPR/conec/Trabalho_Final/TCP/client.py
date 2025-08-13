import socket
import threading

def receber_mensagens(cliente_socket):
    while True:
        try:
            mensagem = cliente_socket.recv(1024).decode('utf-8')
            if not mensagem:
                break
            print(mensagem)
        except:
            print("Erro ao receber mensagem. Conexão encerrada.")
            break

# Configurações de conexão
host = 'localhost'
porta = 12345

# Cria o socket do cliente (TCP)
cliente = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
cliente.connect((host, porta))

# Envia o nome do usuário ao servidor
nome = input("Digite seu nome/apelido: ")
cliente.send(nome.encode('utf-8'))

# Thread para ouvir mensagens do servidor enquanto o usuário digita
thread_receber = threading.Thread(target=receber_mensagens, args=(cliente,))
thread_receber.start()

# Loop para enviar mensagens digitadas
while True:
    mensagem = input()

    cliente.send(mensagem.encode('utf-8'))
    if mensagem.strip() == "/sair":
        break

# Fecha o socket e encerra o programa
cliente.close()
print("Conexão encerrada.")
