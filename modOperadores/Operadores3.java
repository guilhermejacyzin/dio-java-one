package modOperadores;

public class Operadores3 {
    public static void main(String[] args) {

        System.out.println("Incremento de números");

//        x repetição
        int numero = 5;

//        Obtendo o numero mais 2
        numero = numero + 2;

        System.out.println(numero);

//        Incrementando 2
        numero += 2;
        System.out.println(numero);

//        Incrementando 1
        numero++;
        System.out.println(numero);

//        Incrementando número após a primeira impressão
        System.out.println(numero++);
        System.out.println(numero);

//        Incrementando já na impressão
        System.out.println(++numero);

//        Para DECREMENTAR é só utilizar o sinal de menos (-)
//        Decrementando na impressão
        System.out.println(--numero);

//        Decrementando pós impressão
        System.out.println(numero--);
        System.out.println(numero);

//        Decrementando 2
        numero -= 2;
        System.out.println(numero);

//        Invertendo a variável
        boolean variavel = true;
//        Variável comum
        System.out.println(variavel);
//        Variável invertida
        System.out.println(!variavel);

//        Variável não verdadeira
        variavel = !variavel;
        System.out.println(variavel);

    }

}
