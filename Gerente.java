// ! USANDO HERANÇAS (Super Class, Class Pai etc...)   ex.:  public   class   Carro   extends   Veiculo  {}
// ??? A classe Gerente, ao estender a classe Funcionario:
// ??? É um Funcionario --- Correto, ao estender a classe Funcionario se diz que o Gerente é um Funcionario. 
// ??? Herda todas as características da classe Funcionario --- Correto, a classe Gerente herda todas as características da
//?      classe Funcionario. Todos os atributos também fazem parte do Gerente.
// ??? Herda todo o comportamento da classe Funcionario --- Correto, a classe Gerente herdará todo o comportamento da classe Funcionario.
//?      Isto é, todos os métodos públicos podem ser utilizados na classe Gerente também.
// * implementar (setSenha, setAutenticador) não podemos extender esta classe, deveremos implementar

public class Gerente extends Funcionario implements Autentica {

    // ? Acessar o salario class Funcionario e multiplicar pelo valor da bonificação
    // ? Repare que o método possui a mesma assinatura. Isto é, a mesma
    // ? visibilidade, mesmo retorno, mesmo nome e os mesmos parâmetros
    // ? iremos utilizar o Super para pegar o método Padrão da class Mãe Funcionario

    private Autenticacao util; // atributos a partir da classe Autenticação

    // ! Construtor padrão que irá receber os atributos e métodos de Autenticação
    private Gerente() {
        this.util = new Autenticacao();
    }

    @Override
    // ! COMPOSIÇÃO: implementação do método esta sendo delegada classe Autenticação
    // ! COMPOSIÇÃO: A logica de programação fica em um lugar, classe Autenticação
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    @Override
    public boolean setAutenticador(int senha) {
        return this.util.setAutenticador(senha);
    }

    public double getBonificar() {
        System.out.println("Método de Bonificação do Gerente");
        return super.getSalario();
    }
}