package br.com.fiap.model.dao;

import br.com.fiap.model.dto.Filme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FilmeDAO{
    private Connection con;

    public FilmeDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public String inserir(Filme filme) {
        String sql = "INSERT INTO ddd_filme(titulo, genero, produtora) VALUES (?,?,?)";
        try  (PreparedStatement ps = getCon().prepareStatement(sql)){
            ps.setString(1, filme.getTitulo());
            ps.setString(2, filme.getGenero());
            ps.setString(3, filme.getProdutora());

            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso!";
            } else {
                return "Falha ao inserir";
            }

        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }

    public String alterar(Filme filme) {
        String sql = "UPDATE ddd_filme SET titulo=?, genero=?, produtora=? WHERE codigo=?";
        try  (PreparedStatement ps = getCon().prepareStatement(sql)){
            ps.setString(1, filme.getTitulo());
            ps.setString(2, filme.getGenero());
            ps.setString(3, filme.getProdutora());
            ps.setInt(4, filme.getCodigo());

            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso!";
            } else {
                return "Falha ao alterar";
            }

        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }

    public String excluir(Filme filme) {
        String sql = "DELETE FROM ddd_filme WHERE codigo=?";
        try  (PreparedStatement ps = getCon().prepareStatement(sql)){
            ps.setInt(1, filme.getCodigo());

            if (ps.executeUpdate() > 0) {
                return "Excluido com sucesso!";
            } else {
                return "Falha ao excluir";
            }

        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }

    public ArrayList<Filme> listarTodos() {
        String sql = "select * from ddd_filme";
        ArrayList<Filme> listaFilme = new ArrayList<>();

        try (PreparedStatement ps = getCon().prepareStatement(sql); ResultSet rs = ps.executeQuery()){
            while (rs.next()) {
                Filme filme = new Filme();
                filme.setCodigo(rs.getInt(1));
                filme.setTitulo(rs.getString(2));
                filme.setGenero(rs.getString(3));
                filme.setProdutora(rs.getString(4));
                listaFilme.add(filme);
            }

            return listaFilme;

        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
            return null;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }
}
