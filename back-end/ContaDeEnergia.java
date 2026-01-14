import java.util.Scanner;

public class ContaDeEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Informe o salario minimo:");
        int salarioMinimo = scanner.nextInt();
        System.out.print( "Informe a quantidade de quilowatt:");
        int kw = scanner.nextInt();
      
        double vkw = salarioMinimo * 0.001;
        double vconta = vkw * kw;
        double vdesc = vconta * 0.85;
        

        System.out.printf("Valor kw: R$ %.4f%n", vkw);
        System.out.printf("Valor da conta: R$ %.2f%n", vconta);
        System.out.printf("Valor com desconto:  R$ %.2f%n", vdesc);
        scanner.close();
    }
}
