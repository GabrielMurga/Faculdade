# Definição das variáveis binárias
a = 0b00001111  # 15 em decimal
b = 0b11110000  # 240 em decimal
c = 0b10101010  # 170 em decimal

# Operações bitwise
res_and_ab = a & b  # AND entre a e b
res_and_ac = a & c  # AND entre a e c
res_and_bc = b & c  # AND entre b e c

res_or_ab = a | b   # OR entre a e b
res_or_ac = a | c   # OR entre a e c
res_or_bc = b | c   # OR entre b e c

res_xor_ca = c ^ a  # XOR entre c e a

res_shift_a = a >> 1  # Shift Right em a por 1 bit
res_shift_b = b >> 2  # Shift Right em b por 2 bits
res_shift_c = c >> 3  # Shift Right em c por 3 bits

# Exibir resultados em binário
print(f"a & b  = {bin(res_and_ab)[2:].zfill(8)}")
print(f"a & c  = {bin(res_and_ac)[2:].zfill(8)}")
print(f"b & c  = {bin(res_and_bc)[2:].zfill(8)}")

print(f"a | b  = {bin(res_or_ab)[2:].zfill(8)}")
print(f"a | c  = {bin(res_or_ac)[2:].zfill(8)}")
print(f"b | c  = {bin(res_or_bc)[2:].zfill(8)}")

print(f"c ^ a  = {bin(res_xor_ca)[2:].zfill(8)}")

print(f"a >> 1 = {bin(res_shift_a)[2:].zfill(8)}")
print(f"b >> 2 = {bin(res_shift_b)[2:].zfill(8)}")
print(f"c >> 3 = {bin(res_shift_c)[2:].zfill(8)}")
