package br.com.fiap.bean;

import java.io.*;

public class Pessoa {
    //Atributos
    private String codigo;
    private String nome;
    private String email;

    //construtores
    public Pessoa() {
    }
    public Pessoa(String codigo, String nome, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
    }

    //Getters and Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Métodos
    public Pessoa ler(String path) throws IOException { /*Delega o tratamento de erros para IOException*/
        BufferedReader br = new BufferedReader(new FileReader(path + "/" + codigo + ".txt")); /*Lendo dados*/
        codigo = br.readLine(); /*Ele lê e pula para próxima linha. O read() só lê uma linha... Ent ficaria repetindo codigo*/
        nome = br.readLine();
        email = br.readLine();
        br.close(); /*Temos que fechar no final*/
        return this;
    }

    public String gravar(String path) {
        try {
            File dir = new File(path);
            if (!dir.exists()) { /*Ele vê se a pasta existe*/
                dir.mkdir();
            }
            PrintWriter pw = new PrintWriter(path + "/" + codigo + ".txt"); /*Gravando o arquivo*/
            pw.println(codigo); /*Escrevendo no arquivo... Gravando no txt codigo e assim por diante*/
            pw.println(nome);
            pw.println(email);
            pw.flush(); /*Salva os dados inseridos no arquivo*/
            pw.close();
            return "Arquivo gravado com sucesso";
        } catch (IOException e) {
            return "Falha ao gravar arquivo: " + e.getMessage();
        }
    }
}
