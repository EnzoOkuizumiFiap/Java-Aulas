package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;

import java.sql.Connection;

public class TesteDelete {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();

        Carro carroExcluir = new Carro();
        carroExcluir.setPlaca("ENZ2006");

        CarroDAO carroDAO = new CarroDAO(con);
        System.out.println(carroDAO.excluir(carroExcluir));

        ConnectionFactory.fecharConexao(con);
    }
}
