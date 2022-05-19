package br.dio.desafio.java;

public class Main {
    public static void main(String[] args) {
        Cliente nathally = new Cliente();
        nathally.setNome("Nathally");

        Conta cc = new contaCorrente(nathally);
        Conta cp = new contaPoupanca(nathally);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
