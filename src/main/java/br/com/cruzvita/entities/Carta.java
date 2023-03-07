package br.com.cruzvita.entities;

public class Carta {
    private String numero;
    private String naipe;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public Carta(String numero, String naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return "Carta: "+ numero + " de " + naipe;
    }
}
