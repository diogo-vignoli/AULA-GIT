import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Informe o salario fixo:");
        int salarioFixo = scanner.nextInt();
        System.out.print( "Informe o valor das vantagens:");
        int vantagens = scanner.nextInt();
         System.out.print( "Informe o valor dos descontos:");
        int descontos = scanner.nextInt();
      
        double salarioliquido = salarioFixo + vantagens - descontos;
              

        System.out.printf("Salário Líquido: R$ %.2f%n", salarioliquido);
        
        scanner.close();
    }
}
