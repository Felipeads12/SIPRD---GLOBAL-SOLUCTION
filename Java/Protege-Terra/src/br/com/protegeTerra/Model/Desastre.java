package br.com.protegeTerra.Model;

import java.time.LocalDate;

public class Desastre {

    private int id;
    private String tipo;
    private String endereco;
    private String descricao;
    private String gravidade;
    private String status;
    private int pessoasAfetadas;
    private LocalDate data;

    public Desastre(int id, String tipo, String endereco,
                    String descricao, String gravidade,
                    String status, int pessoasAfetadas,
                    LocalDate data) {

        this.id = id;
        this.tipo = tipo;
        this.endereco = endereco;
        this.descricao = descricao;
        this.gravidade = gravidade;
        this.status = status;
        this.pessoasAfetadas = pessoasAfetadas;
        this.data = data;
    }

    public Desastre(String tipo, String endereco, String descricao, String gravidade) {

        this.tipo = tipo;
        this.endereco = endereco;
        this.descricao = descricao;
        this.gravidade = gravidade;
        this.data = LocalDate.now();
    }

    @Override
    public String toString() {

        return "\n===== DESASTRE REPORTADO =====" +
                "\nID: " + id +
                "\nTipo: " + tipo +
                "\nEndereço: " + endereco +
                "\nDescrição: " + descricao +
                "\nGravidade: " + gravidade +
                "\nData: " + data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPessoasAfetadas() {
        return pessoasAfetadas;
    }

    public void setPessoasAfetadas(int pessoasAfetadas) {
        this.pessoasAfetadas = pessoasAfetadas;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}