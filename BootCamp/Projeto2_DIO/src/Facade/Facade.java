package Facade;

import Subsistema.CrmService;
import Subsistema2.CepApi;

public class Facade {
    
    public void migrarCliente( String nome, String cep){

        String cidade =  CepApi.getInstancia().recuperarCidade(cep);
        String estado =  CepApi.getInstancia().recuperarEstado(cep);
        
        CrmService.gravaCliente(nome, cep, cidade, estado);
    }
}
