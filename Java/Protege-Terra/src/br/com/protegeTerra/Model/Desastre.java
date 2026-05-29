package br.com.protegeTerra.Model;

public class Desastre {

    private String tipo;
    private String endereco;
    private String descricao;
    private String gravidade;

    // Construtor
    public Desastre(String tipo, String endereco, String descricao, String gravidade) {
        this.tipo = tipo;
        this.endereco = endereco;
        this.descricao = descricao;
        this.gravidade = gravidade;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getGravidade() {
        return gravidade;
    }

    // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    // Mostrar informações
    @Override
    public String toString() {
        return "\n===== DESASTRE REPORTADO =====" +
                "\nTipo: " + tipo +
                "\nEndereço: " + endereco +
                "\nDescrição: " + descricao +
                "\nGravidade: " + gravidade;
    }
}