package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;
import br.com.fiap.bean.FolhaDePagamento;
import br.com.fiap.bean.Televisor;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        tv.canal = 5;
        tv.volume = 7;

        //Exercício TV
        tv.trocarCanal(4);
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();

        System.out.printf("Informações da TV\nVolume atual: %d \nCanal atual: %d", tv.volume, tv.canal);

        //Exercício Ar Condicionado
        ArCondicionado ar = new ArCondicionado();
        ar.temperatura = 25;
        ar.modo = "Ventilar";
        ar.trocarModo("Resfriar");
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();

        String mensagem = String.format("\n\nInformações do Ar Condicionado\nTemperatura atual: %d°C\nModo atual: %s", ar.temperatura, ar.modo);

        System.out.println(mensagem);
        JOptionPane.showMessageDialog(null, mensagem);

        //Exercício Folha de Pagamento
        FolhaDePagamento folha = new FolhaDePagamento();
        folha.salarioBruto = 50000;
        folha.numeroDeDependentes = 4;
        folha.planoDeSaude = 500;
        folha.descontoINSS = 10;

        System.out.println("\n\nO Valor da folha de pagamento é R$" + folha.calcularSalarioLiquido());
    }
}
