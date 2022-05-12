import java.util.*;
public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
       
        for(int i =0; i<5; i++){
            int numero = scanner.nextInt();
            numeros.add(numero);
        }
        Integer max = Collections.max(numeros);
        System.out.println(max);
        int position = numeros.indexOf(max) + 1;
        System.out.println(position);
        scanner.close();

    }
}
