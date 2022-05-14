package Projeto;

import Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Natalia");

        ContaCorrente corrente = new ContaCorrente(cliente);
        ContaPoupanca poupanca = new ContaPoupanca(cliente);

        corrente.depositar(100);
        corrente.imprimirExtrato();
        corrente.transferir(200, poupanca);

        poupanca.depositar(100);
        poupanca.imprimirExtrato();
    }
}
