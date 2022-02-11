package com.noalgroup;

public class App 
{
    public static void main( String[] args )
    {
        Data hoje = new Data(11, 2, 2022);
        Cliente rodrigo = new Cliente();
        rodrigo.setNome("Rodrigo");

        Conta cc = new ContaCorrente(rodrigo);
        Conta poupanca = new ContaPoupanca(rodrigo);
        Cartao cartaoCredito = new Cartao(rodrigo, hoje);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cartaoCredito.imprimirCartao();
    }
}
