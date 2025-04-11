package br.com.fiap.bean;

public class Radio {
    //Atributos
    private int volume;
    private float estacao;


    //Métodos getter/setter
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        try {
            if (volume >= 0 && volume <= 100) {
                this.volume = volume;
            } else {
                throw new Exception("Valor fora da faixa permitida (Min 0 até Max 100");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public float getEstacao() {
        return estacao;
    }
    public void setEstacao(float estacao) {
        try {
            if (estacao >= 80.0 && estacao <= 105.0) {
                this.estacao = estacao;
            } else {
                throw new Exception("Estação fora da sintonia (Min 80.0 até max 105.0)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    //Métodos da classe (particulares)
    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }
    public void diminuirVolume(){
        if (volume > 0) {
            volume--;
        }
    }
}
