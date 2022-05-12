import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExempleSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas.");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());
        System.out.println("Exiba a posicao da nota 5.0.");// nao consigo realizar esse comando pois nao consigo acssar as posicoes com o HashSet
        System.out.println("Adicione na lista a nota 8.0 na posicao 4.");// nao consigo realizar esse comando pois nao consigo acssar as posicoes com o HashSet
        System.out.println("Substitua a nota 5.0 pela nota 6.0.");// nao consigo realizar esse comando pois nao consigo acssar as posicoes com o HashSet
        System.out.println("Confira se a nota 5.0 esta no conjunto: "+ notas.contains(5d));
        System.out.println("Exiba a menor nota" + Collections.min(notas));
        System.out.println("Exiba a maior nota" + Collections.max(notas)); 
        System.out.println("Exiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        System.out.println("Exiba a media das notas: " + (soma/notas.size()));
        System.out.println("Remova a nota 0.0" + notas.remove(0d));
        System.out.println("Remova todas as  notas menores que 7");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("Exiba na ordem de insercao:");//Lembrando que ele não coloca elementos duplicados
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);
        System.out.println("exiba todas as notas na ordem crescente:");
        Set<Double> notas3 = new TreeSet<>(notas2);// So consigo pq o elemento ja tem o comparable ou se nao implementasse o Comparator nao iria dar certo.
        System.out.println(notas3);
        System.out.println("Apague todo o conjunto.");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se o conunto esta vazio." + notas2.isEmpty());
        
    }
}
