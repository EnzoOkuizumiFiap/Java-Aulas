package br.com.fiap.model.dao;

import br.com.fiap.model.dto.Filme;

import java.util.ArrayList;

public interface IDAO {
    public String inserir(Object object);
    public String alterar(Object object);
    public String excluir(Object object);
    public ArrayList<Filme> listarTodos();
}
