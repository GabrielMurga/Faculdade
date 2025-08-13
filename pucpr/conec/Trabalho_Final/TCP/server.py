import socket
import threading

# Lista de clientes conectados
clientes = []

# Função para enviar mensagem a todos os outros clientes
def broadcast(mensagem, cliente_origem):
    for cliente in clientes:
        if cliente != cliente_origem:
            try:
                cliente.send(mensagem)
            except:
                clientes.remove(cliente)

# Função que lida com cada cliente
def lidar_com_cliente(cliente, endereco):
    print(f"[+] Nova conexão de {endereco}")
    nome = cliente.recv(1024).decode('utf-8')  # Recebe o nome do cliente
    mensagem_entrada = f"{nome} entrou no chat.\n".encode('utf-8')
    broadcast(mensagem_entrada, cliente)

    while True:
        try:
            mensagem = cliente.recv(1024)
            if mensagem.decode('utf-8').strip() == "/sair":
                cliente.send("Você saiu do chat.".encode('utf-8'))
                cliente.close()
                clientes.remove(cliente)
                broadcast(f"{nome} saiu do chat.\n".encode('utf-8'), cliente)
                break
            broadcast(f"{nome}: ".encode('utf-8') + mensagem, cliente)
        except:
            cliente.close()
            if cliente in clientes:
                clientes.remove(cliente)
            broadcast(f"{nome} caiu do chat.\n".encode('utf-8'), cliente)
            break

# Configurações do servidor
host = 'localhost'
porta = 12345

servidor = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
servidor.bind((host, porta))

servidor.listen()

print(f"Servidor TCP escutando em {host}:{porta}...")

while True:
    cliente, endereco = servidor.accept()
    clientes.append(cliente)
    thread = threading.Thread(target=lidar_com_cliente, args=(cliente, endereco))
    thread.start()
