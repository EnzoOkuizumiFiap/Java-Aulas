package br.com.fiap.bean;

public class Quadrado {
    //Atributos
    private float lado;

    //Construtores
    public Quadrado() {
    }
    public Quadrado(float lado) {
        this.lado = lado;
    }

    //Getters/Setters
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }

    //Métodos da classe (particulares)
    public float calcularArea(){
        return lado * lado;
    }
}
