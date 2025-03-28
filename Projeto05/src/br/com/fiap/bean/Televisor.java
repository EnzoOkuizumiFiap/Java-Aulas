package br.com.fiap.bean;

public class Televisor {
    //Atributos
    public int volume;
    public int canal;

    //Métodos
    public void aumentarVolume() {
        volume ++;
    }
    public void diminuirVolume() {
        volume --;
    }
    public void trocarCanal(int novoCanal) {
        canal = novoCanal;
    }
}
