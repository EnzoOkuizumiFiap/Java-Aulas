package br.com.fiap.dao;

import br.com.fiap.to.RemedioTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class RemedioDAO {

    public ArrayList<RemedioTO> findAll(){
        ArrayList<RemedioTO>remedios = new ArrayList<>();

        RemedioTO remedio = new RemedioTO(1L,"Loratadina", 7.93, LocalDate.parse("2023-10-10"), LocalDate.parse("2025-10-10"));
        remedios.add(remedio);

        remedio = new RemedioTO(2L, "Amoxicilina", 26.50, LocalDate.now(), LocalDate.now().plusYears(2));
        remedios.add(remedio);

        return remedios;
    }

}
