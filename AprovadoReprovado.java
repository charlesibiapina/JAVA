import java.util.Scanner;

public class AprovadoReprovado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota do aluno (0 a 10): ");
        double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (nota >= 5) {
            System.out.println("Aluno em recuperação!");
        }  else {
            System.out.println("Aluno reprovado!");
        }  
        
        scanner.close();
     } 

}
