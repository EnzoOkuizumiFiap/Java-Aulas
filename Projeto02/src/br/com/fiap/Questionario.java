package br.com.fiap;
import java.util.Scanner;

public class Questionario {
    public static void main(String[] args) {
        System.out.println("1.Explique Orientação à Objetos.");
        System.out.println("Orientação a objetos é um paradigma da programação que organiza o código em torno de objetos, que representam entidades do mundo real.\n");

        System.out.println("2.Explique o que é Objeto.");
        System.out.println("É uma instância de uma classe, ou seja, algo concreto que pode ser manipulado.\n");

        System.out.println("3.Explique o que é Classe.");
        System.out.println("É um molde ou modelo que define as características e comportamentos dos objetos.\n");

        System.out.println("Exemplo Classe e Objeto: Numa construtora que precisa casas, a classe é a planta, o planejamento, o modelo a ser seguido. \nO Objeto  é a casa pronta, que possui atributos diferentes, como um habitante diferente ou móveis diferentes.\n");

        System.out.println("4.Explique o que é Abstração.");
        System.out.println("É um conceito que permite simplificar e tornar mais eficiente os projetos e implementações de projeto. -> Basicamente é mostrar só o necessário e esconder os detalhes complicados.\n");

        System.out.println("5.Explique o que é Herança.");
        System.out.println("Permite que uma classe herde atributos e métodos de outra classe. (Use a palavra extends).\n");

        System.out.println("6.Explique o que é Encapsulamento.");
        System.out.println("Protege os dados do objeto permitindo acesso apenas por meio de métodos definidos. Usa modificadores de acesso (private, public, protected).\n");

        System.out.println("7.Explique o que é Polimorfismo.");
        System.out.println("É a capacidade de um objeto assumir várias formas, ou seja, de responder de maneiras diferentes à mesma mensagem. Exemplo: Método 'fazerSom()' Um cachorro pode usá-lo para latir, enquanto um gato para miar.\n");

        System.out.println("8.Quais os principais tipos de polimorfismo? Explique cada um deles.\n");

        System.out.println("""
                A. Polimorfismo de Sobrecarga (Overloading):
                Definição: Ocorre quando várias funções ou métodos têm o mesmo nome, mas diferem na quantidade ou tipo de seus parâmetros.
                Exemplo: int soma(int a, int b) — soma de dois inteiros.
                double soma(double a, double b) — soma de dois valores do tipo double.
                Importância: Permite reutilizar o mesmo nome de método para operações diferentes, facilitando a leitura e manutenção do código.
                
                B. Polimorfismo de Sobrescrição (Overriding):
                Definição: Acontece quando uma classe filha redefine um método da classe pai, proporcionando uma implementação específica.
                Exemplo: Uma classe Animal pode ter um método fazerSom(), e as classes filhas Cachorro e Gato podem sobrescrever esse método para emitir sons específicos (como "latir" ou "miau").
                Importância: Permite que classes filhas modifiquem ou especializem comportamentos herdados da classe pai, garantindo flexibilidade na implementação.
                
                C. Polimorfismo de Inclusão (ou Subtipo):
                Definição: Ocorre quando uma classe filha é tratada como se fosse uma instância da classe pai, ou seja, objetos de subclasses podem ser usados onde se espera objetos da superclasse.
                Exemplo: Suponha uma classe Veículo com um método mover(). Classes como Carro ou Bicicleta herdam de Veículo e podem ser tratadas como Veículo em certas situações.
                Importância: Proporciona maior flexibilidade e generalização do código, permitindo que você escreva código que pode trabalhar com diferentes tipos de objetos de maneira uniforme.""");
    }
    public static class Operadores {
        public static void main(String[] args) {
            int num1, num2;
            double num3, num4;
            float num5, num6;

            // Criação do scanner para capturar entradas do usuário
            Scanner scanner = new Scanner(System.in);

            System.out.println("Calculadora em Java");

            System.out.println("\nPrimeiro Cálculo => Soma");
            System.out.println("Digite 1° número inteiro (num1):");
            num1 = scanner.nextInt();
            System.out.println("Digite 2° número inteiro (num2):");
            num2 = scanner.nextInt();

            System.out.println("\nSegundo Cálculo => Subtração com Decimais");
            System.out.println("Digite 1° número decimal (num3):");
            num3 = scanner.nextDouble();
            System.out.println("Digite 2° número decimal (num4):");
            num4 = scanner.nextDouble();

            System.out.println("\nTerceiro Cálculo => Multiplicação com ponto flutuante");
            System.out.println("Digite 1° número Float:");
            num5 = scanner.nextFloat();
            System.out.println("Digite 2° número Float:");
            num6 = scanner.nextFloat();


            int somaInteiros = num1 + num2;
            double subtracaoDecimais = num3 - num4;
            float multiplicacaoFloat = num5 * num6;

            System.out.println("\nResultado das operações:");
            System.out.println("Soma dos inteiros: " + somaInteiros);
            System.out.println("Subtração dos decimais: " + subtracaoDecimais);
            System.out.println("Multiplicação dos Pontos Flutuantes: "+ multiplicacaoFloat);

            scanner.close();
        }
    }
}
