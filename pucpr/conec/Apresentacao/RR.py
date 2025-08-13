from collections import deque

class Processo:
    def __init__(self, pid, arrival, burst):
        self.pid = pid
        self.arrival = arrival
        self.burst = burst
        self.restante = burst
        self.waiting = 0
        self.turnaround = 0
        self.finalizado = False

n = int(input("Quantos processos? "))
processos = []

for i in range(n):
    chegada = int(input(f"Tempo de chegada do processo P{i+1}: "))
    burst = int(input(f"Burst (tempo de CPU) de P{i+1}: "))
    processos.append(Processo(i+1, chegada, burst))

quantum = int(input("Informe o quantum: "))

# processos por tempo de chegada
processos.sort(key=lambda p: p.arrival)


tempo = 0
fila = deque()
pronto_index = 0  
linha_tempo = []


while True:
    # colcocar processos na fila 
    while pronto_index < n and processos[pronto_index].arrival <= tempo:
        fila.append(processos[pronto_index])
        pronto_index += 1

    if not fila:
        if pronto_index < n:
            tempo = processos[pronto_index].arrival  # vaii pro prox proces
            continue
        else:
            break  

    atual = fila.popleft()
    uso_cpu = min(quantum, atual.restante)
    linha_tempo.append(f"P{atual.pid} [{tempo}-{tempo + uso_cpu}]")
    tempo += uso_cpu
    atual.restante -= uso_cpu

    # se chegar processos durante a execucao atual 
    while pronto_index < n and processos[pronto_index].arrival <= tempo:
        fila.append(processos[pronto_index])
        pronto_index += 1

    if atual.restante == 0:
        atual.finalizado = True
        atual.turnaround = tempo - atual.arrival
        atual.waiting = atual.turnaround - atual.burst
    else:
        fila.append(atual)  # volta pro final da fila

print("\n--- Resultados ---")
total_wait = 0
total_turn = 0
for p in sorted(processos, key=lambda x: x.pid):
    print(f"Processo P{p.pid} | Espera: {p.waiting} | Turnaround: {p.turnaround}")
    total_wait += p.waiting
    total_turn += p.turnaround

print(f"\nTempo médio de espera: {total_wait / n:.2f}")
print(f"Tempo médio de turnaround: {total_turn / n:.2f}")

print("\n--- Linha do Tempo  ---") 
print(" ---".join(linha_tempo))
