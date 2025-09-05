package br.com.fiap.dao;

import br.com.fiap.dto.Carro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CarroDAO {
    private Connection con;

    public CarroDAO(Connection con) { //Construtor com passagem de parâmetro, não quero permitir que o usuário crie um objeto dessa classe sem passar em qual conexão ele vai fazer isso
        this.con = con;
    }

    public Connection getCon() { //Ele pega a conexão que está aberta. Não vamos ter set, pois não queremos mudar a conexão
        return con;
    }

    //Métodos...

    //CRUD - Create, Read, Update, Delete.
    //Inserindo dados no banco de dados via Java - C de Create
    public String inserir(Carro carro) {
        String sql = "insert into ddd_carro(placa,cor,descricao) values(?,?,?)";

        try(PreparedStatement ps = getCon().prepareStatement(sql);) {

            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());

            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso!";
            } else {
                return "Erro ao inserir!";
            }

        } catch (SQLException e) {
           return "Erro de SQL: " + e.getMessage();
        }
    }

    //Alterando dados do banco de dados via Java - U de Update
    public String alterar(Carro carro) {
        String sql = "update ddd_carro set cor=?, descricao=? where placa=?";
        try (PreparedStatement ps = getCon().prepareStatement(sql);) {

            ps.setString(1, carro.getCor());
            ps.setString(2, carro.getDescricao());
            ps.setString(3, carro.getPlaca());

            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso!";
            } else {
                return "Erro ao alterar!";
            }

        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    //Excluindo dados no banco de dados via Java - D de Delete
    public String excluir(Carro carro) {
        String sql = "delete from ddd_carro where placa=?";
        try (PreparedStatement ps = getCon().prepareStatement(sql);){

            ps.setString(1, carro.getPlaca());

            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso!";
            } else {
                return "Erro ao excluir!";
            }

        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    //Listando todos os carros com Arraylist<> - R de Read
    public ArrayList<Carro> listarTodos() {
        String sql = "select * from ddd_carro";
        ArrayList<Carro> listaCarro = new ArrayList<>();

        try (PreparedStatement ps = getCon().prepareStatement(sql);
             ResultSet rs = ps.executeQuery();){

            if (rs != null) {
                while (rs.next()) { //rs.next() retorna verdadeiro ou falso
                    Carro carro = new Carro();
                    carro.setPlaca(rs.getString(1));
                    carro.setCor(rs.getString(2));
                    carro.setDescricao(rs.getString(3));
                    listaCarro.add(carro);
                }
                return listaCarro;

            } else {
                return null;
            }

        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
            return null;
        }
    }
}
