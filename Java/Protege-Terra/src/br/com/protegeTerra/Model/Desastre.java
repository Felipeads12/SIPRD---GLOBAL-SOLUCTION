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

    public Desastre(String tipo, String enderecoDesastre, String descricao, String gravidade) {
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
}