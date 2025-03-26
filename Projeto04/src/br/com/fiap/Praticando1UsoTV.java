package br.com.fiap;

public class Praticando1UsoTV {
    public static void main(String[] args) {
        Praticando1TV TV = new Praticando1TV();
        TV.canal = 5;
        TV.volume = 10;
        TV.trocarCanal(4);
        TV.diminuirVolume();
        TV.diminuirVolume();
        TV.aumentarVolume();
        System.out.println("Canal TV: " + TV.canal + "\nVolume: " + TV.volume);
    }
}
