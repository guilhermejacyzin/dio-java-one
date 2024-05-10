package modMetodos;

public class Usuario {

    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();


        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal atual? " + smartTV.canal);
        System.out.println("Volume atual? " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status: TV ligada? " + smartTV.ligada);
        smartTV.desligar();
        System.out.println("Novo Status: TV ligada? " + smartTV.ligada);

        smartTV.ligar();
        System.out.println("Novo Status: TV ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();
        System.out.println("Novo Status: Volume TV? " + smartTV.volume);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        System.out.println("Novo Status: Volume TV? " + smartTV.volume);

        smartTV.aumentarVolume();
        System.out.println("Novo Status: Volume TV? " + smartTV.volume);

        System.out.println("Canal atual? " + smartTV.canal);
        smartTV.mudarCanal(13);
        System.out.println("Canal atual? " + smartTV.canal);
    }
}
