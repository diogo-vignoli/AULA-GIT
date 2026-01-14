import java.util.Scanner;


public class ComissaoAReceber {
    public static void main(String[] args) {
        
          Scanner scanner = new Scanner (System.in);
        System.out.println("Infome o salario do vendedor:");
        double salario = scanner.nextDouble();
        System.out.println("Infome o total de vendas do vendedor:");
        double vendas = scanner.nextDouble();

         double multi = salario + (vendas * 0.15);

         System.out.printf("O valor foi: R$ %.2f%n", multi);
        scanner.close();

    }
    
}
