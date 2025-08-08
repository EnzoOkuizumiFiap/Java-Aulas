package br.com.fiap;

public class Praticando3Carro {
    //Atributos
    public String marca;
    public String modelo;
    public String motor;

    //Metodo para ligar o carro
    public void ligar(){
        System.out.println("O carro " + modelo + " está ligado!");
    }
    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor);
    }
}
