package br.com.fiap;

public class Radio {
    public int volume;
    public float estacao;

    public Radio() {
    }

    public void aumentarVolume() {
        ++this.volume;
    }

    public void diminuirVolume() {
        --this.volume;
    }

    public void trocarEstacao(float frequencia) {
        this.estacao = frequencia;
    }
}
