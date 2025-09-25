package br.com.fiap.controller;

import br.com.fiap.model.dao.ConnectionFactory;
import br.com.fiap.model.dao.FilmeDAO;
import br.com.fiap.model.dto.Filme;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class FilmeController {
    public String inserirFilme (String titulo, String genero, String produtora) throws ClassNotFoundException, SQLException {
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();

        Filme filme = new Filme();
        filme.setTitulo(titulo);
        filme.setGenero(genero);
        filme.setProdutora(produtora);

        FilmeDAO filmeDAO = new FilmeDAO(con);
        resultado = filmeDAO.inserir(filme);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }

    public String alterarFilme (int codigo, String titulo, String genero, String produtora) throws ClassNotFoundException, SQLException {
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();

        Filme filme = new Filme();
        filme.setCodigo(codigo);
        filme.setTitulo(titulo);
        filme.setGenero(genero);
        filme.setProdutora(produtora);

        FilmeDAO filmeDAO = new FilmeDAO(con);
        resultado = filmeDAO.alterar(filme);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }

    public String excluirFilme (int codigo) throws ClassNotFoundException, SQLException {
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();

        Filme filme = new Filme();
        filme.setCodigo(codigo);

        FilmeDAO filmeDAO = new FilmeDAO(con);
        resultado = filmeDAO.excluir(filme);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }

    public String listarTodosFilmes() throws ClassNotFoundException, SQLException {
        Connection con = ConnectionFactory.abrirConexao();

        FilmeDAO filmeDAO = new FilmeDAO(con);
        ArrayList<Filme> resultado = filmeDAO.listarTodos();

        ArrayList<String> filmes = new ArrayList<>();

        for (Filme filmeLer : resultado) {
            filmes.add(String.format("\nCódigo:" + filmeLer.getCodigo() + "\nTítulo:"  +  filmeLer.getTitulo() + "\nGênero: " + filmeLer.getGenero() + "\nProdutora: " + filmeLer.getProdutora() + "\n"));
        }

        ConnectionFactory.fecharConexao(con);
        return filmes.toString();
    }
}
