// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculo de Media");
        double n1,n2,n3;
        System.out.println("Informe a primeira nota");
        n1 = sc.nextDouble();
        System.out.println("Informe a segunda nota");
        n2 = sc.nextDouble();
        System.out.println("Informe a terceira nota");
        n3 = sc.nextDouble();
        
        double media = (n1+n2+n3)/3;
        System.out.println("Tota: "+media);
        
    }
}