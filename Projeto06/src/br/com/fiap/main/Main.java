package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

public class Main {
    //Metodo main       vv
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento(); //A primeira parte é a declaração, a segunda parte new é a instanciação, ele começa a existir na memória
        folha.salarioBruto = 10000;
        folha.descontoINSS = 15;
        folha.numeroDeDependentes = 4;
        folha.valorPlanoDeSaude = 150;

        System.out.printf("Salário Bruto: R$ %.2f \nN° de Dependentes: %d \nINSS: %.1f%% \nValor Plano de Saúde: R$ %.2f \nSalário Líquido: R$ %.2f", folha.salarioBruto, folha.numeroDeDependentes, folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());
    }
}
