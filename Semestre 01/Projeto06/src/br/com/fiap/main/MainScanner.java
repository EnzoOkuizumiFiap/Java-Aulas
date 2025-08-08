package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        //Criando com Scanner
        Scanner scan = new Scanner(System.in);
        FolhaDePagamento folha = new FolhaDePagamento(); //Instanciando FolhaDePagamento

        double salarioBruto, descontoINSS, valorPlanoDeSaude;
        int numeroDeDependentes;

        try {
            //Pedindo os valores para o usuário:
            System.out.print("Digite o salário Bruto: R$");
            salarioBruto = scan.nextDouble();
            System.out.print("Digite o N° de Dependentes: ");
            numeroDeDependentes = scan.nextInt();
            System.out.print("Digite o desconto INSS (Em %): ");
            descontoINSS = scan.nextDouble();
            System.out.print("Digite o valor Plano de Saúde: R$");
            valorPlanoDeSaude = scan.nextDouble();

            //Atribuindo os valores ao objeto
            folha.salarioBruto = salarioBruto;
            folha.numeroDeDependentes = numeroDeDependentes;
            folha.descontoINSS = descontoINSS;
            folha.valorPlanoDeSaude = valorPlanoDeSaude;

            //Resultado
            System.out.printf("\nSalário Bruto: R$%.2f \nN° de dependentes: %d \nDesconto INSS: %.1f%% \nValor Plano de Saúde: %.2f \nSalário Líquido: R$%.2f", folha.salarioBruto, folha.numeroDeDependentes, folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());

        } catch (Exception e){
            System.out.println("Formato de número incorreto!");
        }
    }
}
