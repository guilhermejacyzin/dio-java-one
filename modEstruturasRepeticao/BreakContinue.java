package modEstruturasRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        //Para no 3
        for (int numero = 1; numero <= 10; numero++) {
            if (numero ==3)
                break;
            System.out.println(numero);
        }

        //Pula o 3
        System.out.println("------------------------");
        for (int numeros = 1; numeros <= 10; numeros++) {
            if (numeros ==3)
                continue;
            System.out.println(numeros);
        }












        input.close();
    }
}
