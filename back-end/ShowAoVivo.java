import java.util.Scanner;

public class ShowAoVivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Infome o valor da hora do show:");
        double valorHora = scanner.nextDouble();
        System.out.println("Infome a distancia em KM:");
        double distanciakm = scanner.nextDouble();
        System.out.println("Infome a quantidade de horas do show:");
        double qtdHoras = scanner.nextDouble();

         double show = valorHora*qtdHoras;
         double vshow = show + 50*distanciakm;
         double vfrete = 50*distanciakm*0.35;

         System.out.printf("Valor do Show: R$ %.2f%n", vshow);
         System.out.printf("Valor do Frete: R$ %.2f%n", vfrete);
        scanner.close();
    }
}
