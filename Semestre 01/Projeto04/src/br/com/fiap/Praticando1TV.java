package br.com.fiap;

public class Praticando1TV {
    public int volume;
    public int canal;

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void trocarCanal(int novoCanal) {
        canal = novoCanal;
    }
}