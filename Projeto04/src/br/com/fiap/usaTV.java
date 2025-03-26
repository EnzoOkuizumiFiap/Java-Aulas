package br.com.fiap;

public class usaTV {
    public usaTV() {
    }

    public static void main(String[] args) {
        Praticando1_Televisor TV = new Praticando1_Televisor();
        TV.canal = 5;
        TV.volume = 10;
        TV.trocarCanal(4);
        TV.diminuirVolume();
        TV.diminuirVolume();
        TV.aumentarVolume();
        System.out.println("Canal TV: " + TV.canal + "\nVolume: " + TV.volume);
    }
}
