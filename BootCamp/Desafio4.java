import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTotal = scan.nextInt();
        int numFigCompradas = scan.nextInt();
        int numFigCompradas2;
        Set<Integer> setFig = new HashSet<>();
        for (int i=0; i<numFigCompradas; i++) {
            setFig.add(numFigCompradas2 = scan.nextInt());
        }
       
        System.out.println(numTotal - setFig.size());
        scan.close();
    }
    
}
