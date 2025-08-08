package fiap.com.br.bean;

import java.util.Objects;

public class ArCondicionado {
    //Atributos
    private int temperatura;
    private String modo;

    //Métodos getter e setter
    public int getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura) {
        try {
            if (temperatura >= 15 && temperatura < 26) {
                this.temperatura = temperatura;
            } else {
                throw new Exception("Temperatura fora da faixa permitida!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getModo() {
        return modo;
    }
    public void setModo(String modo) {
        try {
            if (modo.equalsIgnoreCase("Ventilar") || modo.equalsIgnoreCase("Aquecer") || modo.equalsIgnoreCase("Resfriar")){
                this.modo = modo;
            } else {
                throw new Exception("Modo do Ar Condicionado Inválido");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Métodos específicos
    public void aumentarTemperatura() {
        if (temperatura < 26) {
            temperatura++;
        } else {
            System.out.println("Temperatura já está no máximo (26°C)");
        }
    }

    public void diminuirTemperatura() {
        if (temperatura > 15) {
            temperatura--;
        } else {
            System.out.println("Temperatura já está no mínimo (15°C)");
        }
    }
}
