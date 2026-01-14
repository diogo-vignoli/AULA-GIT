import java.util.Scanner;
public class ReajusteDePrecos {
    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
        System.out.println("Infome o nome do curso:");
        String curso = scanner.nextLine();
        System.out.println("Infome o valor do curso:");
        double valor = scanner.nextDouble();

        double reajuste = valor + (valor * 0.075);

        System.out.print (curso + " - " + reajuste);
        scanner.close();

    }
}
