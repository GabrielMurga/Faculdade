from collections import deque
import random

def simulador_fifo(paginas, tamanho_memoria):
    memoria_ram = deque()  
    disco = set(paginas)   # Simula o disco: todas as páginas possíveis estão aqui

    # Pré-carregando algumas páginas aleatórias na RAM
    paginas_iniciais = random.sample(disco, min(tamanho_memoria, len(disco)))
    for p in paginas_iniciais:
        memoria_ram.append(p)

    print(f"***Estado inicial da RAM: {list(memoria_ram)}****\n")
    print("Simulação FIFO com Disco Virtual")
    print(f"Meu possue as seguintes opções: {list(disco)}")
    print(f"Tamanho da RAM: {tamanho_memoria}")
    print(f"Referências de páginas (memória virtual): {paginas}\n")

    for pagina in paginas:
        print(f"Tentando acessar página {pagina} :")
        if pagina not in memoria_ram:
            print(f"Page Fault! Página {pagina} não está na RAM.")
            if len(memoria_ram) == tamanho_memoria:
                removida = memoria_ram.popleft()
                print(f"RAM cheia. Página {removida} foi removida da RAM.")
            memoria_ram.append(pagina)
            print(f"Página {pagina} foi carregada do disco para a RAM.")
        else:
            print(f"Opa! Eu, página {pagina}, já estou na RAM.")
        
        print("----------------------------------------------------------")
        print("***********************************************")
        print(f"Estado atual da RAM: {list(memoria_ram)}\n")
        print("***********************************************")

if __name__ == "__main__":
    sequencia_de_acessos = input("Digite a sequência de páginas separadas por espaço: ")
    paginas = list(map(int, sequencia_de_acessos.strip().split()))
    tamanho = int(input("Digite o tamanho da memória virtual: "))
    simulador_fifo(paginas, tamanho)
