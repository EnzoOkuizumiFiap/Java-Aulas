package br.com.fiap.bo;

import br.com.fiap.dao.RemedioDAO;
import br.com.fiap.to.RemedioTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class RemedioBO {
    private RemedioDAO remedioDAO;

    /*Encontrar todos os remédios*/
    public ArrayList<RemedioTO> findAll() {
        remedioDAO = new RemedioDAO();
        // Aqui se implementa a regra de negócios
        return remedioDAO.findAll();
    }

    /*Encontrar remédio pelo código*/
    public RemedioTO findByCodigo(Long codigo) {
        remedioDAO = new RemedioDAO();
        // Aqui se implementa a regra de negócios
        return remedioDAO.findByCodigo(codigo);
    }

    /*Salvar um remédio*/
    public RemedioTO save (RemedioTO remedio) {
        remedioDAO = new RemedioDAO();

        // Regra de negócio: Verificando se o remédio já está vencido
        //if (remedio.getDataDeValidade().isBefore(LocalDate.now())) {
        //    return null;
        //}


        return remedioDAO.save(remedio);
    }
}
