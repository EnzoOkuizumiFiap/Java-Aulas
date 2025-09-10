package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;

public class TesteDelete {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();

        //Excluindo Carro
        Carro carroExcluir = new Carro();
        carroExcluir.setPlaca("ELM2025");

        CarroDAO carroDAO = new CarroDAO(con);
        System.out.println(carroDAO.excluir(carroExcluir));


        //Excluindo Cliente
        Cliente clienteExcluir = new Cliente();
        clienteExcluir.setIdCliente(3);

        ClienteDAO clienteDAO = new ClienteDAO(con);
        System.out.println(clienteDAO.excluir(clienteExcluir));

        ConnectionFactory.fecharConexao(con);
    }
}
