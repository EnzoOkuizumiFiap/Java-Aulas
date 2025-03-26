package br.com.fiap;

public class Praticando2UsoArCondicionado {
    public static void main(String[] args) {
        // Criando um objeto da classe ArCondicionado
        Praticando2ArCondicionado ar = new Praticando2ArCondicionado();

        // Definindo valores iniciais
        ar.temperatura = 23;
        ar.modo = "resfriar";

        //Testando os métodos
        ar.aumentarTemperatura();
        ar.aumentarTemperatura();
        ar.trocarModo("esquentar");

        //Exibindo os valores
        System.out.println("Temperatura atual: " + ar.temperatura);
        System.out.println("Modo atual: " + ar.modo);

    }

}
