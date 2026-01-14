import java.util.Scanner;

public class CalculoJurosSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Infome o valor do emprestimo:");
        double valorEmprestimo = scanner.nextDouble();
        System.out.println("Infome o total de meses:");
        int qtdMeses = scanner.nextInt();

        double vjuros = (valorEmprestimo * 0.05 * qtdMeses);
         double vPago = valorEmprestimo + vjuros;

         System.out.printf("Total a ser pago: R$ %.2f%n", vPago);
        scanner.close();
  
    }
}
