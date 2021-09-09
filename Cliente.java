
// ! Ao herdar uma classe INTERFACE precisamos Implementar os atributos e métodos, pois sua natureza é abstrata
// ! setSenha, setAutenticador
public class Cliente implements Autentica {

  private Autenticacao util; // atributos a partir da classe Autenticação

  // ! Construtor padrão que irá receber os atributos e métodos de Autenticação
  public Cliente() {

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
}
