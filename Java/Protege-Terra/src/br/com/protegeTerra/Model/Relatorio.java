package br.com.protegeTerra.Model;

public class Relatorio {
    private Cliente cliente;
    private Desastre desastre;
    private String data;

    public static void gerarRelatorio(Cliente cliente, Desastre desastre) {
    }

    public Relatorio(Cliente cliente, Desastre desastre, String data) {
        this.cliente = cliente;
        this.desastre = desastre;
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Desastre getDesastre() {
        return desastre;
    }

    public void setDesastre(Desastre desastre) {
        this.desastre = desastre;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
