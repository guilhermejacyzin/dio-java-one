package modOperadores;

public class Operadores6 {
    public static void main(String[] args) {
//        Operadores Relacionais
    String nomeUm = "GUILHERME";
    String nomeDois = "GUILHERME";
    String nomeTres = new String("GUILHERME");

    System.out.println(nomeUm==nomeDois);
    System.out.println(nomeUm==nomeTres);

//    Usando método equals
        System.out.println(nomeUm.equals(nomeDois));

    int  numero1 = 1;
    int  numero2 = 2;


//    A condição só será executada se for verdade
    if(numero1 < numero2) {
        System.out.println("a nossa condição é verdadeira");
    }
//    Aqui não é executado, pois não é verdadeiro
    if(numero1 == numero2) {
        System.out.println("a nossa condição é verdadeira");
    }

    boolean simNao = numero1 == numero2;
    System.out.println("numeroUm é igual a numeroDois? " + simNao);

    boolean simNao2 = numero1 != numero2;
    System.out.println("numeroUm é diferente de numeroDois? " + simNao2);





    }
}
