package br.com.fiap.bean;

import javax.swing.*;

public class Equipe {
    //Atributos
    private String nome;
    private String[] integrantes;

    //Construtores
    public Equipe() {
    }
    public Equipe(String nome, String[] integrantes) {
        this.nome = nome;
        this.integrantes = integrantes;
    }

    //Métodos Getters/Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getIntegrantes() {
        return integrantes;
    }
    public void setIntegrantes(String[] integrantes) {
        this.integrantes = integrantes;
    }

    //Métodos da classe (particulares)
    public void listarEquipe() {
        String exibe = String.format("Nome da Equipe: %S \n", nome);
        int cont = 1;
        for(String i : integrantes) {
            exibe += String.format("Integrante %d: %s\n", cont, i);
            cont ++;
        }
        JOptionPane.showMessageDialog(null, exibe, "Listagem de Equipe", JOptionPane.INFORMATION_MESSAGE);
    }
}
