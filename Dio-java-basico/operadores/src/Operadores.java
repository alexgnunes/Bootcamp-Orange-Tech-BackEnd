public class Operadores {
    public static void main(String[] args) throws Exception {

        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        String concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        // classe Operadores.java
        int numero = -5;
        System.out.println(-numero);

        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro);

        //Operador ternario
        int a, b;

        a = 5;
        b = 6;

        String condicao = (a == b) ? "verdadeiro" : "false";
        System.out.println(condicao);
    }
}
