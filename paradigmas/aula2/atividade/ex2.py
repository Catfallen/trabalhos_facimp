contador = 0

def increment(c):
    c = c + 1
    mensagem = "o valor foi adicionado"
    print(c)

#print(mensagem) não é possível pois mensagem é uma variavel interna da função increment
increment(contador)#adiciona 1
