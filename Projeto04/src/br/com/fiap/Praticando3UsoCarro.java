package br.com.fiap;

public class Praticando3UsoCarro {
    public static void main(String[] args) {
        // Criando o objeto carro
        Praticando3Carro carro1 = new Praticando3Carro();

        // Alterando atributos
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.motor = "2.0 Flex";

        // Usando os métodos
        carro1.ligar();
        carro1.exibirDados();
    }
}
