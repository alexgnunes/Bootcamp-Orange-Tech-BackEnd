import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Crie um dicionario que relacione os modelos comseus respectivos cnsumos: ");

        Map<String, Double> carros = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.5);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 16.1);
        }};
        System.out.println(carros);

        System.out.println("Substitua o consumo do gol por 15.2 km/l:");
        carros.put("gol", 15.2);
        System.out.println(carros);

        System.out.println("confira se o modelo tucson está no dicionario: " + carros.containsKey("tucson"));

        System.out.println("exiba o consumo do uno: " + carros.get("uno"));

        System.out.println("exiba os modelos: ");
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);

        System.out.println("exiba o cnsumo dos carros: ");
        Collection<Double> consumo = carros.values();
        System.out.println(consumo);

        System.out.println("exiba o modelo mais economico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carros.values());
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String carroEconomico = "";
        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(consumoMaisEficiente)){
                carroEconomico = entry.getKey();
                System.out.println(carroEconomico + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("exiba o modelo menos economico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carros.values());
        String carroMaiorConsumo = "";
        for (Map.Entry<String, Double> entry : carros.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)){
                carroMaiorConsumo = entry.getKey();
                System.out.println(carroMaiorConsumo + " - " + consumoMenosEficiente);
            }
        }

        System.out.print("exiba a soma dos consumos: ");
        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("exiba a media dos consumos: " + soma / consumo.size());

        System.out.println("remova os modelos com consumo igual a 16.1:");
        Iterator<Double> iterator1 = carros.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() == 16.1){
                iterator1.remove();
            }
        }
        System.out.println(carros);

        System.out.println("exiba os carros na ordem que foram informados");
        Map<String, Double> carrosOrdem = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.5);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 16.1);
        }};
        System.out.println(carrosOrdem);

        System.out.println("exiba os carros ordenados pelo modelo");
        Map<String, Double> carrosOrdenados = new TreeMap<>(carrosOrdem);
        System.out.println(carrosOrdenados);

        System.out.println("apagar a lista de carros:");
        carros.clear();
        System.out.println(carros);

        System.out.println("verifique se a lista esta vazia: " + carros.isEmpty());
    }
}