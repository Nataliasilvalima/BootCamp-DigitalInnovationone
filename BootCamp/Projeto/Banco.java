package Projeto;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Banco [nome=" + nome + "]";
    }

    public List<Conta> getContas(){
        return contas;
    }

    public void setContas(List<Contas> contas){
        this.contas = contas;
    }



    
}
