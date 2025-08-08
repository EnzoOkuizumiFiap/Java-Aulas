package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

/*
 * Nome: Enzo Okuizumi Miranda de Souza RM: 561432
 * Nome: Lucas Barros Gouveia RM: 566422
 * Nome: Milton Marcelino RM: 564836
 */
public class Main {
    public static void main(String[] args) {
        DespesaFamiliar despesa = new DespesaFamiliar();
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Insira o valor da renda Familiar: ");
            despesa.rendaFamiliar = scan.nextDouble();
            System.out.print("Insira quantidade de moradores: ");
            despesa.numeroDeMoradores = scan.nextInt();
            System.out.print("Insira o valor de gasto de Luz:");
            despesa.gastoComLuz = scan.nextDouble();
            System.out.print("Insira o valor de gasto com Água: ");
            despesa.gastoComAgua = scan.nextDouble();
            System.out.print("Insira o valor de gasto com Internet: ");
            despesa.gastoComInternet = scan.nextDouble();
            System.out.print("Insira o valor da Mensalidade da Academia: ");
            despesa.valorMensalidadeDaAcademia = scan.nextDouble();

            System.out.printf("Renda Familiar: %.3f \nDespesas: %.3f \nSalário Líquido: %.3f", despesa.rendaFamiliar, despesa.calcularTotalDeDespesas(), despesa.calcularRendaFamiliarLiquido());
        } catch (Exception e) {
            System.out.println("Erro!");
        }
    }
}
