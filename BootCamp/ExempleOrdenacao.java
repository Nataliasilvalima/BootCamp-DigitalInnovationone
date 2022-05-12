import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExempleOrdenacao {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Jon", 12, "Amarelo"));
        }};
        System.out.println(meusGatos);
        System.out.println("---Ordem de Insercao ---");
        System.out.println(meusGatos);
        System.out.println("---Ordem aleatoria ---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        System.out.println("---Ordem Natual (Nome) ---");
        Collections.sort(meusGatos);// verifica se a lista esta na ordem natural
        System.out.println(meusGatos);
        System.out.println("---Ordem idade ---");
        Collections.sort(meusGatos, new ComparatorIdade());    //Compara a idade  
        meusGatos.sort(new Gato.ComparatorIdade()); //Compara a idade
        System.out.println("---Ordem Cor ---");
        meusGatos.sort(new Gato.ComparatorCor());
        System.out.println(meusGatos);
        System.out.println("---Ordem Nome cor  idade ---");
        Collections.sort(meusGatos, new Gato.ComparatorIdade());
        meusGatos.sort(new Gato.ComparatorNomeCorIdade());
    }
    
    
}
