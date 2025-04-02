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
    public double calcularTotalDeDespesas(){
        double gastos, gastosAcademia, gastoTotal;
        gastos = gastoComAgua + gastoComLuz + gastoComInternet;
        gastosAcademia = valorMensalidadeDaAcademia * numeroDeMoradores;
        gastoTotal = gastos + gastosAcademia;
        return gastoTotal;
    }
    public double calcularRendaFamiliarLiquido() {
        double rendaLiquido;
        rendaLiquido = rendaFamiliar - calcularTotalDeDespesas();
        return rendaLiquido;
    }
}
