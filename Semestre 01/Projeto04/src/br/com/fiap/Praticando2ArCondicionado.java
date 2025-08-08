package br.com.fiap;

public class Praticando2ArCondicionado {
    //Atributos
    public int temperatura;
    public String modo;

    //Métodos
    public void aumentarTemperatura() {
        temperatura++;
    }
    public void diminuirTemperatura() {
        temperatura--;
    }

    public void trocarModo(String novoModo){
        if(novoModo.equals("resfriar") || novoModo.equals("aquecer") || novoModo.equals("ventilar")) {
            modo = novoModo;
        }
    }

}
