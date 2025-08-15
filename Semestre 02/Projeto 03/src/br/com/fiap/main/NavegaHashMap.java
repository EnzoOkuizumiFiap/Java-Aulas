package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class NavegaHashMap {
    public static void main(String[] args) {
        //Trabalhando com coleção de dados
        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Astrogildo", 18);
        pessoas.put("Berisvaldo", 25);
        pessoas.put("Gumercindo", 18);

        System.out.println(pessoas +"\n" );

        //Precisamos fazer uma estrutura de repetição para navegar no HashMap - Vamos fazer ForEach
        for (Map.Entry<String, Integer> i : pessoas.entrySet()){ //A escrita é diferente para HashMap
            //pessoas.entrySet() pega a variável linha e guarda no i...
            System.out.println("Chave:" + i.getKey() + "\nValor:" + i.getValue());

        }
    }
}
