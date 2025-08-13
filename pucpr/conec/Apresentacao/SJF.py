
processos = []
n = int(input("Quantos processos? "))

for i in range(n):
    burst = int(input(f"Burst do processo P{i+1}: "))
    processos.append((i+1, burst))  # (PID, burst)

# Coloca pelo burst time menor
processos.sort(key=lambda x: x[1])

tempo = 0
espera_total = 0
turnaround_total = 0
gantt = []

print("\nExecução:")
for pid, burst in processos:
    print(f"P{pid} executando de t={tempo} até t={tempo + burst}")
    gantt.append(f"P{pid} [{tempo}-{tempo + burst}]")
    espera_total += tempo
    tempo += burst
    turnaround_total += tempo

print(f"\nTempo médio de espera: {espera_total / n:.2f}")
print(f"Tempo médio de turnaround: {turnaround_total / n:.2f}")


print("\n--- Linha do Tempo ---")
print(" → ".join(gantt))
