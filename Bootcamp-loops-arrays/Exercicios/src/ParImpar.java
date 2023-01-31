import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números 
 * pares e a quantidade de números impares.
 */

public class ParImpar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int quantNumeros = 0;
        int numero = 0;
        int count = 0;
        int par = 0;
        int impar = 0;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = sc.nextInt();

        do{
            System.out.println("Numero");
            numero = sc.nextInt();

            if(numero % 2 == 0){
                par++;
            }else{
                impar++;
            }

            count++;
        }while(count < quantNumeros);

        System.out.println("Quantidade de par= " + par);
        System.out.println("Quantidade de impar= " + impar);

        sc.close();
    }
}
