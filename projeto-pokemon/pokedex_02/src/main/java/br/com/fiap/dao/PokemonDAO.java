package br.com.fiap.dao;

import br.com.fiap.to.PokemonTO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class PokemonDAO {
    public ArrayList<PokemonTO> findAll() {
        ArrayList<PokemonTO> pokemons = new ArrayList<>();
        PokemonTO pokemon = new PokemonTO(1L, "Pikachu", 5.98, 35.8, LocalDate.parse("2024-10-10"));
        pokemons.add(pokemon);
        pokemon = new PokemonTO(1L, "Charizard", 9.21, 95.5, LocalDate.parse("2025-10-09"));
        pokemons.add(pokemon);
        pokemon = new PokemonTO(1L, "Bulbasaur", 0.70, 6.9, LocalDate.parse("2023-10-01"));
        pokemons.add(pokemon);

        return pokemons;
    }

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
