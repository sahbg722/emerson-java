import java.util.Scanner;

public class notas{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Soliocitar o númerode notas
    System.out.print("Digite o número de alunos!");
    int numerodealunos = scanner.nextInt();

    //inicializar a variavel para a soma das notas do contador
    double soma = 0;

    // Lê as notas dos alunos usando um loop for
    for (int i = 0; i < numerodealunos; i++) {
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();
        soma = soma + nota;
    }
    double media = soma / numerodealunos;
    System.out.println("A media das notas é: " + media );
    scanner .close(); 

    }
}
