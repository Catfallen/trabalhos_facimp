// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float peso,altura,imc;
        System.out.println("Informe seu peso: ");
        peso = sc.nextFloat();
        System.out.println("Informe sua altura: ");
        altura = sc.nextFloat();
        
        imc = peso / (altura * altura);
        
        System.out.println("Total: "+imc);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30.0 && imc <= 34.99) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35.0 && imc <= 39.99) {
            System.out.println("Obesidade grau II (severa)");
        } else if (imc >= 40.0) {
            System.out.println("Obesidade grau III (morbida)");
        }
        
    }
}