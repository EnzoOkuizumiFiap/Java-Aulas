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
        Carro carro = new Carro(); //Instanciando a classe carro

        carro.setPlaca("JKK1900");
        carro.setCor("Vermelho");
        carro.setDescricao("Nissan Kicks");

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
        System.out.println(carroDAO.inserir(carroTeste)); // Inserindo
        //Objeto carroDAO, metodo inserir, carro que deve ser inserido: carro2

        //IMPORTANTE vv
        ConnectionFactory.fecharConexao(con); //Precisamos fechar a conexão no final...
    }
}
