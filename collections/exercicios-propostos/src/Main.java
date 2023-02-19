import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Crie um dicionário e relacione os estados e suas populações;
        Map<String, Integer> populacaoEstados = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstados);

        System.out.println("Substitua a população do estado do RN por 3.534.165");
        populacaoEstados.put("RN", 3534165);
        System.out.println(populacaoEstados);

        System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB = 4.039.277");
        System.out.println(populacaoEstados.containsValue("PB"));
        if (populacaoEstados.containsValue("PB") == false) {
            populacaoEstados.put("PB", 4039277);
        }
        System.out.println(populacaoEstados);

        System.out.println("Exiba a população PE = " + populacaoEstados.get("PE"));

        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado");
        Map<String, Integer> populacaoEstadosOrdem = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstadosOrdem);

        System.out.println("Exiba os estados e suas populações em ordem alfabética");
        Map<String, Integer> estadosOrdemAlfabetica = new TreeMap<>(populacaoEstadosOrdem);
        System.out.println(estadosOrdemAlfabetica);

        System.out.println("Exiba o estado com o menor população e sua quantidade");
        Integer menorPopulacao = Collections.min(populacaoEstadosOrdem.values());
        Set<Map.Entry<String, Integer>> entries = populacaoEstadosOrdem.entrySet();
        for (Map.Entry<String, Integer> x : entries) {
            if (x.getValue() == menorPopulacao) {
                System.out.println(x);
            }
        }

        System.out.println("Exiba o estado com o maior população e sua quantidade");
        Integer mairPopulacao = Collections.max(populacaoEstadosOrdem.values());
        for (Map.Entry<String, Integer> x : entries) {
            if (x.getValue() == mairPopulacao) {
                System.out.println(x);
            }
        }

        System.out.println("Exiba a soma da população desses estados");
        Integer soma = 0;
        for (Map.Entry<String, Integer> x : entries) soma += x.getValue();
        System.out.println(soma);

        System.out.println("Exiba a média da população deste dicionário de estados: ");
        System.out.println(soma / estadosOrdemAlfabetica.size());

        System.out.println("Remova os estados com a população menor que 4.000.000");
        Iterator<Integer> iterator = populacaoEstadosOrdem.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 4000000) {
                iterator.remove();
            }
        }
        System.out.println(populacaoEstadosOrdem);

        System.out.println("Apague o dicionário de estados");
        populacaoEstados.clear();
        System.out.println(populacaoEstados);

        System.out.println("Confira se o dicionário está vazio");
        System.out.println(populacaoEstados.isEmpty());
    }
}