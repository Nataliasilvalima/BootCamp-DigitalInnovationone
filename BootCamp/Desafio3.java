import java.util.Scanner;


public class Desafio3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  numeroDeFigurinhas  = scanner.nextInt() ;
        int  numeroDeFigurinhasCompradas  = scanner.nextInt() ;
        int  totalDeFigurinhas  =  0 ;
        int [] albumDeFigurinha  =  new  int [ numeroDeFigurinhasCompradas ];

        for ( int  i  =  0 ; i  <  numeroDeFigurinhasCompradas ; i ++ ) {
            String  entrada  =  scanner.next();
            
            if ( entrada  !=  null ) {
                //albumDeFigurinha [ i ] =  int . Analisar ( entrada );
            }
        }

        for ( int  i  =  0 ; i  <  numeroDeFigurinhasCompradas ; i ++ ) {
            int  figurinha = albumDeFigurinha  [ i ]; 
            int repeticao  = 0 ;

            for ( int  j  =  0 ; j  <  numeroDeFigurinhasCompradas ; j ++ ) {
                if ( albumDeFigurinha [ j ] ==  figurinha ) {
                    repeticao ++ ; 
                }
            }

            if ( repeticao  >=  2 ){
                for ( int  j  =  0 ; j  <  numeroDeFigurinhasCompradas ; j ++ ) {
                    if ( figurinha == albumDeFigurinha  [ j ]) { 
                        albumDeFigurinha [ j ] =  - 1 ;
                        
                    }
                }
            }
        }

        int  figuras  =  0 ;

        for ( int  i  =  0 ; i  <  numeroDeFigurinhasCompradas ; i ++ ) {
            if ( albumDeFigurinha [ i ] !=  - 1 ) {
                figuras ++ ;
            }
        }
        
        totalDeFigurinhas  =  numeroDeFigurinhas  -  figuras ;
        System.out.println(totalDeFigurinhas );
        scanner.close();
    }
    


}