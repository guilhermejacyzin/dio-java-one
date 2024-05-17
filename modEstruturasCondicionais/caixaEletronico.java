package modEstruturasCondicionais;

import java.util.Locale;

public class caixaEletronico {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double saldo = 25.0;
        double valorSolicitado = 22.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo atual: " + saldo);


    }
}
