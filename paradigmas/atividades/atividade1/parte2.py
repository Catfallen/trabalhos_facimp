
contador = 0

def incrementar_contador():
    global contador
    contador += 1
    messagem = "Hello World"
print(messagem) #Retorna um erro pois a variavel mensagem não é global
