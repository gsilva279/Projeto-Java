package StreamAPI;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class steamApipratica {
   public static void main(String[] args) {

      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
      List<String> letras = Arrays.asList("a", "b", "c");

      // Consumer
      Consumer<Integer> imprimir = numero -> System.out.println(numero);
      numeros.stream().forEach(imprimir);

      Consumer<String> exibirLetras = nome -> System.out.println(letras);
      letras.stream().forEach(exibirLetras);

      // Supplier
      Supplier<String> fruta = () -> "Maçã";
      List<String> listaFrutas = Stream.generate(fruta)
            .limit(3)
            .collect(Collectors.toList());
      listaFrutas.forEach(System.out::println);

      // Fuction
      List<String> cores = Arrays.asList("Azul", "roxo", "verde");
      // transforma emm maiúsculas
      Function<String, String> maiuscula = cor -> cor.toUpperCase();
      List<String> coresMaiusculas = cores.stream()
            .map(maiuscula)
            .toList();
      // Exibe
      coresMaiusculas.forEach(System.out::println);


      //Predicate
      List<String> alfabeto = Arrays.asList("A", "C", "E", "F", "Q", "F", "A");
      Predicate<String> isF = letra -> letra == "F" && letra == "A"; 
      //filtra o F
      List<String> F = alfabeto.stream()
      .filter(isF)
      .collect(Collectors.toList());
      F.forEach(System.out::println);


      //BinaryOperator
      List<Double> num = Arrays.asList(2.0,4.0,5.0,7.0,8.0);
      //Processamento
      BinaryOperator<Double> soma = (num1, num2) -> num1 + num2;
      double somaTotal = num.stream().reduce(0.0, soma);
      double media = somaTotal/num.size();
      //saida
      System.out.println("A média entre os números é: " + media);


   }

}