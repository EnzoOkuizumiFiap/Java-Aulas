package br.com.fiap.dto;

public class Carro {
    //bean agora se torna o dto
    //DTO -> Objeto de Transferência de Dados... Representa as entidades do banco de dados na aplicação

    private String placa;
    private String cor;
    private String descricao;

    public Carro(){
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
