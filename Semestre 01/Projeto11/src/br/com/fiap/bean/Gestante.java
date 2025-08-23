package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Gestante {
    //Atributos
    private String nome;
    private LocalDate dataDaGestacao;

    //Construtores
    public Gestante(){
    }

    public Gestante(String nome, LocalDate dataDaGestacao) { //Os Construtores são para definir valores padrão  quando criamos um novo Objeto... Tipo, nome da gestante é cassandra, então quando criamos uma nova gestante automaticamente o seu nome é cassandra... Mas como usamos no main JOptionPane e inserimos os dados dela na execução, então temos que referenciar o objeto
        this.nome = nome;
        //this.dataDaGestacao = dataDaGestacao;
        setDataDaGestacao(dataDaGestacao);
    }

    //Métodos getters/setters

    /* Métodos acessores: Getters -> pegar
    *
    * Métodos modificadores: Setters -> definir
    * */

    public String getNome() { //Chamando o metodo getNome para pegar o nome da pessoa
        return nome;
    }
    public void setNome(String nome) { //Ele definiria o nome da pessoa no main e está setando o nome no main
        this.nome = nome;
    }

    public LocalDate getDataDaGestacao() {
        return dataDaGestacao;
    }
    public void setDataDaGestacao(LocalDate dataDaGestacao) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate limiteGestacao = dataAtual.minusMonths(9).minusDays(1);
        try {
            if (!dataDaGestacao.isBefore(limiteGestacao) && !dataDaGestacao.isAfter(dataAtual)){
                this.dataDaGestacao = dataDaGestacao;
            } else{
                throw new Exception("Data da Gestação Inválida!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
    }

    //Métodos da classe (particulares)
    public int tempoDeGestacao(){
        LocalDate dataAtual = LocalDate.now();
        Period gestacao = Period.between(dataDaGestacao, dataAtual);
        return gestacao.getMonths();
    }
}
