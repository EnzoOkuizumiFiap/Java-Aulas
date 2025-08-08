package br.com.fiap;

import java.util.Scanner;

public class Ex03_Scanner {
    public static void main(String[] args) {
        float valorRaio, PI = 3.14F, resultadoAreaCirculo;
        Scanner scan;

        try{
            scan = new Scanner(System.in);

            System.out.print("Digite o raio do círculo: ");
            valorRaio = scan.nextFloat();

            resultadoAreaCirculo = PI * (valorRaio * valorRaio);

            System.out.println("O valor da área do círculo é " + resultadoAreaCirculo);
        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }
    }
}
