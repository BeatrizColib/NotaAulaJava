import java.util.Scanner;

public class Aluno_main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in); //para string
        Scanner sc = new Scanner(System.in);    //para num

        System.out.print("Nome do/a aluno/a: ");
        aluno.nome = scanner.nextLine();

        System.out.print("Quantas notas deseja cadastrar: ");
        aluno.quantidade_notas = sc.nextInt();
        sc.nextLine();

        for (int inicio = 1; inicio <= aluno.quantidade_notas; inicio ++) {
            System.out.print("Digite a Nota "+ (inicio) + " (De 0 a 100): ");
            aluno.nota = sc.nextDouble();
            aluno.somar_notas();
        }
        sc.nextLine();

        aluno.calcular_media();
        aluno.verificar_situacao();
        System.out.println("A média foi: " + aluno.media + ". " + aluno.nome + " está " + aluno.situacao);

        scanner.close();
        sc.close();
    }
}
