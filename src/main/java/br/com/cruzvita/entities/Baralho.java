package br.com.cruzvita.entities;


import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;


    public Baralho(List<Carta> cartas){
        this.cartas = cartas;
        String[] naipes = {"Ouros", "Paus", "Espadas", "Copas"};
        String[] numeros = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        // inicializando as cartas com os formatos corretos (um numero e um naipe)
        for (String naipe : naipes){
            for (String numero : numeros){
                cartas.add(new Carta(numero,naipe));
            }
        }
        // coringas
        for (int c = 0; c < 4; c++){
            cartas.add(new Carta("Coringa", "Coringa"));
        }

    }
    public void embaralha() {
        for (int i = 0; i < 100; i++) {
            int pos1 = (int) (Math.random() * cartas.size());
            int pos2 = (int) (Math.random() * cartas.size());
            Collections.swap(cartas, pos1, pos2);
        }
    }

    public void darCartas(){
        if (cartas.size() > 0){
            System.out.println(cartas.remove(0));

        }else{
            System.out.println("Acabaram as cartas do baralho!");
        }
    }

    public boolean temCartas(){
        return !cartas.isEmpty();
    }

    public void mostrar(){
        for (Carta carta : cartas){
            System.out.println(carta.getNumero() + " de " + carta.getNaipe());
        }
    }

}
