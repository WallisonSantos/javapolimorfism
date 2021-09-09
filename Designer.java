public class Designer extends Funcionario implements Autentica {

  private Autenticacao util; // atributos a partir da classe Autenticação

  // ! Construtor padrão que irá receber os atributos e métodos de Autenticação
  private Designer() {
    this.util = new Autenticacao();
  }

  @Override
  // ! A implementação do método esta sendo delegada para a classe Autenticação
  // ! A logica de programação fica em um lugar só que é a classe Autenticação
  public void setSenha(int senha) {
    this.util.setSenha(senha);
  }

  @Override
  public boolean setAutenticador(int senha) {
    return this.util.setAutenticador(senha);
  }

  public double getBonificar() {
    System.out.println("Chamando o método de bonificação do Designer");
    return 200;
  }
}