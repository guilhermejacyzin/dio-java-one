package modVariaveis;

import java.util.Locale;
import java.util.Scanner;

public class TiposVariaveis {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double salarioMinino = 2400.00;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        System.out.println(numero);

//        Final é Utilizado para não mudar o valor da variável
//        Por convenção a variável é escrita completamente em caixa alta
        final double VALOR_DE_PI = 3.14;

        System.out.println(VALOR_DE_PI);


    }
}
