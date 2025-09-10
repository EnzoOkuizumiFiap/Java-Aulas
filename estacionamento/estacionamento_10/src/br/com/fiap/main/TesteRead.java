package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;
import java.util.ArrayList;

public class TesteRead {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();

        //Lendo Carro
        CarroDAO carroDAO = new CarroDAO(con);
        ArrayList<Carro> resultado = carroDAO.listarTodos();

        if (resultado != null) {
            for (Carro carro : resultado) {
                System.out.printf("Placa: %s \nCor: %s \nDescrição: %s \n\n", carro.getPlaca(), carro.getCor(), carro.getDescricao());
            }
        }

        //Lendo Clientes
        ClienteDAO clienteDAO = new ClienteDAO(con);
        ArrayList<Cliente> resultadoCliente = clienteDAO.listarTodos();

        if (resultadoCliente != null) {
            for (Cliente cliente : resultadoCliente) {
                System.out.printf("Id do cliente: %d \nNome do Cliente: %s \nPlaca do Cliente: \n\n%s", cliente.getIdCliente(), cliente.getNomeCliente(), cliente.getPlaca());
            }
        }

        ConnectionFactory.fecharConexao(con);
    }
}
