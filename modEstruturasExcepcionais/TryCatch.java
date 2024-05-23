package modEstruturasExcepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        //Tratando erros com try catch

        try {
            System.out.println("Digite o seu nome");
            String nome = input.next();

            System.out.println("Digite o seu sobrenome");
            String sobrenome = input.next();

            System.out.println("Digite a sua idade");
            int idade = input.nextInt();

            System.out.println("Digite a sua altura");
            double altura = input.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Mina altura é " + altura + "cm");
            input.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }

    }
}
