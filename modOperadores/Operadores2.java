package modOperadores;

public class Operadores2 {
    public static void main(String[] args) {

        System.out.println("Operadores Unários");

        int numero = 5;

        System.out.println(numero);

//        Transformando em negativo NESTA impressão
        System.out.println(- numero);

//        O operador de negação não afeta a variável principal
        System.out.println(numero);

//        O que podemos fazer é dizer que ele é igual a ele negativo
        numero = - numero;
        System.out.println(numero);

//        Agora posso deixá-lo positivo novamente
        numero = numero * -1;

        System.out.println(numero);


    }
}
