package Subsistema;

public class CrmService {
    
    
    private CrmService() {
        super();
    }

    public static void gravaCliente(String nome, String cep,String cidade, String estado){
        System.out.println("Cliente salvo no sistema de CRM.");
        System.out.println(nome);
        System.out.println(cidade);
        System.out.println(cep);
        System.out.println(estado);
    }
}