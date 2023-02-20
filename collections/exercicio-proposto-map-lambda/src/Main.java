import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> populacao = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        populacao.put("SC", 5980765);
        System.out.println(populacao);

        System.out.println("Exiba a população PE");
        System.out.println(populacao.get("PE"));

        System.out.println("Exiba os estados e suas populações em ordem alfabética");
        Map<String, Integer> populacaoOrdenada = new TreeMap<>(populacao);
        System.out.println(populacaoOrdenada);

        Map<String, Integer> populacaoReversa = new TreeMap<>(Comparator.reverseOrder());
        populacaoReversa.putAll(populacao);
        System.out.println(populacaoReversa);

        System.out.println("Exiba o estado ordenado pela população");
        Set<Map.Entry<String, Integer>> menorPopulacao = new TreeSet<>(Comparator.comparing(
                numero -> numero.getValue()));
        menorPopulacao.addAll(populacao.entrySet());
        System.out.println(menorPopulacao);
        for (Map.Entry<String, Integer> x : menorPopulacao) {
            System.out.println(x);
        }

        System.out.println("Exiba o estado com o menor população e sua quantidade");
        Integer valorMenorPopulacao = Collections.min(populacao.values());
        for (Map.Entry<String, Integer> x : menorPopulacao) {
            if (x.getValue() == valorMenorPopulacao) {
                System.out.println(x);
            }
        }

        System.out.println("Exiba a soma da população desses estados");
        Integer soma = 0;
        for( Map.Entry<String, Integer> x : menorPopulacao){
            soma += x.getValue();
        }
        System.out.println(soma);

        System.out.println("Remova os estados com a população menor que 4.000.000");
        populacao.entrySet().removeIf(x ->x.getValue() < 4000000);
        System.out.println(populacao);

    }
}