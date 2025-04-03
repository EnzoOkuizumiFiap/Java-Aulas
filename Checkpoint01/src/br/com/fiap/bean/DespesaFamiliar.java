package br.com.fiap.bean;
/*
 * Nome: Enzo Okuizumi Miranda de Souza RM: 561432
 * Nome: Lucas Barros Gouveia RM: 566422
 * Nome: Milton Marcelino RM: 564836
 */
public class DespesaFamiliar {
    //Atributos
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;

    //Métodos
    public double calcularTotalDeDespesas() {
        double gastos, gastoAcademia, gastoTotal;
        gastos = gastoComLuz + gastoComAgua + gastoComInternet;
        gastoAcademia = valorMensalidadeDaAcademia * numeroDeMoradores;
        gastoTotal = gastos + gastoAcademia;
        return gastoTotal;
    }
    public double calcularRendaFamiliarLiquida() {
        double rendaLiquida;
        rendaLiquida = rendaFamiliar - calcularTotalDeDespesas();
        return rendaLiquida;
    }
}
