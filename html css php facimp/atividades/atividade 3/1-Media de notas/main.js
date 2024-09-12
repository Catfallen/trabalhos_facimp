const h1 = document.getElementById("total");

function calculoMedia(){
    let total = 0;
    for(let i = 0;i<4;i++){
        total+= parseFloat(window.prompt("Informe a nota "+i+": "))
    }

    let media = total/4
    h1.innerHTML = media.toString();
}


