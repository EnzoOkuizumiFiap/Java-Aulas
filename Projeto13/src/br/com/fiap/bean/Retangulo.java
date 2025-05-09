package br.com.fiap.bean;

public class Retangulo extends Quadrado {
    //Atributos
    private float altura;

    //Construtores
    public Retangulo() {
    }
    public Retangulo(float lado, float altura) {
        super(lado);
        this.altura = altura;
    }

    //Getters/Setters
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    //Métodos da classe (particulares)
    public float calcularArea() {
        return super.getLado() * altura;
    }
}
