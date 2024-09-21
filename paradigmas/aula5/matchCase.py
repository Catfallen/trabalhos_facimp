

x = "preto"
match x:
    case 0:
        print("O valor é zero")
    case 1:
        print("O valor é um")
    case "preto":
        print(True)
    case _:
        print("Outro valor")


