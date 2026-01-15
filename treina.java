import java.util.Scanner;

public class treina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Infome o seu salario atual:");
        double salario = scanner.nextDouble();

        double reajuste1 = 0.12;
        double reajuste2 = 0.08;
        double reajuste3 = 0.05;
        double novosalario = 0;

        System.out.printf("O salário original: R$ %.2f%n", salario);

        if (salario <= 3500) {
            novosalario = salario * (1 + reajuste1);
            System.out.println("O percentual de aumento aplicado " + reajuste1 * 100 + "%");
        } else if (salario <= 8000) {
            novosalario = salario * (1 + reajuste2);
            System.out.println("O percentual de aumento aplicado " + reajuste2 * 100 + "%");
        } else {
            novosalario = salario * (1 + reajuste3);
            System.out.println("O percentual de aumento aplicado " + reajuste3 * 100 + "%");
        }

        double aumento = novosalario - salario;
        System.out.printf("O valor do aumento: R$ %.2f%n", aumento);
        System.out.printf("O novo salario R$ %.2f%n", novosalario);

        scanner.close();
    }
}