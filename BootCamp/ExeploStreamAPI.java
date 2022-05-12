import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;


public class ExeploStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9","9", "6", "5" );
        System.out.println("Imprima todos os elementos dessa lista de String:");

        numerosAleatorios.stream().forEach(new Consumer<String>(){
            @Override
            public void accept(String s){
                System.out.println(s);
            }

        });
        numerosAleatorios.stream().forEach(s -> System.out.println(s));//lambda nota que a interface List nao precisa do metodo stream
        numerosAleatorios.forEach(System.out::println);// reference method

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set: ");
        numerosAleatorios.stream()
        .limit(5)
        .collect(Collectors.toSet())
        .forEach(System.out::println);         

        System.out.println("Transforme esta lista de String em uma lista de numeros inteiros. ");
        numerosAleatorios.stream().map(new Function<String,Integer>() {
            @Override
            public Integer apply(String s){
                return Integer.parseInt(s);
            }
        });
        //Lambda
        numerosAleatorios.stream()
        .map(Integer::parseInt)// pega os elementos e muda para o integer
        .collect(Collectors.toList())//coleta os elementos e joga em uma List
        .forEach(System.out::println); // imprime
        
        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista");
        List<Integer> listaPares = numerosAleatorios.stream().map(Integer::parseInt).filter(new Predicate<Integer>() {
            @Override
            public boolean test (Integer i){
                if(i %2==0 && i > 2) return true;
                    return false;
            }
        }).collect(Collectors.toList());
        System.out.println(listaPares);  
        
        //Lambda
        List<Integer> listaPares1 = numerosAleatorios.stream().map(Integer::parseInt).filter(i->(i %2==0 && i > 2)).collect(Collectors.toList());
        System.out.println(listaPares1);  

        System.out.println("Mostre a media dos numeros:");
        numerosAleatorios.stream().mapToInt(new ToIntFunction<String>() {
        @Override
        public int applyAsInt(String s) {
            // TODO Auto-generated method stub
            return Integer.parseInt(s);
        } 
        });

        //Lambda
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);
           /* @Override
            public void accept(double v) {
                // TODO Auto-generated method stub
                System.out.println(v);
            }*/
        System.out.println("remova os valores impares:");
        listaPares.removeIf(integer->(integer %2 !=0));
        System.out.println(listaPares);
   

           
    }
}
