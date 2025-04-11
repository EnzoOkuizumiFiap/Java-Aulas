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
            System.out.print("\n\nO que deseja fazer: \n1-Definir outro canal \n2-Definir novo volume \n3-Aumentar volume \n4-Diminuir volume \n\nSelecione algumas das opções acima:");
            int opcao = scan.nextInt();

            //Fazendo If/Else para definir novo canal ou novo volume
            if (opcao == 1) {
                System.out.print("Digite o Canal desejado: ");
                int novoCanal = scan.nextInt();
                tv.setCanal(novoCanal);

            } else if (opcao == 2) {
                System.out.print("Digite o Volume desejado: ");
                int novoVolume = scan.nextInt();
                tv.setVolume(novoVolume);

            } else if (opcao == 3) {
                tv.aumentarVolume();

            } else if (opcao == 4) {
                tv.diminuirVolume();
            }

            System.out.printf("Novo Canal: %d \nNovo Volume: %d", tv.getCanal(), tv.getVolume());

        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }

    }
}
