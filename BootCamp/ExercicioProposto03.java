import java.util.*;

/*Dadas as seguintas informações para ser criada uma agenda, faça:
id = 1 - Contato = nome: Simba, numero: 819223;
id = 4 - Contato = nome: Cami, numero: 819321;
id = 3 - Contato = nome: Jon, numero: 819223;
/*Dadas as seguintes informações de id e contato, chorar um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
1. Crie uma classe Contato com os atributos nome e número;
2. Crie um dicionário para relacionar o contato e um número de identificação na agenda.
3. Mostre a agenda das seguintes maneiras.
a) Ordem de Inserção;
b) Ordem dos códigos
c) Ordem numérica;
d) Ordem alfabética;
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/
 public class ExercicioProposto03 {

    public  static  void  main ( String [] args ) {
        System.out.println( "--\tOrdem aleatória\t--" );
        Map < Integer , Contato > agenda = new  HashMap <>() {{
           put ( 1 , new  Contato ( " Simba " , 819223 ));
           put ( 4 , new  Contato ( "Cami" , 819321 ));
           put ( 3 , new  Contato ( "Jon" , 819123 ));
           put ( 1 , new  Contato ( " Simba " , 5555 ));
           put ( 4 , new  Contato ( "Cami" , 1111 ));
           put ( 3 , new  Contato ( " Jon " , 2222 ));
        }};

        System.out.println( agenda );
       System.out.println("Agenda" );
        for ( Map . Entry < Integer , Contato > entry : agenda . entrySet ()) {
            System.out.println( entry . getKey () + "-" + entry . getValue (). getNome ());
        }

        System.out.println("-- -------\nAgenda Ordem de Inserção : " );
        System.out.println("-- \tOrdem Inserção \t-- " );
        Map < Integer , Contato > agenda1 = new  LinkedHashMap <>() {{
            put ( 1 , new  Contato ( " Simba " , 819223 ));
            put ( 4 , new  Contato ( "Cami" , 819321 ));
            put ( 3 , new  Contato ( "Jon" , 819123 ));
            put ( 1 , new  Contato ( " Simba " , 5555 ));
            put ( 4 , new  Contato ( "Cami" , 1111 ));
            put ( 3 , new  Contato ( " Jon " , 2222 ));
        }};
        System.out.println(agenda1 );
        for ( Map . Entry < Integer , Contato > entry : agenda1 . entrySet ()) {
            System.out.println( entry. getKey () + "-" + entry . getValue ());
            System.out.println(entry.getKey ( ) + "-" + entry.getValue ( ) . getNome ( ) ) ;
        }

        System.out.println("-- -------\nAgenda Ordem dos códigos: " );
        System.out.println("-- \tID do pedido\t-- " );
        Map < Integer , Contato > agenda2 = new  TreeMap <>( agenda );
        System.out.println( agenda2 );
        for ( Map . Entry < Integer , Contato > entry : agenda2 . entrySet ()) {
            System.out.println(entry . getKey () + "-" + entry . getValue ());
            System.out.println(entry.getKey ( ) + "-" + entry.getValue ( ) . getNome ( ) ) ;
        }

        System.out.println( "-- -------\nAgenda Ordem Numérica: " );
        System.out.println( "-- \tOrdem número telefone\t-- " );
        //precisamos organizar os valores. Logotipo:
        Set< Map . Entry < Integer , Contato >> set = new  TreeSet <>( new  ComparatorOrdemNumerica ());
        set . addAll ( agenda . entrySet ());
        for ( Map . Entry < Integer , Contato > entry : set ) {
           System.out.println( entry . getKey () + "-" + entry . getValue ());
           System.out.println( entry . getKey () + "-" + entry . getValue (). getNumero () +
                    ": " + entry . getValue (). getNome ());
        }

       System.out.println( "-- -------\nAgenda Ordem Alfabética: " );
       System.out.println("-- \tOrdem nome contato\t-- " );
        //precisamos organizar os valores. Logotipo:
        Set< Map . Entry < Integer , Contato >> set1 = new  TreeSet <>( new  ComparatorOrdemNomeContato ());
        set1 . addAll ( agenda . entrySet ());
        for ( Map . Entry < Integer , Contato > entry : set1 ) {
           System.out.println( entry . getKey () + "-" + entry . getValue ());
           System.out.println( entry.getKey ( ) + "-" + entry.getValue ( ) . getNome ( ) ) ;
        }
    }


    
}