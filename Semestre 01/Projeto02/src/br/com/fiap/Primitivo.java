package br.com.fiap;

public class Primitivo {
    public static void main(String[] args) {
        // Declaração e inicialização (Opcional) de variáveis
        char sexo = 'F';
        byte idade = 18;
        short codigo = 15650;
        int alunos = 50, classes = 11;
        long brasileiros = 216635748788L;
        float media = 8.73f;
        double dolar = 5.69;
        boolean alternativa = false;
        String nomeCompleto = "Senhor pão";

        System.out.println("Sexo: " + sexo + " Idade: " + idade + " anos.");
        System.out.println("Código: " + codigo + " Média: " + media + " Alunos: " + alunos + " Turmas: " + classes);
        System.out.println("Habitantes: " + brasileiros + " Dólar U$ " + dolar + " Alternativa: " + alternativa);
    }
}
