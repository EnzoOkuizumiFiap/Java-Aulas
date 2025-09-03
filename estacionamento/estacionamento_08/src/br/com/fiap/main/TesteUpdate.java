package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;

import java.sql.Connection;

public class TesteUpdate {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();

        Carro carroAlterado = new Carro();
        carroAlterado.setPlaca("JKK1900");
        carroAlterado.setCor("Amarelo"); //Alterando a cor do carro de Vermelho para Amarelo
        carroAlterado.setDescricao("Nissan Kicks Batido");

        CarroDAO carroDAO = new CarroDAO(con);
        System.out.println(carroDAO.alterar(carroAlterado));

        ConnectionFactory.fecharConexao(con);
    }
}
