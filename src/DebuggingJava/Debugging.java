package DebuggingJava;

public class Debugging {
    public static void main(String[] args) {
        Hello("José");
        Age(24);
    
    }

    public static void Hello(String name){
        System.out.println("Hello " + name);
    }

    public static int Age(int age){
        System.out.println("Age: " + age);
        return age;
    }

    public static int Cont(int cont){
        for(int i=1; i < 10; i++){
            System.out.println(i);
            cont = i;
        }
        return cont;
    }
}
