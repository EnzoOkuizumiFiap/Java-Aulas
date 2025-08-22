package br.com.fiap.bean;

import java.io.IOException;

public interface IDBSuper {
    DragonBallSuper ler(String path) throws IOException;
    String gravar(String path) throws IOException;
}
