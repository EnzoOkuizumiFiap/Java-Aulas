package br.com.fiap.dao;

import br.com.fiap.to.PokemonTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class PokemonoDAO {
    public ArrayList<PokemonTO> findAll() {
        ArrayList<PokemonTO> pokemons = new ArrayList<>();
        PokemonTO pokemon = new PokemonTO(1L, "Pikachu", 5.98, 35.8, "Elétrico", LocalDate.parse("2024-10-10"));
        pokemons.add(pokemon);
        pokemon = new PokemonTO(1L, "Charizard", 9.21, 95.5, "Fogo", LocalDate.parse("2025-10-10"));
        pokemons.add(pokemon);
        pokemon = new PokemonTO(1L, "Bulbasaur", 0.70, 6.9, "Planta", LocalDate.parse("2023-10-10"));
        pokemons.add(pokemon);
        return pokemons;
    }
}
