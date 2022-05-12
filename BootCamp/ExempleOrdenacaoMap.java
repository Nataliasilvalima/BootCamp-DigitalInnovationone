import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExempleOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("Exibir em Ordem aleatoria:");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro( "Uma Breve historia do tempo", 256));
            put("Duingg, Charles", new Livro("O poder do harbitro", 408));
            put("Harari, Yuval Noah", new Livro( "Licoes para o seculo", 432));
        }};
        for (Map.Entry<String, Livro> livro: meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
    
        System.out.println("Exiba em Ordem de insercao:");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro( "Uma Breve historia do tempo", 256));
            put("Duingg, Charles", new Livro("O poder do harbitro", 408));
            put("Harari, Yuval Noah", new Livro( "Licoes para o seculo", 432));
        }};
        for (Map.Entry<String, Livro> livro: meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
    
        System.out.println("Exiba em ordem alfabetica dos autores: ");
        Map<String, Livro> meusLivros2 = new TreeMap<>(){{
            put("Hawking, Stephen", new Livro( "Uma Breve historia do tempo", 256));
            put("Duingg, Charles", new Livro("O poder do harbitro", 408));
            put("Harari, Yuval Noah", new Livro( "Licoes para o seculo", 432));
        }};
        
        System.out.println(meusLivros2);
        
        System.out.println("Exiba a Ordem dos nomes dos livros:");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro: meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        

    }
}
