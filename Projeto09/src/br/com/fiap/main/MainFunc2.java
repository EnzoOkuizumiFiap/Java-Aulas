package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;

import java.time.LocalDate;
import java.util.Scanner;

public class MainFunc2 {
    //Exercício da Aula
    public static void main(String[] args) {
        Funcionario funcionario1;
        LocalDate dataAtual = LocalDate.now();
        float horasDaSemana;
        Scanner scan;

        try{
            scan = new Scanner(System.in);
            System.out.println("Digite seu nome e quanto ganha por hora");
            funcionario1 = new Funcionario(scan.nextLine(), scan.nextFloat());

            System.out.println("Quantas horas trabalha na semana?");
            horasDaSemana = scan.nextFloat();

            System.out.printf("Data: %d/%d/%d \nNome: %s \nSalário: R$%.2f", dataAtual.getDayOfMonth(), dataAtual.getMonthValue(), dataAtual.getYear(), funcionario1.getNome(), funcionario1.calcularSalario(horasDaSemana));

        } catch (Exception e) {
            System.out.println("Nome ou valor Inválidos!");
        }
    }
}
