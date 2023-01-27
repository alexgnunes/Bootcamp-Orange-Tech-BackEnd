public class MinhaClasse {

    public static void main(String[] args) throws Exception {
        System.out.println("Oi, fui executado pelo terminal.");

        //os argumentos começam com indice 0
        if (args.length == 0) {
            System.out.println("Por favor, forneça alguns argumentos ao executar o programa.");
            return;
        }
        String nome = "Alex";
        String sobrenome = "Nunes";
        int idade = Integer.valueOf(36); //vamos falar sobre Wrappers
        double altura = Double.valueOf(1.8);

        System.out.println("Me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
