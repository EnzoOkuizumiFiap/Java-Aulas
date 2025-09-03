package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection abrirConexao() {
        //ConnectionFactory é um padrão de Design para gerenciar a criação e fornecimento de CONEXÕES com o banco de dados.
        //Outro ponto, a gente tá fazendo um metodo static, não permite usar uma instancia do objeto e também executa só uma vez. Não permite rodar várias vezes. ah, abrirConexao() é um metodo que vai retornar um objeto dessa interface Connection

        Connection con = null; //Criando objeto de conexão

        //Envolver toda a lógica em um try e catch, pois podemos ter erros e queremos trata-los
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); //Nome da classe do meu driver
            String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL"; //URL do driver
            final String USER = "rm561432"; //Criando uma constante e atribuindo no USER o nosso usuário do banco de dados
            final String PASS = "301006"; //O mesmo aqui... Colocando nossa senha

            con = DriverManager.getConnection(url, USER, PASS); //Vai abrir a conexão com o nosso banco de dados, tudo isso sendo armazenado dentro do con
            System.out.println("Conexão Aberta!");

        } catch (ClassNotFoundException e) {
            System.out.println("Erro: A classe de conexão não foi encontrada! \n" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro de SQL \n" + e.getMessage());
        }

        return con; //Precisamos fazer ele retornar a conexão
    }

    public static void fecharConexao(Connection con) { //Precisamos fechar a conexão depois de usa-la / Precisamos passar um objeto da Interface
        try { //Relembrando: Try e catch é para tratamento de erros
            con.close();
            System.out.println("Conexão fechada!");
        } catch (SQLException e) {
            System.out.println("Erro de SQL \n" + e.getMessage());
        }

    }
}
