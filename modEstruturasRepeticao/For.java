package modEstruturasRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        for (int i = 0; i <= 20; i++) {
            System.out.println("Contando bodes Black Phillip's " + i);
        }
        System.out.println("Dormiii");

        input.close();
    }
}
