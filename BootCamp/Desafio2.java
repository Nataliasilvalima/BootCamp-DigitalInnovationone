import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String T = scan.nextLine();
        String respostasCompetidores = scan.nextLine();

        String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");
        //TODO: Complete o código com uma possível solução para o problema.    
        int count = 0;
        for (int i=0; i<5; i++  ) {
         if ( Integer.parseInt(respostasCompetidoresSplit[i]) == Integer.parseInt(T )) {
                count++;
            }
        }
        System.out.println(count);
        scan.close();
    }
}
    


