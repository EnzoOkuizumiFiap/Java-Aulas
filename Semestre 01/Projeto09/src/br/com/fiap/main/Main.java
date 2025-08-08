package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(); //Pessoa() é um construtor (Construtor tem parenteses)
        pessoa1.setNome("Enzo");
        pessoa1.setAnoNascimento(2006);
        int idadePessoa1 = pessoa1.calcularIdade(2025);

        Pessoa pessoa2 = new Pessoa("Berisvaldo", 1899); //Testando a regra de negócio

        System.out.printf("Pessoa 1 \nNome: %s \nIdade: %d anos", pessoa1.getNome(), idadePessoa1);

        System.out.printf("\n\nPessoa 2 \nNome: %s \nIdade: %d anos", pessoa2.getNome(), pessoa2.calcularIdade(2025));
    }
}
