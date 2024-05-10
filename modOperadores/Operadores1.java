package modOperadores;

import java.util.Date;

public class Operadores1 {
    public static void main(String[] args) {

        System.out.println("Operadores Gerais");

        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date Nascimento = new Date();

//        O sinal de = é sempre um sinal de atribuição, diferentemente do sinal de ==
//        Já os operadores aritméticos sempre serão os mesmos do ideal da programação, que são: + - / *

        double soma = 10.5 + 15.7;
        int subtracao = 11 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

//        Operador de adição concatena
        String nomeCompleto = "Linguagem " + "Java";

        System.out.println(nomeCompleto);

        String concatenacao = "?";
        System.out.println("concatenação = " + concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println("concatenação = " + concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println("concatenação = " + concatenacao);

        concatenacao = "1"+1+1+"1";
        System.out.println("concatenação = " + concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println("concatenação = " + concatenacao);

    }
}
