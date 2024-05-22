package modEstruturasRepeticao;
import java.util.concurrent.ThreadLocalRandom;

public class FluxoWhile {
    public static void main(String[] args) {
        //Enquanto uma condição de While For Válida, o bloco será executado


        //while enquanto a expressão aqui for verdadeira, o bloco abaixo é executado

        double mesada = 50.0;
        //enquando mesada for maior que zero
        while (mesada > 0) {
            //joãozinho pega um doce com um valor aleatório
            Double valorDoce = valorAleatorio();
            //se o valor do doce for MAIOR que a mesada
            if(valorDoce > mesada)
                //valor do doce é igual a mesada (automaticamente/adaptação)
                valorDoce = mesada;

            //imprime o resultado da chave abaixo
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            //mesada igual a mesada MENOS (-) valor do doce
            mesada -= valorDoce;

        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces");


    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
}
