/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("Ordem aleatoria");
        Map<String, Livro> livros = new HashMap<>(){{
           put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
           put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
           put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};

        for(Map.Entry<String, Livro> livro : livros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("Ordem de inserção");
        Map<String, Livro> livrosOrdem = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};

        for(Map.Entry<String, Livro> x : livrosOrdem.entrySet()){
            System.out.println(x.getKey() + " - " + x.getValue().getNome());
        }

        System.out.println("Ordem alfabetica dos autores");
        Map<String, Livro> OrdemAlfabeticaAutor = new TreeMap<>(livros);

        for (Map.Entry<String,Livro> x : OrdemAlfabeticaAutor.entrySet()){
            System.out.println(x.getKey() + " - " + x.getValue().getNome());
        }

        System.out.println("Ordem alfabetica dos livros");
        Set<Map.Entry<String, Livro>> ordemAlfabeticaTitulo = new TreeSet<>(new ComparatorNome());
        ordemAlfabeticaTitulo.addAll(livros.entrySet());

        for (Map.Entry<String,Livro> x : ordemAlfabeticaTitulo){
            System.out.println(x.getKey() + " - " + x.getValue().getNome());
        }

        System.out.println("Ordem numero de paginas");
        Set<Map.Entry<String, Livro>> ordemNumeroPaginas = new TreeSet<>(new ComparatorPagina());
        ordemNumeroPaginas.addAll(livros.entrySet());

        for (Map.Entry<String,Livro> x : ordemNumeroPaginas){
            System.out.println(x.getKey() + " - " + x.getValue().getNome() + ", " + x.getValue().getPaginas() + " paginas");
        }
    }
}