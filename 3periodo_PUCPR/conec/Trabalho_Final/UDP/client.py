import socket
import threading

# Função para receber mensagens do servidor
def receber():
    while True:
        try:
            mensagem, _ = cliente.recvfrom(1024)
            print(mensagem.decode('utf-8'))
        except:
            break


nome = input("Digite seu nome: ")

# Criação do socket UDP
cliente = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
servidor = ('localhost', 12345)

# Envia primeira mensagem com o nome
cliente.sendto(f"{nome} entrou no chat.".encode('utf-8'), servidor)

# Inicia thread para escutar mensagens
threading.Thread(target=receber, daemon=True).start() #Essa thread é secundária. Se o programa principal (cliente) for fechado, pode matar essa thread sem dó por isso daemon = true 

# Loop principal para enviar mensagens
while True:
    texto = input()
    if texto == "/sair":
        cliente.sendto(f"{nome} saiu do chat. /sair".encode('utf-8'), servidor)
        break
    cliente.sendto(f"{nome}: {texto}".encode('utf-8'), servidor)

cliente.close()
print("Cliente encerrado.")
