package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;

import java.sql.Connection;
import java.util.ArrayList;

public class TesteCarroCRUD {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();

        Carro carro = new Carro();
        CarroDAO carroDAO = new CarroDAO(con);

        //CREATE
        carro.setPlaca("JKK1900");
        carro.setCor("Vermelho");
        carro.setDescricao("Nissan Kicks");
        //System.out.println(carroDAO.inserir(carro));

        carro.setPlaca("ENZ2006");
        carro.setCor("Vermelho");
        carro.setDescricao("Audi TT RS");
        //System.out.println(carroDAO.inserir(carro));

        carro.setPlaca("ELM2025");
        carro.setCor("Branco");
        carro.setDescricao("Toyota Corolla 2025");
        //System.out.println(carroDAO.inserir(carro));

        carro.setPlaca("FRIA17");
        carro.setCor("Branco");
        carro.setDescricao("Honda Civic 2007");
        //System.out.println(carroDAO.inserir(carro)); //Não podemos inserir os carros, pois já inserimos anteriormente.

        carro.setPlaca("KOENIG");
        carro.setCor("Laranja");
        carro.setDescricao("Koenigsegg Jesko");
        //System.out.println(carroDAO.inserir(carro));

        //UPDATE
        Carro carroAlterado = new Carro();
        carroAlterado.setPlaca("JKK1900");
        carroAlterado.setCor("Amarelo"); //Alterando a cor do carro de Vermelho para Amarelo
        carroAlterado.setDescricao("Nissan Kicks Batido");

        System.out.println(carroDAO.alterar(carroAlterado));

        //DELETE
        carro.setPlaca("FRIA17"); //Já excluímos ele
        //System.out.println(carroDAO.excluir(carro));


        //READ
        ArrayList<Carro> resultado = carroDAO.listarTodos();

        if (resultado != null) {
            for (Carro carroLer : resultado) {
                System.out.printf("\nPlaca: %s \nCor: %s \nDescrição: %s \n", carroLer.getPlaca(), carroLer.getCor(), carroLer.getDescricao());
            }
        }

        ConnectionFactory.fecharConexao(con);
    }
}
