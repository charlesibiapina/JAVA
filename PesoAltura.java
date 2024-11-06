import java.util.Scanner;

public class PesoAltura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso do usuario: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a altura do usuario: ");
        double altura = scanner.nextDouble();
        double imc = peso/(altura * altura);
        System.out.printf("O IMC do usuario é: %.2f\n ", imc);
        scanner.close();
    }

}