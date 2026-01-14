import java.util.Scanner;


public class ConsumoDoAutomovel {
    public static void main(String[] args) {
           Scanner scanner = new Scanner (System.in);
        System.out.println("Infome a distancia percorrida:");
        double distancia = scanner.nextDouble();
        System.out.println("Informe o total consumido do combustivel:");
        double litros = scanner.nextDouble();

         double div = distancia / litros;

         System.out.printf ("Consumo médio é %.3f",div);

        scanner.close();
    }
}
