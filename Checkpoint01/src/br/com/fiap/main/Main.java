package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;
/*
 * Nome: Enzo Okuizumi Miranda de Souza RM: 561432
 * Nome: Lucas Barros Gouveia RM: 566422
 * Nome: Milton Marcelino RM: 564836
 * Teste 01
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Criando o Scanner
        DespesaFamiliar despesas = new DespesaFamiliar(); //Instanciando DespesaFamiliar

        double rendaFamiliar, gastoComLuz, gastoComAgua, gastoComInternet, valorMensalidadeDaAcademia;
        int numeroDeMoradores; // Declaração de variáveis para armazenar os dados

        try {
            // Solicitando entrada de dados ao usuário
            System.out.print("Digite a Renda Familiar: R$");
            rendaFamiliar = scan.nextDouble();

            System.out.print("Digite o número de Moradores: ");
            numeroDeMoradores = scan.nextInt();

            System.out.print("Digite quanto se gasta na Luz: ");
            gastoComLuz = scan.nextDouble();

            System.out.print("Digite quanto se gasta na Água: ");
            gastoComAgua = scan.nextDouble();

            System.out.print("Digite quanto se gasta com a Internet: ");
            gastoComInternet = scan.nextDouble();

            System.out.print("Digite quanto se gasta com a Academia: ");
            valorMensalidadeDaAcademia = scan.nextDouble();

            // Atribuindo os valores informados pelo usuário ao objeto despesas
            despesas.rendaFamiliar = rendaFamiliar;
            despesas.numeroDeMoradores = numeroDeMoradores;
            despesas.gastoComLuz = gastoComLuz;
            despesas.gastoComAgua = gastoComAgua;
            despesas.gastoComInternet = gastoComInternet;
            despesas.valorMensalidadeDaAcademia = valorMensalidadeDaAcademia;

            System.out.printf("--- Gastos Família ---\nNúmero de Moradores: %d \nGasto com Luz: %.3f \nGasto com Água: %.3f \nGasto com Internet: %.3f \nGasto com Mensalidade Academia: %.3f \n\nRenda Família: R$%.3f \nDespesa da Família: R$%.3f \nRenda Líquida: R$%.3f", despesas.numeroDeMoradores, despesas.gastoComLuz, despesas.gastoComAgua, despesas.gastoComInternet, despesas.valorMensalidadeDaAcademia, despesas.rendaFamiliar, despesas.calcularTotalDeDespesas(), despesas.calcularRendaFamiliarLiquida());

        } catch (Exception e) {
            System.out.println("Erro! Valor inserido Inválido");
        }
    }
}
