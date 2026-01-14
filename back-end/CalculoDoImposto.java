import java.util.Scanner;

public class CalculoDoImposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Infome o valor do salario bruto:");
        double salarioBruto = scanner.nextDouble();
        
        double vIr = salarioBruto * 0.05;
        double vInss = salarioBruto * 0.11;
        double vsalarioLiquido = salarioBruto - vIr - vInss;

         System.out.printf("IR: R$ %.2f%n", vIr);
         System.out.printf("INSS: R$ %.2f%n", vInss);
         System.out.printf("Salario Liquido: R$ %.2f%n", vsalarioLiquido);
        scanner.close();
    }
}
