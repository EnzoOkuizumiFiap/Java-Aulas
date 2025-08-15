package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PokemonHashMap {
    public static void main(String[] args) {
        HashMap<String, String> pokemons = new HashMap<>();

        do {
            try {
                String nome, tipo;

                do {
                    nome = JOptionPane.showInputDialog("Digite o nome de um pokémon ou digite FIM para encerrar.").toUpperCase();

                    if (!nome.equals("FIM")) {
                        if(pokemons.containsKey(nome)) {
                            JOptionPane.showMessageDialog(null, "Este pokémon já foi capturado!");
                        } else {
                            tipo = JOptionPane.showInputDialog("Digite o TIPO deste pokémon.").toUpperCase();
                            pokemons.put(nome, tipo);
                        }
                    }

                } while (!nome.equals("FIM")); //Nome é diferente de FIM

                //Buscando pokémons
                String escolha = JOptionPane.showInputDialog("Escolha um TIPO qualquer de pokémon.").toUpperCase();

                ArrayList<String> nomesEncontrados = new ArrayList<>();

                for (Map.Entry<String, String> pokemon : pokemons.entrySet()) { //Percorrendo Pokemons linha a linha
                    if (pokemon.getValue().equals(escolha)) {
                        nomesEncontrados.add(pokemon.getKey());
                    }
                }

                if (nomesEncontrados.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não há Pokémons capturados do tipo:" + escolha);
                } else {
                    JOptionPane.showMessageDialog(null, "Lista de Pokémons capturados do tipo:" + escolha + "\n" + nomesEncontrados);
                }

            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0 );
        JOptionPane.showMessageDialog(null, "Fim de programa!", "Adeus!", JOptionPane.WARNING_MESSAGE);
    }

}
