import os

for count, filename in enumerate(os.listdir("meu_diretorio")):
	dst = f"arquivo_{str(count)}.txt"
	src = f"meu_diretorio/{filename}"
	dst = f"meu_diretorio/{dst}"
	os.rename(src,dst)
