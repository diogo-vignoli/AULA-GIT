import java.util.Scanner;

public class EstatisticaConcursoPublico {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print( "Informe a quantidade de homens:");
        int homens = scanner.nextInt();
        System.out.print( "Informe a quantidade de mulheres:");
        int mulheres = scanner.nextInt();
         System.out.print( "Informe a quantidade de ausentes:");
        int ausentes = scanner.nextInt();

        int soma = homens + mulheres + ausentes;
        double p1 = (double) homens * 100 / soma;
        double p2 = (double) ausentes * 100 / (homens + mulheres);
        

        System.out.printf("P1: %.4f%% ", p1);
        System.out.printf("P2: %.4f%% ", p2);
        scanner.close();
   } 
}
