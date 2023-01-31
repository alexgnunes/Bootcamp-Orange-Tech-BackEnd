import java.util.Scanner;

/*
 * Faça um programa que leia 5 números e informe o maior número e a média desses números.
 */

public class MaiorEMedia {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int media = 0;

        do {
            System.out.println("Numero: ");
            numero = sc.nextInt();
            media += numero;

            if(numero> maior){
                maior = numero;
            }
            count++;
        } while (count < 5);

        System.out.println("Maior = " + maior);
        System.out.println("Media = " + media/5);
        sc.close();
    }
}