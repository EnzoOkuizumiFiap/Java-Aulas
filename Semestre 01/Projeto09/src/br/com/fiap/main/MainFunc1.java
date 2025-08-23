package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;

import java.time.LocalDate;

public class MainFunc1 {
    //Exercício da Aula
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(); //Instanciando o Funcionario, isso quer dizer: Geramos o Funcionario1 a partir da classe/molde Funcionario
        funcionario1.setNome("Garibaldo CLT");
        funcionario1.setValorHoraTrabalho(5.50f); //Valor que recebe por hora trabalhada
        LocalDate dataAtual = LocalDate.now();

        //Garibaldo trabalha 48h semanais
        System.out.printf("Data: %d/%s/%d \nNome: %s \nSalário: R$%.2f", dataAtual.getDayOfMonth(), dataAtual.getMonth(), dataAtual.getYear(), funcionario1.getNome(), funcionario1.calcularSalario(48f));
    }
}
