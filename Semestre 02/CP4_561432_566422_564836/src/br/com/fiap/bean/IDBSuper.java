package br.com.fiap.bean;

import java.io.IOException;

/**
 * Interface que define as operações básicas para leitura e gravação de personagens Dragon Ball Super.
 *
 * @author Enzo, Milton e Lucas Barros
 * @version 1.0
 * */
public interface IDBSuper {

    /**
     * Lê os dados de um personagem a partir de um arquivo localizado no caminho especificado.
     *
     * @param path - Caminho da pasta onde o arquivo do personagem está localizado.
     * @return Um objeto {@code DragonBallSuper} preenchido com os dados lidos do arquivo.
     * @throws IOException - Caso o arquivo não seja encontrado ou ocorra algum erro de leitura.
     **/
    DragonBallSuper ler(String path) throws IOException;

    /**
     * Grava os dados do personagem em um arquivo no diretório especificado
     *
     * @param path - Caminho da pasta onde o arquivo deve ser salvo.
     * @return Uma mensagem informando se a gravação foi bem-sucedida ou descrevendo a falha ocorrida.
     * */
    String gravar(String path);
}
