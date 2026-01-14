
import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Informe a primeira nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Informe a segunda nota:");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2; 

        System.out.printf("A media calculada foi: %.2f%n", media);
        scanner.close();

    }
}
