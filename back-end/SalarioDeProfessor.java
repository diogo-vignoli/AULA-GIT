import java.util.Scanner;

public class SalarioDeProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Infome a quantidade de horas trabalhadas:");
        double qtdHoras = scanner.nextDouble();
        System.out.println("Infome o valor das horas trabalhadas:");
        double valorHoras = scanner.nextDouble();

         double multi = qtdHoras * valorHoras;

         System.out.printf("O valor calculado foi: R$ 20%.2f%n", multi);
        scanner.close();



        
    }
}
