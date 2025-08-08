package br.com.fiap;

import java.util.Scanner;

public class Ex01_Scanner {
    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4, resultadoNota;
        Scanner scan;
        try {
            scan = new Scanner(System.in);

            System.out.print("Digite a 1° nota: ");
            nota1 = scan.nextFloat();
            System.out.print("Digite a 2° nota: ");
            nota2 = scan.nextFloat();
            System.out.print("Digite a 3° nota: ");
            nota3 = scan.nextFloat();
            System.out.print("Digite a 4° nota: ");
            nota4 = scan.nextFloat();

            resultadoNota = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.println("A sua nota é " + resultadoNota);

        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }

    }
}
