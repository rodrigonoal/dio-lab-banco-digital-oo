package com.noalgroup;

public class Cartao {
    private static String BANDEIRA_PADRAO = "Noalcard";

    private String bandeira;
    private String nomeImpresso;
    private String numero;
    private Data validade = new Data(0, 0, 0);
    private int validadePadrao = 5;

    private static String gerarCartao() {
        String cardNum = "";
        for (int i = 0; i < 19; i++) {
            if (i == 4 || i == 9 || i == 14) {
                cardNum += " ";
            } else {
                cardNum += GenerateRandom.integer();
            }
        }
        return cardNum;
    }

    protected Cartao(Cliente cliente, Data hoje) {
        this.nomeImpresso = cliente.getNome().toUpperCase();
        this.bandeira = Cartao.BANDEIRA_PADRAO;
        this.numero = Cartao.gerarCartao();
        hoje.duplicar(this.validade);
        this.validade.adicionarAnos(validadePadrao);
    }

    protected void imprimirCartao() {
        System.out.println("=== Informacoes do Cartao ===");
        System.out.println(String.format("Nome impresso: %s", this.nomeImpresso));
        System.out.println(String.format("Bandeira: %s", this.bandeira));
        System.out.println(String.format("Numero: %s", this.numero));
        System.out.println(String.format("Validade: %s", this.validade.formatada()));

    }
}
