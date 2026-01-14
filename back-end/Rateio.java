import java.util.Scanner;

public class Rateio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Informe a quantidade de apartamento:");
        int qtdAptos = scanner.nextInt();
        System.out.print( "Informe o valor de energia:");
        int valorEnergia = scanner.nextInt();
         System.out.print( "Informe o valor de agua:");
        int valorAgua = scanner.nextInt();
      
        double vrateio = (valorAgua+valorEnergia)/qtdAptos;
              

        System.out.printf("Valor rateio: R$ %.2f%n", vrateio);
        
    }
}
