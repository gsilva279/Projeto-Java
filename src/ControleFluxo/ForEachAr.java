package ControleFluxo;

public class ForEachAr {
    public static void main(String[] args) {
        gatinhos();
    }

    public static void gatinhos(){
        String[] gatos = {"Gary", "Patty", "Barry"};
        int cont = 0;
        for (String gato : gatos){
            System.out.println("Gato " + cont + ":" + gato);
            cont++;
        }
    }
}
