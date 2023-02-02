import java.util.Random;

/*
 * Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
 *  armazene-os num vetor. Ao final, mostre os números e seus sucessores.
 */

public class Aleatorio {

    public static void main(String[] args) {
        Random random = new Random();

        int[] aleatorio = new int[20];

        for (int i = 0; i < aleatorio.length; i++) {
            int numero = random.nextInt(100);
            aleatorio[i] = numero;
        }

        System.out.println("Numeros aleatorios: ");
        for (int x : aleatorio) {
            System.out.print(x + " ");            
        }

        System.out.println("\nSucessores dos numeros aleatorios: ");
        for (int x : aleatorio) {
            System.out.print((x + 1 )  + " ");
        }
        System.out.println();
    }
}
