import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

  Tabuada de 5:
   5 X 1 = 5
   5 X 2 = 10
...
 */
public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = sc.nextInt();

        System.out.println();

        System.out.println("Tabuada de " + tabuada + ":");

        for (int i = 1; i <= 10; i++) {

            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }
    }
}
