package br.dio.desafio.java;

public class contaPoupanca extends Conta {

    public contaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Poupança ***");
        super.imprimirInformacaoesComum();
    }
}

