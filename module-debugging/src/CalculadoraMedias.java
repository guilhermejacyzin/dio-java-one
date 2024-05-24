import java.util.Locale;
import java.util.Scanner;

public class CalculadoraMedias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        int media = calculaMediaDaTuma(alunos, input);

        System.out.printf("Media da turma %d", media);

    }

    public static int calculaMediaDaTuma(String[] alunos, Scanner input) {
        int soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = input.nextInt();
            soma += nota;
        }

        return soma / alunos.length;

    }
}
