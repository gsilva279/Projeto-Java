package Horas;
import java.time.LocalDateTime; //class para pegar a hora local 
import java.time.format.DateTimeFormatter;

public class Horas {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter Formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String agoraFormatado = agora.format(Formatado);


        System.out.println("Hora: " + agoraFormatado);
    }
}
