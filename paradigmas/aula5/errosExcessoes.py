try:
    resultado = 10/0
except ZeroDivisionError as e:
    print(f"Erro: {e}")
else:
    print("Nenhum erro ocorreu")
finally:
    print("Este código sempre será executado")

try:
    numero = int(input("Digite um número: "))
except ValueError as e:
    print("Erro: ",e)
else:
    print("Nenhum erro ocorreu, o número é: ",numero)
finally:
    print("Este código sempre será executado")


class MeuErroPersonalizado(Exception):
    def __init__(self,mensagem):
        self.mensagem = mensagem

try:
    raise MeuErroPersonalizado("Ocorreu um erro")
except MeuErroPersonalizado as e:
    print("Erro personalizado: ",e.mensagem)



def dividir(x,y):
    if y == 0:
        raise ValueError("Não foi possivel dividir por zero")
    return x/y

try:
    resultado = dividir(10,0)
except ValueError as e:
    print("Erro: ",e)

