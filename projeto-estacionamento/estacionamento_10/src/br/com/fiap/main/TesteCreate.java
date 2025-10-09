package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;

public class TesteCreate {
    public static void main(String[] args) {
        //CRUD, estamos usando o Create

        Connection con = ConnectionFactory.abrirConexao(); //Abrindo a conexão

        //Settando os dados / inserindo os dados...
        Carro carro1 = new Carro(); //Instanciando a classe carro
        carro1.setPlaca("JKK1900");
        carro1.setCor("Vermelho");
        carro1.setDescricao("Nissan Kicks");

        Carro carro2 = new Carro();
        carro2.setPlaca("ENZ2006");
        carro2.setCor("Vermelho");
        carro2.setDescricao("Audi TT RS");

        Carro carro3 = new Carro();
        carro3.setPlaca("ELM2025");
        carro3.setCor("Branco");
        carro3.setDescricao("Toyota Corolla 2025");

        Carro carro4 = new Carro();
        carro4.setPlaca("FRIA7");
        carro4.setCor("Branco");
        carro4.setDescricao("Honda Civic 2007");

        //Cuidado ao inserir valores grandes, ele da erro!

        //Inserindo as informações no banco de dados
        //sout(Objeto carroDAO.metodo inserir(carro que deve ser inserido: carro2))
        CarroDAO carroDAO = new CarroDAO(con);
//        System.out.println(carroDAO.inserir(carro1));
//        System.out.println(carroDAO.inserir(carro2));
//        System.out.println(carroDAO.inserir(carro3));
//        System.out.println(carroDAO.inserir(carro4));

        //Inserindo Clientes
        Cliente cliente1 = new Cliente();
        cliente1.setIdCliente(1);
        cliente1.setNomeCliente("Enzo");
        cliente1.setPlaca("JKK1900");

        Cliente cliente2 = new Cliente();
        cliente2.setIdCliente(2);
        cliente2.setNomeCliente("Mikael");
        cliente2.setPlaca("ELM2025");

        Cliente cliente3 = new Cliente();
        cliente3.setIdCliente(3);
        cliente3.setNomeCliente("João");
        cliente3.setPlaca("ENZ2006");

        //Inserindo Clientes
        ClienteDAO clienteDAO = new ClienteDAO(con);
        System.out.println(clienteDAO.inserir(cliente3));


        //IMPORTANTE vv
        ConnectionFactory.fecharConexao(con); //Precisamos fechar a conexão no final...
    }
}
