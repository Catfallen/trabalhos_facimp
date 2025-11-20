
numero = int(input("Digite um número: "))
if numero > 10:
    print("O número é maior que 10: ",numero)
else:
    print("O número é menor ou igual a 10: ",numero)

if (numero := int(input("Digite um número: "))) > 10:
    print




dados = input("Digite algo: ")
while dados != "sair":
    print(f"Você digitou: {dados}")
    dados = input("Digite algo: ")

while(dados := input("Digite algo: ")) != "sair":
    print(f"Você digitou: {dados}")