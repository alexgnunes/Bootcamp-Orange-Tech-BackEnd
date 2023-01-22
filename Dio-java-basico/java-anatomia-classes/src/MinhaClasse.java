public class MinhaClasse {
    
    public static void main(String[] args) {
        System.out.println("Sejam bem vindos");

        int idade = 36;
        String primeiroNome = "Alex";
        String segundoNome = "Nunes";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto + " " + idade + "anos");
    }

    private static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
