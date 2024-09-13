

function iniciar(){
    let a,b,op;
    a = window.prompt("Informe o primeiro valor: ");
    b = window.prompt("Informe o segundo valor: ");
    op = window.prompt("Informe a operação: ");
    //window.alert(eval(a+op+b)); //Com apenas uma linha da pra calcular sem o if e else.
    
    //O window.prompt por padrão retorna uma string por isso é preciso converter para "float".
    a = parseFloat(a);
    b = parseFloat(b);
    
    if (op == "+"){
        window.alert(a+b);
    }else if (op == "-"){
        window.alert(a-b);
    }else if (op == "*"){
        window.alert(a*b);
    }else if (op == "/"){
        window.alert(a/b);
    }else{
        window.alert("Operação inválida.")
    }
}