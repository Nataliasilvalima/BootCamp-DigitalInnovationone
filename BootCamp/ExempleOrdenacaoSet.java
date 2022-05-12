import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class ExempleOrdenacaoSet {
   public static void main(String[] args) {
       System.out.println("Ordem aleatoria: ");
       Set<Serie> minhasSeries = new HashSet<>(){{
           add(new Serie("got", "fantasia", 60));
           add(new Serie("dark", "drama", 40));
           add(new Serie("that show", "comedia", 25));
        }};
        for(Serie serie: minhasSeries) System.out.println(serie.getNome() + " - "+ serie.getGenero()+ " - " + serie.getTempoEpisodio());

        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 40));
            add(new Serie("that show", "comedia", 60));
         }};
         for(Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - "+ serie.getGenero()+ " - " + serie.getTempoEpisodio());
        
        System.out.println("Exiba a prdem natural:");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for(Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - "+ serie.getGenero()+ " - " + serie.getTempoEpisodio());

        System.out.println("Ordem em nome genero e tempo:");
        Set<Serie> minhasSeries3 = new TreeSet<>();
        new ComparatorNomeGeneroTempoEpisodio();
        minhasSeries3.addAll(minhasSeries);
        for(Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - "+ serie.getGenero()+ " - " + serie.getTempoEpisodio());
        

   } 







  
        
}
