//Pegando os elementos com id do html
const display = document.getElementById("display");
const clear = document.getElementById("clear");
const back = document.getElementById("backspace");
const total = document.getElementById("total");



//Funções da calculadora
function totalDisplay(){ //Exibir o total
    display.value = eval(display.value);
}

function clearDisplay(){ //Limpar
    display.value = "";
}

function backSpace(){ //Apagar o ultima caractere do input
    display.value = display.value.slice(0,-1);
}

//Eventos de clique em teclas especificas
clear.addEventListener("click",()=>{
    clearDisplay();
})

back.addEventListener("click",()=>{
    backSpace();
});

total.addEventListener("click",()=>{
    //display.value = eval(display.value);
    totalDisplay();

});

//Adicionando eventos de clique em todos os botões numericos e operadores
//Convertendo html collection para uma array
buttons = [...document.getElementsByTagName("button")]; // o documents tag name retorna uma "coleção html" que por padrão não possui metodos de uma array(map, tamanho etc.).

for(let i = 2;i < buttons.length-1;i++){
    //adiciona um evento de clique padrão em todos os botões 
    buttons[i].addEventListener("click", function() {
        display.value += this.textContent;
    });
}

//Evnetos de teclado
const chars = "0123456789%/*-+.";
document.addEventListener("keydown",(key)=>{
    if (chars.includes(key.key)){
        display.value += key.key;
    }else if(key.key == "Backspace"){
        backSpace();
    }else if(key.key == "Enter"){
        totalDisplay();
    }
})