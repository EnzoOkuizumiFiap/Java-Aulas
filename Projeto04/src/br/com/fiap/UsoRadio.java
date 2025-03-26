package br.com.fiap;

public class UsoRadio {
    public static void main(String[] args) {
        Radio radio1 = new Radio();
        radio1.estacao = 89.1f;
        radio1.volume = 5;
        radio1.trocarEstacao(92.5f);
        radio1.aumentarVolume();
        radio1.aumentarVolume();
        System.out.println("Volume atual: " + radio1.volume +
                "\nEstação atual: " + radio1.estacao);
    }
}
