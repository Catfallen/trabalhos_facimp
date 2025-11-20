import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor_emprestado,taxa_juros;
        int meses;
        System.out.println("Calculo de juros simples");
        System.out.println("Valor emprestado: ");
        valor_emprestado = sc.nextDouble();
        System.out.println("Taxa de juros");
        taxa_juros = sc.nextDouble();
        System.out.println("Meses");
        meses = sc.nextInt();
        
        double juros = (valor_emprestado*taxa_juros*meses)/100;
        System.out.println("R$Total: "+juros);
    }
}