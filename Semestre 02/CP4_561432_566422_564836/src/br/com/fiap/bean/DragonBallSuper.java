package br.com.fiap.bean;

import java.io.*;

/**
 * Classe que representa um personagem de Dragon Ball Super.
 * Contém atributos como nome, KI, técnicas, velocidade e transformações, além de métodos para ler e gravar os dados dos personagens em arquivo.
 * A classe implementa a Interface {@code IDBSuper}.
 *
 * @author Enzo, Milton e Lucas Barros
 * @version 1.0
 * */

/*
 * Integrantes:
 * Enzo Okuizumi RM561432
 * Milton Jakson RM564836
 * Lucas Barros RM 566422
 * */

public class DragonBallSuper implements IDBSuper{
    private String nome_do_personagem;
    private int KI, tecnicas, velocidade, transformacoes;

    public DragonBallSuper() {
    }

    public String getNome() {
        return nome_do_personagem;
    }

    public void setNome_do_personagem(String nome_do_personagem) {
        this.nome_do_personagem = nome_do_personagem;
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

    public int getTransformacoes() {
        return transformacoes;
    }

    public void setTransformacoes(int transformacoes) {
        this.transformacoes = transformacoes;
    }

    /**
     * Metodo ler() lê os dados de um personagem de Dragon Ball Super a partir de um arquivo de texto.
     * O arquivo deve estar localizado no caminho informado e possuir o seguinte formato:
     * <pre>
     *     nome_do_personagem
     *     KI
     *     tecnicas
     *     velocidade
     *     transformacoes
     * </pre>
     *
     * Exemplo de conteúdo do arquivo:
     * <pre>
     *     Goku
     *     9000
     *     8500
     *     90
     *     5
     * </pre>
     *
     * @param path - caminho da pasta onde o arquivo do personagem está localizado
     * @return um objeto {@code DragonBallSuper} preenchido com dados lidos do arquivo
     * @throws IOException - Caso o arquivo não seja encontrado ou ocorra algum erro de leitura
     * */
    public DragonBallSuper ler(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path + "/" + nome_do_personagem + ".txt"));
        nome_do_personagem = br.readLine();
        KI = Integer.parseInt(br.readLine());
        tecnicas = Integer.parseInt(br.readLine());
        velocidade = Integer.parseInt(br.readLine());
        transformacoes = Integer.parseInt(br.readLine());
        br.close();
        return this;
    }

    /**
     * Grava os dados do personagem em um arquivo de texto no diretório informado.
     * O nome do arquivo será composto pelo nome do personagem com extensão ".txt".
     * O conteúdo do arquivo seguirá o seguinte formato:
     * <pre>
     *     nome_do_personagem
     *     KI
     *     tecnicas
     *     velocidade
     *     transformacoes
     * </pre>
     *
     * Caso o diretório informado não exista, ele será criado automaticamente.
     *
     * @param path - caminho da pasta onde o arquivo deve ser salvo.
     * @return Uma mensagem informando se a gravação foi bem-sucedida ou descrevendo a falha ocorrida
     * */
    public String gravar(String path) {
        try {
            File dir = new File(path);
            if (!dir.exists()) {
                dir.mkdir();
            }
            PrintWriter pw = new PrintWriter(path + "/" + nome_do_personagem + ".txt");
            pw.println(nome_do_personagem);
            pw.println(KI);
            pw.println(tecnicas);
            pw.println(velocidade);
            pw.println(transformacoes);
            pw.flush();
            pw.close();
            return "Arquivo gravado com sucesso";
        } catch (IOException e) {
            return "Falha ao gravar arquivo: " + e.getMessage();
        }
    }
}
