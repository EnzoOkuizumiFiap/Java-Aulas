package br.com.fiap;

public class usaRadio {
    public usaRadio() {
    }

    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.estacao = 89.1F;
        radio.volume = 5;
        radio.trocarEstacao(92.5F);
        radio.aumentarVolume();
        radio.aumentarVolume();
        System.out.println("Volume atual: " + radio.volume + "\nEstacação atual: " + radio.estacao);
    }
}
