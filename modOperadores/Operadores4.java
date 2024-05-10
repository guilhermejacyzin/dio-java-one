package modOperadores;

public class Operadores4 {
    public static void main(String[] args) {
//        Operador Ternario
        int a, b;
        a = 5;
        b = 6;
        String resultado = "";

        if (a == b) {
            resultado = "verdadeiro";
        }
        else {
            resultado = "falso";
        }

        System.out.println(resultado);

        String resultado2 = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado2);

        int resultado3 = a == b ? 1 : 0;

        System.out.println(resultado3);
    }
}
