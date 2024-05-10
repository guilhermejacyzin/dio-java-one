package modOperadores;

public class Operadores7 {
    public static void main(String[] args) {

//    Operadores Lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;
        boolean condicao3 = true;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("uma das duas condições é verdadeira");
        }

        if (condicao1 && ( 7 > 4 )) {
            System.out.println("As duas condições são verdadeiras");
        }

        System.out.println("fim");

    }
}
