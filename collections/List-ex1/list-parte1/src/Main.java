import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("crie uma lista com sete notas: ");


        List<Double> notas = new ArrayList<>();
        notas.add(9.0);
        notas.add(8.0);
        notas.add(7.0);
        notas.add(6.0);
        notas.add(5.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println("Exibe posição da nota 5: " + notas.indexOf(5.0));

        System.out.println("Adiciona na lista a nota 8 na posição 4");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua nota 0.0 pela 6.0");
        notas.set(notas.indexOf(0.0), 6.0);
        System.out.println(notas);

        System.out.println("cnfira se a nota 5.0 esta na lista: " + notas.contains(5.0));

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.print("exiba a soma dos valores: ");
        double soma = 0.0;
        for (int i = 0; i < notas.size(); i++) {
            soma += notas.get(i);
        }
        System.out.println(soma);

        double somaIterator = 0.0;
        System.out.print("exiba a soma dos valores usando iterator: ");
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()) {
            somaIterator += iterator.next();
        }
        System.out.println(somaIterator);

        System.out.println("Exiba a media: " + soma / notas.size());

        System.out.println("Remova a nota 9: ");
        notas.remove(9.0);
        System.out.println(notas);

        System.out.println("Remova a noya na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 6: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            double next = iterator1.next();
            if (next < 6) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 com o uso de predicado: ");
        notas.removeIf(x -> x < 7);
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("confira se a lista esta vazia: " + notas.isEmpty());

    }

}