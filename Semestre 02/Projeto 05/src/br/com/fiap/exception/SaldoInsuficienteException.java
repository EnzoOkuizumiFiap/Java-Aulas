package br.com.fiap.exception;

public class SaldoInsuficienteException extends Exception { //Mudar de Runtime para Exception para que seja seu filho

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
