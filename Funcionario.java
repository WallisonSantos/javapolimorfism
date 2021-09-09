// ! Modificadores de Visibilidade Private: Somente na Class, Public: em qualquer lugar, PROTECTED: 
// ? Classes abstratas: A palavra abstract está sempre relacionada com herança
// ? Não poderemos instaciar um novo objeto quando ele é abstrato, pois isto é um conceito
// ? Abstrato, Que resulta do processo intelectual de abstração, só podendo existir no pensamento (ideia).
// ! Não será mais possível criar um new Funcionario !  Para instanciar é preciso criar primeiro uma classe filha não abstrata.
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    // ? criado o metodo getBonificar a partir do atributo salario, qual multiplica
    // ? salario por seu fator de Bonificação;
    // * Criando os metodos Getters;

    // ? Um método Abstract methods não tem um corpo especifico
    // ? não há uma implementação aqui, isto precisa ser implementado em uma classe
    // ? As classes filhas não compilam caso não possuam a implementação
    // método abstrato define apenas assinatura visibilidade, retorno, nome do
    // método e parâmetros

    public abstract double getBonificar();

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}