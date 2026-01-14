import java.util.Scanner;


public class DescontoDePrecos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Infome o nome do produto:");
        String produto = scanner.nextLine();
        System.out.println("Infome o valor do produto:");
        double valor = scanner.nextDouble();

        double reajuste = valor - (valor * 0.045);
        reajuste = Math.floor(reajuste * 100) / 100;
        System.out.printf("%s - R$ %.2f%n", produto, reajuste);
        // System.out.print (produto + " - " + reajuste);
        scanner.close();

    }
}
  
