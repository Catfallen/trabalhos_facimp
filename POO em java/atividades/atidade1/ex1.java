// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.Locale;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora Simples");
        System.out.println("Informe o primeiro valor: ");
        double n1,n2;
        n1 = sc.nextDouble();
        System.out.println("Informe o segundo valor: ");
        n2 = sc.nextDouble();
        System.out.println("Operacao ");
        System.out.println("[1] Soma");
        System.out.println("[2] Subtracao");
        System.out.println("[3] Multiplicacao");
        System.out.println("[4] Divisao");
        System.out.println("Digite aqui: ");
        int op = sc.nextInt();
        double total;
        if(op == 1){
            total = n1+n2;
        }else if(op == 2){
            total = n1-n2;
        }else if(op == 3){
            total = n1*n2;
        }else if(op == 4){
            total = n1/n2;
        }else{
            System.out.println("Valor invalido");
        }
        System.out.println("Total: "+total);        
    }
}