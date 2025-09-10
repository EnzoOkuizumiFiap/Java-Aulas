package br.com.fiap.main;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Cliente;
import java.sql.Connection;
import java.util.ArrayList;

public class TesteClienteCRUD {
    public static void main(String[] args) {
        //CRUD
        Connection con = ConnectionFactory.abrirConexao(); //Abrindo a conexão

        ClienteDAO clienteDAO = new ClienteDAO(con);

        Cliente cliente = new Cliente();

        //O código precisa estar comentado, pois pode ocorrer conflito no banco de dados
        //Inserindo Clientes - C de CREATE

        //Cliente 1
        cliente.setIdCliente(1);
        cliente.setNomeCliente("João");
        cliente.setPlaca("JKK1900");
        //Inserindo Cliente 1
        System.out.println(clienteDAO.inserir(cliente));

        //Cliente 2 - Ele vai remover no final do programa...
        cliente.setIdCliente(2);
        cliente.setNomeCliente("Milton");
        cliente.setPlaca("ELM2025");
        //Inserindo Cliente 2
        System.out.println(clienteDAO.inserir(cliente));

        //Cliente 3
        cliente.setIdCliente(3);
        cliente.setNomeCliente("Enzo");
        cliente.setPlaca("ENZ2006");
        //Inserindo Cliente 3
        System.out.println(clienteDAO.inserir(cliente));

        //Cliente 4
        cliente.setIdCliente(4);
        cliente.setNomeCliente("Enzin");
        cliente.setPlaca("KOENIG");
        //Inserindo Cliente 4
        System.out.println(clienteDAO.inserir(cliente));

        //Alterando os dados de um cliente - U de UPDATE
        cliente.setIdCliente(3);
        cliente.setNomeCliente("Josenelson");
        cliente.setPlaca("JKK1900");
        System.out.println(clienteDAO.alterar(cliente));

        //Excluindo um cliente - D de DELETE
        cliente.setIdCliente(2);
        System.out.println(clienteDAO.excluir(cliente));


        //Listando todos os clientes - R de READ
        ArrayList<Cliente> resultado = clienteDAO.listarTodos();
        if (resultado != null) {
            for (Cliente cliente1 : resultado) {
                System.out.println("Id: " + cliente1.getIdCliente());
                System.out.println("Nome: " + cliente1.getNomeCliente());
                System.out.println("Placa: " + cliente1.getPlaca());
                System.out.println();
            }
        }

        ConnectionFactory.fecharConexao(con);
    }
}
