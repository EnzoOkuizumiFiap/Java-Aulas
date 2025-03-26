package br.com.fiap;

public class Praticando1_Televisor {
    public int volume;
    public int canal;

    public Praticando1_Televisor() {
    }

    public void aumentarVolume() {
        ++this.volume;
    }

    public void diminuirVolume() {
        --this.volume;
    }

    public void trocarCanal(int novoCanal) {
        this.canal = novoCanal;
    }
}