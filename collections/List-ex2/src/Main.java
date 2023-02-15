import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<>() {{
            add(new Gato("jon", 18, "preto"));
            add(new Gato("Simba", 6, "amarelo"));
            add(new Gato("Jon", 12, "rosa"));
        }};

        System.out.println("-- \tOrdem de inserção\t--");
        System.out.println(gatos);

        System.out.println("-- \tOrdem de aleatória\t--");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("-- \tOrdem natural (nome)\t--");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("-- \tOrdem de idade\t--");
        /* Collections.sort(gatos, new ComparatorIdade()); */
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("-- \tOrdem de cor\t--");
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);

        System.out.println("-- \tOrdem de nome/ cor/ idade\t--");
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);
    }


}