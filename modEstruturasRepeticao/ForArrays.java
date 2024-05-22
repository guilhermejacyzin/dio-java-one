package modEstruturasRepeticao;

public class ForArrays {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

                //Em arrays o índice inicia em ZERO
                for (int x=0; x < alunos.length; x++) {
                    System.out.println("O aluno no índice " + x + " é " + alunos[x]);
                }

                //Forma abreviada

        for (String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno);
        }

        for (String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno);
        }
    }
}
