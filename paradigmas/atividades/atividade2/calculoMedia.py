total = 0

for x in range(4):
    nota = float(input(f"Informe a nota {x}: "))
    total += nota

media = total/4

print(media)
if media >= 7:
    print("aprovado")
else:
    print(f"Reprovado")