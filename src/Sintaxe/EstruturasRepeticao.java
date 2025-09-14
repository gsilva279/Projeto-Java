package Sintaxe;

public class EstruturasRepeticao {
    public static void main(String[] args) {
        //for
        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
                System.out.println("Contando carneirinhos: " + carneirinhos);
        }
        System.out.println("Todos os carneirinhos foram contados!");

        //for each e arrays
        String nomes [] = {"Ana", "Maria", "José", "Pedro"};
        // for(int x =0; x < nomes.length; x++){
        //     System.out.println("Nome: " + nomes[x]);
        // }
        for(String nome : nomes){
            System.out.println("Nome: " + nome);
        }

    //while
     int num = 1;
     while(num <= 5){
         System.out.println("While: " + num);
         num++;
     }

    //do while
    int num2 = 1;
    do{
        System.out.println("doWhile: " + num2);
        num2++;
    } while (num2 <= 5);
}
    }

