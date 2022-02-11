package com.noalgroup;

public class Data {
    private int ano;
    private int mes;
    private int dia;

    private static String zeroPadding(int i) {
        return i > 10 ? String.format("%d", i) : String.format("0%d", i);
    }

    public void duplicar(Data outraData) {
        outraData.dia = this.dia;
        outraData.mes = this.mes;
        outraData.ano = this.ano;
    }

    public void adicionarAnos(int n) {
        this.ano += n;
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String formatada() {
        return String.format("%s/%s/%s",
                Data.zeroPadding(this.dia),
                Data.zeroPadding(this.mes),
                Data.zeroPadding(this.ano));
    }
}
