package fiap.com.br.main;

import fiap.com.br.bean.ArCondicionado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArCondicionado ar = new ArCondicionado();

        try{
            System.out.print("--- Menu Ar Condicionado ---\n1-Defina o Modo:");
            ar.setModo(scan.nextLine());
            System.out.print("2-Defina a Temperatura:");
            ar.setTemperatura(scan.nextInt());

            boolean continuar = true;

            while (continuar) {
                System.out.print("\n1-Mudar modo | 2-Definir temperatura | 3-Aumentar temp | 4-Diminuir temp | 5-Sair\nEscolha: ");
                int opcao = scan.nextInt();
                scan.nextLine();

                if (opcao == 1) {
                    System.out.print("Novo modo: ");
                    ar.setModo(scan.nextLine());
                } else if (opcao == 2) {
                    System.out.print("Defina a nova temperatura (15-26): ");
                    ar.setTemperatura(scan.nextInt());
                    scan.nextLine();
                } else if (opcao == 3) {
                    ar.aumentarTemperatura();
                } else if (opcao == 4) {
                    ar.diminuirTemperatura();
                } else if (opcao == 5) {
                    continuar = false;
                } else {
                    System.out.println("Opção inválida!");
                }

                //Resultado
                System.out.printf("Modo: %s | Temperatura: %d°C\n", ar.getModo(), ar.getTemperatura());
            }
        } catch (Exception e) {
            System.out.println("Erro na entrada de dados.");
        }

    }
}
