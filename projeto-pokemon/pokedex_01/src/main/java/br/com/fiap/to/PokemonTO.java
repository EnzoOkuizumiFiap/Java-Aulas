package br.com.fiap.to;

import java.time.LocalDate;

public class PokemonTO {
    private Long codigo;
    private String nome;
    private Double altura;
    private Double peso;
    private LocalDate dataDaCaptura;

    public PokemonTO() {
    }

    public PokemonTO(Long codigo, String nome, Double altura, Double peso, LocalDate dataDaCaptura) {
        this.codigo = codigo;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.dataDaCaptura = dataDaCaptura;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public LocalDate getDataDaCaptura() {
        return dataDaCaptura;
    }

    public void setDataDaCaptura(LocalDate dataDaCaptura) {
        this.dataDaCaptura = dataDaCaptura;
    }
}
