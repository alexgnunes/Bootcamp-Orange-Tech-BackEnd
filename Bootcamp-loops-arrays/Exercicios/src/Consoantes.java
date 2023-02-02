import java.util.Scanner;

/*
 * Consoantes: Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes 
 * foram lidas. Imprima as consoantes.
 */
public class Consoantes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoante = 0;
        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = sc.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {

                consoantes[count] = letra;
                quantidadeConsoante++;
            }
            count++;
        } while (count < consoantes.length);

        System.out.println("Quantidade de consoantes= " + quantidadeConsoante);

        for (String x : consoantes) {
            if(x != null){
                System.out.print(x + " ");                
            }
        }
        System.out.println();
        sc.close();
    }
}
