
public class Mensagem {

    public static void obterMensagem(int hora) {

        if ((5 <= hora) && (hora < 12)) {
            mensagemBomDia();
        } else if ((12 <= hora) && (hora < 18)) {
            mensagemBoaTarde();
        }else{
            mensagemBoaNoite();
        }

    }

    private static void mensagemBoaNoite() {
        System.out.println("Bom noite!!!!!");
    }

    private static void mensagemBoaTarde() {
        System.out.println("Bom tarde!!!!!");
    }

    private static void mensagemBomDia() {
        System.out.println("Bom dia!!!!!");
    }
}
