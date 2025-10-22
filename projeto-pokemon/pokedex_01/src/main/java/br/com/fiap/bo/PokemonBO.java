package br.com.fiap.bo;

import br.com.fiap.dao.PokemonoDAO;
import br.com.fiap.to.PokemonTO;

import java.util.ArrayList;

public class PokemonBO {
    private PokemonoDAO pokemonoDAO;

    public ArrayList<PokemonTO> findAll() {
        pokemonoDAO = new PokemonoDAO();
        // aqui se implementa as regras de negócios
        return pokemonoDAO.findAll();
    }
}
