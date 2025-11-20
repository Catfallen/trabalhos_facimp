pessoas = ["Mateus","Italo","Markim"]
ordenado = sorted(pessoas,key=lambda pessoa:len(pessoa),reverse=True)
print(ordenado)



numeros = list(range(0,10))
pares = list(filter(lambda x: x % 2 == 0, numeros))
#print(list(pares))


numeros = list(range(0,20))
quadrados = list(map(lambda x : x **2,numeros))
print(quadrados)
