package br.com.fiap;

import java.util.Scanner;

public class Ex02_Scanner {
    public static void main(String[] args) {
        int dataAtual, dataNascimento, resultadoIdade;
        Scanner scan;
        try {
            scan = new Scanner(System.in);

            System.out.print("Digite o ano atual: ");
            dataAtual = scan.nextInt();

            System.out.print("Digite a sua data de nascimento: ");
            dataNascimento = scan.nextInt();
            resultadoIdade = dataAtual - dataNascimento;


            System.out.println("A data atual é " + dataAtual + ", a sua data de nascimento é " + dataNascimento + ", então a sua idade é " + resultadoIdade + " anos.");

        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }
    }
}
