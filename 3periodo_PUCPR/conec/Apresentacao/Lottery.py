import random

n = int(input("Quantos processos? "))
processos = []

for i in range(n):
    burst = int(input(f"Burst do processo P{i+1}: "))
    tickets = int(input(f"Número de bilhetes de P{i+1}: "))
    processos.append({'pid': i+1, 'burst': burst, 'tickets': tickets, 'executado': False})

total_tickets = sum(p['tickets'] for p in processos)
tempo = 0
turnaround_total = 0
espera_total = 0
gantt = []

print("\nExecução (ordem definida por sorteio):")
while any(not p['executado'] for p in processos):
    bilhete_sorteado = random.randint(1, total_tickets)
    print(f"O bilhete sorteado foi {bilhete_sorteado}")
    contador = 0

    for p in processos:
        if p['executado']:
            continue
        contador += p['tickets']
        if contador >= bilhete_sorteado:
            print(f"P{p['pid']} executando de t={tempo} até t={tempo + p['burst']}")
            gantt.append(f"P{p['pid']} [{tempo}-{tempo + p['burst']}]")
            espera_total += tempo
            tempo += p['burst']
            turnaround_total += tempo
            p['executado'] = True
            total_tickets -= p['tickets']
            break

print(f"\nTempo médio de espera: {espera_total / n:.2f}")
print(f"Tempo médio de turnaround: {turnaround_total / n:.2f}")

# Linha do Tempo 
print("\n--- Linha do Tempo ---")
print(" → ".join(gantt))
