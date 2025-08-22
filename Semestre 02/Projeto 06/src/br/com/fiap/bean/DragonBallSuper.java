package br.com.fiap.bean;

import java.io.*;

public class DragonBallSuper {
    private String nome;
    private int KI, tecnicas, velocidade, transformacao;

    public DragonBallSuper() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getKI() {
        return KI;
    }

    public void setKI(int KI) {
        this.KI = KI;
    }

    public int getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(int tecnicas) {
        this.tecnicas = tecnicas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getTransformacao() {
        return transformacao;
    }

    public void setTransformacao(int transformacao) {
        this.transformacao = transformacao;
    }

    public DragonBallSuper ler(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path + "/" + nome + ".txt"));
        nome = br.readLine();
        KI = Integer.parseInt(br.readLine());
        tecnicas = Integer.parseInt(br.readLine());
        velocidade = Integer.parseInt(br.readLine());
        transformacao = Integer.parseInt(br.readLine());
        br.close();
        return this;
    }

    public String gravar(String path) {
        try {
            File dir = new File(path);
            if (!dir.exists()) {
                dir.mkdir();
            }
            PrintWriter pw = new PrintWriter(path + "/" + nome + ".txt");
            pw.println(nome);
            pw.println(KI);
            pw.println(tecnicas);
            pw.println(velocidade);
            pw.println(transformacao);
            pw.flush();
            pw.close();
            return "Arquivo gravado com sucesso";
        } catch (IOException e) {
            return "Falha ao gravar arquivo: " + e.getMessage();
        }
    }
}