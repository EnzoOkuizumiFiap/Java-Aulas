package br.com.fiap.bean;

public class Televisor {
    //Atributos
    private int volume;
    private int canal;

    //Métodos getter e setter
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        try {
            if (canal == 2 || canal == 4 || canal == 5 || canal == 7 || canal == 13) {
                this.canal = canal;
            } else {
                throw new Exception("Canal não Permitido, selecione outro.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        try {
            if (volume >= 0 && volume <= 20){
                this.volume = volume;
            } else {
                throw new Exception("Volume fora da faixa permitida");
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
