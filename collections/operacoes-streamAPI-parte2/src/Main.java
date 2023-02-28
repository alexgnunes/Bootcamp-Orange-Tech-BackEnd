import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os lementos dessa lista de string: ");
        numerosAleatorios.stream().forEach(s -> System.out.println(s));

        System.out.println("Coloque os 5 primeiros numeros dentro de um set: ");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(s -> System.out.println(s));

        System.out.println("Transforme essa lista de string em uma lista de numeros inteiros: ");
        List<Integer> collectListInt = numerosAleatorios.stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());
        System.out.println(collectListInt);

        System.out.println("Coloque os numeros pares e maiores que 2 em uma lista: ");
        List<Integer> listParMaior2 = numerosAleatorios.stream()
                .map(x -> Integer.parseInt(x)).filter(x -> x % 2 == 0 && x > 2).collect(Collectors.toList());
        System.out.println(listParMaior2);

        System.out.println("Mostre a media dos numeros: ");
        numerosAleatorios.stream().mapToInt(x ->Integer.parseInt(x)).average().ifPresent(x -> System.out.println(x));

        System.out.println("Remova os valores impares");
        //collectListInt.removeIf(x -> (x % 2 != 0));
        System.out.println(collectListInt);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        List<String> collectSkip = numerosAleatorios.stream().skip(3).collect(Collectors.toList());
        System.out.println(collectSkip);

        System.out.println("Retirando os números repetidos da lista, quantos números ficam? ");
        System.out.println(numerosAleatorios.stream().distinct().count());

        System.out.println("Mostre o menor valor da lista: ");
        numerosAleatorios.stream().mapToInt(x ->Integer.parseInt(x)).min().ifPresent(x -> System.out.println(x));

        System.out.println("Mostre o maior valor da lista: ");
        numerosAleatorios.stream().mapToInt(x ->Integer.parseInt(x)).max().ifPresent(x -> System.out.println(x));

        System.out.println("Pegue apenas os números pares e some: ");
        int somaNumerosPares = numerosAleatorios.stream().mapToInt(x -> Integer.parseInt(x)).filter(x -> x % 2 == 0).sum();
        System.out.println(somaNumerosPares);

        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> ordemNumerica = collectListInt.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(ordemNumerica);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
//        dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = collectListInt.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);
    }
}
