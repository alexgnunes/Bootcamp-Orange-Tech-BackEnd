import java.util.Scanner;

/*
 * Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
 */
public class Fatorial {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Fatorial de: ");
        int fatorial = sc.nextInt();
        int total = 1;

        for( int i = fatorial; i >= 1; i--){
            total *= i;
        }

        System.out.println("Fatorial de " + fatorial + "! = " + total);

        sc.close();
    }
}
