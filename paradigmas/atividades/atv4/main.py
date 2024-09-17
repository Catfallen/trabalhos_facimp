

class Empregado:
    def __init__(self,nome,salario_base):
        self.nome = nome
        self.salario_base = salario_base
    def CalculoSalario(self):
        ...

class Gerente(Empregado):
    def calculoSalario(self):
        return f"Salario {self.salario_base}"

class Vendedor(Empregado):
    def CalculoSalario(self,comissao):
        return f"Salario {self.salario_base+comissao}"                    


gerente1 = Gerente("Markim",10000000)
vendedor1 = Vendedor("Vendedor",1)

print(vendedor1.CalculoSalario(500000000))

