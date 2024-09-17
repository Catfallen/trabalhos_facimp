
const a = document.getElementById("a");
const b = document.getElementById("b");
const total = document.getElementById("total");

function soma() {
    total.value = parseFloat(a.value) + parseFloat(b.value);
}
function subtracao() {
    total.value = parseFloat(a.value) - parseFloat(b.value);
}
function multiplicar() {
    total.value = parseFloat(a.value) * parseFloat(b.value);
}
function divisao() {
    total.value = parseFloat(a.value) / parseFloat(b.value);
}

function limpar() {
    total.value = "";
    a.value = "";
    b.value = "";
}