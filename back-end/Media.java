
import java.util.Scanner;

public class Media { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Informe a nota da 1º Unidade: ");
        double unidade1 = scanner.nextDouble();
        System.out.print("Informe a nota da 2º Unidade: ");
        double unidade2 = scanner.nextDouble();
        System.out.print("Informe a nota da 3º Unidade: ");
        double unidade3 = scanner.nextDouble();
        System.out.print("Informe a nota da 4º Unidade: ");
        double unidade4 = scanner.nextDouble();

        double media = (unidade1 + unidade2 + unidade3 + unidade4) / 4; 

        System.out.printf("A media calculada foi: %.2f%n", media);
        scanner.close();
    }
    
}