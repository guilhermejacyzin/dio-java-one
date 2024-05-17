package modEstruturasCondicionais;

public class switchCaseQuatro {
    public static void main(String[] args) {
        String plano = "T";

        switch (plano) {
            case "T": {
                System.out.println("5GB Youtube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram Grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }

//        Aqui ele entra no T e também faz todos os outros abaixo, já que não existe Break no caso
//        Estudar sobre continue, break e default
    }
}
