import java.util.Scanner;

public class PromocaoDaLoja {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print( "Informe o valor do produto 1:");
        int p1 = scanner.nextInt();
        System.out.print( "Informe o valor do produto 2:");
        int p2 = scanner.nextInt();
        System.out.print( "Informe o valor do produto 3:");
        int p3 = scanner.nextInt();
      
        double vcompra = p1 + p2 + (p3/2);
              

        System.out.printf("Valor da compra: R$ %.2f%n", vcompra);
        
    }
    }

