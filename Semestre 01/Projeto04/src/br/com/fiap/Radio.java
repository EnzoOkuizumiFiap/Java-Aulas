package br.com.fiap;

public class Radio {
    // atributos
    public int volume;
    public float estacao;

    // métodos
    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void trocarEstacao(float frequencia) {
        estacao = frequencia;
    }
}
