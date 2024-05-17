package modEstruturasCondicionais;

public class resultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;


//        Essa condição precisa retornar true
        if(nota > 7) {
            System.out.println("Aprovado");
        }
//        Essa condição precisa retornar true ou false
        else if(nota >= 5 && nota < 7) {
            System.out.println("Prova Recuperação");
        }
//        Essa condição precisa retornar true ou false
        else {
            System.out.println("Reprovado");
        }
    }
}
