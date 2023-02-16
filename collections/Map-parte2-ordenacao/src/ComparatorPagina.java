import java.util.Comparator;
import java.util.Map;

public class ComparatorPagina implements Comparator<Map.Entry<String,Livro>> {
     @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getPaginas().compareTo(livro2.getValue().getPaginas());
    }
}
