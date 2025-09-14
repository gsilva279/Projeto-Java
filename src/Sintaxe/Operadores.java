package Sintaxe;

public class Operadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean c = true;

        // Operadores aritméticos
        int soma = a + b; // 30
        int subtracao = a - b; // -10
        int multiplicacao = a * b; // 200
        double divisao = a / b; // 0.5
        int resto = b % a; // 0
        a = a ++; // 11
        b = b --; // 19

        // Operadores únarios
        a ++; // 12
        b --; // 18
        ++ a; // 13 (o valor é incrementado antes de ser utilizado)
        -- b; // 17 (o valor é decrementado antes de ser utilizado)
         c = !c; // false (negação)

        //operador ternário
        String d = a > b ? "a é maior que b" : "b é maior que a";
        int num1 = 7 < 2 ? 8 : 9; // 9

        // Operadores de relacionais 
        boolean e = a > b; // false
        boolean f = a < b; // true
        boolean g = a >= b; // false
        boolean h = a <= b; // true
        boolean i = a == b; // false

        //.equals() é um método que compara o conteúdo de duas variáveis
        String nome1 = "Maria";
        String nome2 = "Maria";
        boolean j = nome1.equals(nome2); // true

        // Operadores lógicos
        boolean k = a > b && a < b; // false
        boolean l = a > b || a < b; // true
        boolean m = a > b && a < b || a == b; // false

    }
}
