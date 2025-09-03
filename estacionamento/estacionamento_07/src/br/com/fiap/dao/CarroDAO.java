package br.com.fiap.dao;

import br.com.fiap.dto.Carro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarroDAO {
    //DAO Data Acess Object (Padrão de Design Pattern) -> Objeto de Acesso a Dados
    //Vamos usar Interface, o DAO se preocupa com acesso aos Dados, CRUD no caso,

    private Connection con;

    public CarroDAO(Connection con) { //Construtor com passagem de parâmetro, não quero permitir que o usuário crie um objeto dessa classe sem passar em qual conexão ele vai fazer isso
        this.con = con;
    }

    public Connection getCon() { //Ele pega a conexão que está aberta. Não vamos ter set, pois não queremos mudar a conexão
        return con;
    }

    //Métodos...
    public String inserir(Carro carro) {
        String sql = "insert into ddd_carro(placa,cor,descricao) values(?,?,?)"; //Precisamos fazer esse comando para inserir o banco de dados

        //try-with-resources -> try com recursos. facilita o gerenciamento de recursos, como conexão de banco de dados. E fecha automaticamente ao final do bloco.
        //PreparedStatement -> Comando Preparado. Ela permite preparar o comando que eu quero executar
        //ResultSet -> Conjunto de Resultados. Permite armazenar os resultados de uma consulta que fiz

        try(PreparedStatement ps = getCon().prepareStatement(sql);) { // getCon() -> Pegar a conexão ativa / prepareStatement -> Preparando esse comando (no caso é aquela String sql que escrevemos anteriormente)
            //Usando try with resources... try com recursos ^^

            ps.setString(1, carro.getPlaca()); //Pegando o valor do ?, e settando no (1 é para referenciar a primeira interrogação) o getPlaca() é para pegar a placa que inserimos aqui no TesteCreate (Que está no main).
            ps.setString(2, carro.getCor()); // O mesmo aqui (2 referencia a segunda interrrogação) e o getCor() pega a cor que inserimos no TesteCreate
            ps.setString(3, carro.getDescricao()); // O mesmo aqui (3 referencia a terceira interrogação) e o getDescricao() pega a descrição que inserimos no TesteCreate

            if (ps.executeUpdate() > 0) { //Verifica se conseguimos inserir as linhas/as informações no banco de dados... Ent se inserimos 1 linha retorna como sendo True e retorna Inserido com sucesso
                return "Inserido com sucesso!";
            } else {
                return "Erro ao inserir!";
            }

        } catch (SQLException e) {
           return "Erro de SQL: " + e.getMessage();
        }
    }
}
