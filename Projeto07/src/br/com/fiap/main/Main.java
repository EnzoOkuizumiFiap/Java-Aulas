package br.com.fiap.main;

import br.com.fiap.bean.Radio;
import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Radio
        Radio radio = new Radio();
        radio.setVolume(55);
        radio.setEstacao(89.1f);
        radio.aumentarVolume();
        radio.aumentarVolume();
        radio.setEstacao(92.5f);

        System.out.printf("Estação: %.1fMhz \nVolume: %d", radio.getEstacao(), radio.getVolume());

        System.out.println("\n");
        //Televisor
        Televisor tv = new Televisor();
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Digite o canal da TV:");
            tv.setCanal(scan.nextInt());

            System.out.print("Digite o volume da TV:");
            tv.setVolume(scan.nextInt());

            System.out.printf("Canal: %d \nVolume: %d", tv.getCanal(), tv.getVolume());

            Thread.sleep(2000); // Atraso de 2 segundos (2000 milissegundos)

            //Menu exibindo o que o usuário deseja fazer
            System.out.print("Digite outro canal:");
            tv.setCanal(scan.nextInt());

            System.out.print("Digite novo volume:");
            tv.setVolume(scan.nextInt());


        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }

    }
}
