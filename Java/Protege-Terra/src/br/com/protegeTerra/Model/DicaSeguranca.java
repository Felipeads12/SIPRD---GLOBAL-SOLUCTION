package br.com.protegeTerra.Model;

public class DicaSeguranca {
    private String dicaDeslizamento;
    private String dicaEnchente;
    private String dicaIncendio;
    private String dicaTerremoto;

    public DicaSeguranca(String dicaIncendio, String dicaEnchente, String dicaDeslizamento, String dicaTerremoto) {
        this.dicaIncendio = dicaIncendio;
        this.dicaEnchente = dicaEnchente;
        this.dicaDeslizamento = dicaDeslizamento;
        this.dicaTerremoto = dicaTerremoto;
    }

    public String getDicaDeslizamento() {
        return dicaDeslizamento;
    }

    public void setDicaDeslizamento(String dicaDeslizamento) {
        this.dicaDeslizamento = dicaDeslizamento;
    }

    public String getDicaEnchente() {
        return dicaEnchente;
    }

    public void setDicaEnchente(String dicaEnchente) {
        this.dicaEnchente = dicaEnchente;
    }

    public String getDicaIncendio() {
        return dicaIncendio;
    }

    public void setDicaIncendio(String dicaIncendio) {
        this.dicaIncendio = dicaIncendio;
    }

    public String getDicaTerremoto() {
        return dicaTerremoto;
    }

    public void setDicaTerremoto(String dicaTerremoto) {
        this.dicaTerremoto = dicaTerremoto;
    }
}


