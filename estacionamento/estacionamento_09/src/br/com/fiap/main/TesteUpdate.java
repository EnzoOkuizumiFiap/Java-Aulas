package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;

public class TesteUpdate {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();

        //Update no carro
        Carro carroAlterado = new Carro();
        carroAlterado.setPlaca("JKK1900");
        carroAlterado.setCor("Amarelo"); //Alterando a cor do carro de Vermelho para Amarelo
        carroAlterado.setDescricao("Nissan Kicks Batido");

        CarroDAO carroDAO = new CarroDAO(con);
        System.out.println(carroDAO.alterar(carroAlterado));

        //Update no Cliente
        Cliente clienteAlterado = new Cliente();
        clienteAlterado.setIdCliente(1);
        clienteAlterado.setNomeCliente("Enzo"); //Alterando a cor do carro de Vermelho para Amarelo
        clienteAlterado.setPlaca("JKK1900");

        ClienteDAO clienteDAO = new ClienteDAO(con);
        System.out.println(clienteDAO.alterar(clienteAlterado));

        ConnectionFactory.fecharConexao(con);
    }
}
