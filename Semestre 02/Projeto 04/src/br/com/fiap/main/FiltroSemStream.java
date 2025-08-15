package br.com.fiap.main;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FiltroSemStream {
    public static void main(String[] args) {
        ArrayList<String> herois = new ArrayList<>(
                Arrays.asList("Homem Aranha", "Wolverine", "Hulk", "Homem Elástico", "Mulher Invisível", "Tocha Humana", "Coisa", "Homem de Ferro", "Viúva Negra", "Super Homem", "Mulher Maravilha", "Batman", "Lanterna Verde", "Ciclope")
        );

        ArrayList<String> heroisComH = new ArrayList<>();

        // Não Usando StreamAPI - Com For para percorrer o ArrayList
        for (String heroi : herois) {
            if (heroi.startsWith("H")) {
                heroisComH.add(heroi);
            }
        }

        JOptionPane.showMessageDialog(null, "Os Herois que começam com a letra H:\n" + heroisComH);
    }
}
