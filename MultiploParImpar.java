import java.util.Scanner;

public class MultiploParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        if (numero % 5 == 0) {
            System.out.println("É múltiplo de 5");
        } else {
            System.out.println("Não é múltiplo de 5");
        }

        if (numero % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }

        scanner.close();

    }
}















//public class MultiploParImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);
        scanner.close();
}
