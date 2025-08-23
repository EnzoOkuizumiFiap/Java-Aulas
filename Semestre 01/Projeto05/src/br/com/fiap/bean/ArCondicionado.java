package br.com.fiap.bean;

public class ArCondicionado { //Classe é um modelo / molde... É como se fosse um projeto de uma caneta no papel e a caneta física é um objeto... Um objeto é gerado a partir de uma classe... Um objeto precisa ter uma classe, mas uma classe não precisa necessariamente de um objeto...

    //Toda classe tem suas características, comportamentos e estado

    //Atributos -> Características de uma classe
    public int temperatura; //public -> O acesso a esse atributo é público para todas as classes
    public String modo; //String é NÃO primitivo

    //Métodos -> Comportamento / Ação de uma classe
    public void aumentarTemperatura(){
        temperatura++;
    }
    public void diminuirTemperatura(){
        temperatura--;
    }

    public void trocarModo(String novoModo){
        modo = novoModo;
    }
}
