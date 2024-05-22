package modEstruturasRepeticao;
import java.util.Random;

public class FluxoDoWhile {
    public static void main(String[] args) {
        //do
//        {
            //comando que será executado até que a expressão da validação torne-se falsa
//        }
        System.out.println("Discando...");
        do {
            //executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");
            //enquanto estiver tocando
        } while(tocando());

        // ao atender diz alô
        System.out.println("Alô!!!");


    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }


}
