package br.com.fiap.bean;

public class Funcionario {
    //Exercício da Aula
    //Atributos
    private String nome;
    private float valorHoraTrabalho; //private significa que só ESSA classe pode acessa-lo ou modifica-lo

    //Construtor vazio
    public Funcionario() {
    }
    //Construtor com passagem de parâmetro
    public Funcionario(String nome, float valorHoraTrabalho) {
        this.nome = nome; // this é para referenciar o objeto... O objeto que instanciamos no main
        //this.valorHoraTrabalho = valorHoraTrabalho;
        setValorHoraTrabalho(valorHoraTrabalho);
    }

    //Metodo getters/setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }
    public void setValorHoraTrabalho(float valorHoraTrabalho) { //Mas se colocarmos para alterar o seu valor (valorHoraTrabalho) dentro de um metodo e mandar ele alterar (por meio do this -> Faz referência ao objeto que criamos lá no main) ele vai alterar, pois quem está acessando ele (que o metodo setValorHoraTrabalho) está dentro da classe Funcionario, que faz parte da mesma classe que valorHoraTrabalho.
        try{
            if (valorHoraTrabalho > 0 ) {
                this.valorHoraTrabalho = valorHoraTrabalho;
            } else {
                throw new Exception("Nome ou valor da Hora Inválidos");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Metodo da classe
    public float calcularSalario(float qtdeHorasTrabalhadaSemana){
        return valorHoraTrabalho * qtdeHorasTrabalhadaSemana * 4;
    }
}
