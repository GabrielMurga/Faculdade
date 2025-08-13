import socket
import threading
# Função para receber e retransmitir mensagens
def receber_mensagens():
    while True: # o loop da escuta 
        try:
            mensagem, endereco = server_socket.recvfrom(1024) # nao entendi direito como ele pega esse emdereco n 
            texto = mensagem.decode('utf-8')

            # Se for novo cliente, adiciona à lista
            if endereco not in clientes:
                clientes.append(endereco)

            if texto.endswith("/sair"):
                print(f"{endereco} saiu.")
                if endereco in clientes:
                    clientes.remove(endereco)
                continue

            print(f"Recebido de {endereco}: {texto}")

            # Reenvia a mensagem para todos os outros clientes
            for cliente in clientes:
                if cliente != endereco:
                    server_socket.sendto(mensagem, cliente)

        except Exception as e:
            print(f"Erro: {e}")

# Criação do socket UDP
server_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
server_address = ('localhost', 12345)
server_socket.bind(server_address)

# Lista para armazenar os endereços dos clientes
clientes = []

print("Servidor UDP iniciado e aguardando mensagens...")

# Inicia a thread principal
threading.Thread(target=receber_mensagens).start()
