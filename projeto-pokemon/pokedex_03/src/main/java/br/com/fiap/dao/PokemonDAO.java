package br.com.fiap.dao;

import br.com.fiap.to.PokemonTO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class PokemonDAO {

    /*findAll de todos os Pokemons*/
    public ArrayList<PokemonTO> findAll() {
        ArrayList<PokemonTO> pokemons = new ArrayList<PokemonTO>();
        String sql = "select * from ddd_pokedex order by codigo";

        try(PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            if(rs != null) {
                while(rs.next()) {
                    PokemonTO pokemon = new PokemonTO();

                    pokemon.setCodigo(rs.getLong("codigo"));
                    pokemon.setNome(rs.getString("nome"));
                    pokemon.setAltura(rs.getDouble("altura"));
                    pokemon.setPeso(rs.getDouble("peso"));
                    pokemon.setDataDaCaptura(rs.getDate("data_da_captura").toLocalDate());
                    pokemons.add(pokemon);

                }
            } else {
                return null;
            }

        } catch (SQLException e) {
            System.out.println("Erro de consulta: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return pokemons;
    }

    /*findByCodigo de um pokemon*/
    public PokemonTO findByCodigo(Long codigo) {
        PokemonTO pokemon = new PokemonTO();
        String sql = "select * from ddd_pokedex where codigo = ?";

        try(PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)) {
            ps.setLong(1, codigo);
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                pokemon.setCodigo(rs.getLong("codigo"));
                pokemon.setNome(rs.getString("nome"));
                pokemon.setAltura(rs.getDouble("altura"));
                pokemon.setPeso(rs.getDouble("peso"));
                pokemon.setDataDaCaptura(rs.getDate("data_da_captura").toLocalDate());
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionFactory.closeConnection();
        }
        return pokemon;
    }

    /*save de todos os Pokemons*/
    public PokemonTO save(PokemonTO pokemon) {
        String sql = "insert into ddd_pokedex (nome, altura, peso, data_da_captura) values(?,?,?,?)";

        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)) {

            ps.setString(1, pokemon.getNome());
            ps.setDouble(2, pokemon.getAltura());
            ps.setDouble(3, pokemon.getPeso());
            ps.setDate(4, Date.valueOf(pokemon.getDataDaCaptura()));
            ps.executeUpdate();

            if(ps.executeUpdate() > 0) {
                return pokemon;
            } else {
                return null;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        } finally {
            System.out.println("Fechando o programa!");
            ConnectionFactory.closeConnection();
        }
        return null;
    }
}
