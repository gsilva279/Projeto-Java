package Metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {
        //Instanciando a classe SmartTv
        SmartTv smartTv = new SmartTv();

        //Chamadados dos métodos desligar e ligar
        smartTv.ligar();
        smartTv.desligar();

        //Chamada dos métodos aumentar e diminuir volume
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume(); // volume = 26

        //Chamada dos métodos mudar o canal
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(10);

        //status da TV
        System.out.println("SmartTV Status: ");
        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal : " + smartTv.canal);
        System.out.println("Volume : " + smartTv.volume);
    }
}
