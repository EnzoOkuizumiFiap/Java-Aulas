package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;

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

        Carro carroTeste = new Carro();
        carroTeste.setPlaca("TESTE"); //Cuidado ao inserir valores grandes, ele da erro!

        //Inserindo as informações no banco de dados
        CarroDAO carroDAO = new CarroDAO(con); //Passando a nossa conexão do banco de dados
        System.out.println(carroDAO.inserir(carro1)); // Inserindo
        System.out.println(carroDAO.inserir(carro2)); // Inserindo
        System.out.println(carroDAO.inserir(carro3)); // Inserindo
        //sout(Objeto carroDAO, metodo inserir, carro que deve ser inserido: carro2)

        //IMPORTANTE vv
        ConnectionFactory.fecharConexao(con); //Precisamos fechar a conexão no final...
    }
}
