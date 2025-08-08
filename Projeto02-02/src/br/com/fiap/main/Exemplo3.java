package br.com.fiap.main;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Exemplo3 {
    public static void main(String[] args) {
        System.out.println("Usando Arraylist com números:");
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(34, 7, 55, 2, 89, 23));

        for (int i = 0; i < numeros.size(); i++) {
            System.out.printf("%d ", numeros.get(i));
        }

        System.out.println("\nOrdenando os números:");
        Collections.sort(numeros);
        for (Integer i : numeros) {
            System.out.printf("%d ", i);
        }
    }
}
