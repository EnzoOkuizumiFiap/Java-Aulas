package br.com.fiap.model.dto;

/*
 * Integrantes:
 * Enzo Okuizumi RM561432
 * Milton Jakson RM564836
 * Lucas Barros RM 566422
 * */

public class Filme {
    //atributos
    private int codigo;
    private String titulo;
    private String genero;
    private String produtora;
    
    //construtores
    public Filme() {}

    //getters/setters
    
    //codigo
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //titulo
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //genero
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    //produtora
    public String getProdutora() {
        return produtora;
    }
    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }
}
