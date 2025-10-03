package br.com.fiap.bo;

import br.com.fiap.dao.RemedioDAO;
import br.com.fiap.to.RemedioTO;

import java.util.ArrayList;

public class RemedioBO {
    private RemedioDAO remedioDAO;

    public ArrayList<RemedioTO> findAll() {
        remedioDAO = new RemedioDAO();

        //Aqui se implementa as regras de negócio
        //No caso, não temos nada ainda...

        //Retorna remedioDAO
        return remedioDAO.findAll();
    }
}
