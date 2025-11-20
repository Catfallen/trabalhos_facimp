let idade = 18;
if (idade >= 18){
    console.log(`Maior de idade: ${idade}`)
}else{
    console.log(`Menor de idaded: ${idade}`)
}


let dia = 3; // Número do dia da semana (1 = Domingo, 7 = Sábado)

switch (dia) {
    case 1:
        console.log("Domingo");
        break;
    case 2:
        console.log("Segunda-feira");
        break;
    case 3:
        console.log("Terça-feira");
        break;
    case 4:
        console.log("Quarta-feira");
        break;
    case 5:
        console.log("Quinta-feira");
        break;
    case 6:
        console.log("Sexta-feira");
        break;
    case 7:
        console.log("Sábado");
        break;
    default:
        console.log("Número inválido");
        break;
}


let frutas = ["Maçã","Banada","Laranja"];
let nomes = new Array("Welliton","Maria")

for (let i = 0;i<frutas.length;i++){
    console.log("Fruta: "+frutas[i]);
}

console.log("For each")
frutas.forEach(nome => console.log(nome));

let numeros = [1,2,3]

numeros.map((numero) =>{
    return numero *= 2;
})
idade = window.prompt("Informe a idade");