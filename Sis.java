public class Sis {
  private int senha = 222;

  public void setAutenticacao(Autentica Aut) {
    boolean autenticou = Aut.setAutenticador(this.senha); // ? Vai chamar o método Autentica da Classe Funcionario.

    if (autenticou) {
      System.out.println("Nascendo a partir da Classe Sis, método de autenticação, Pode Acessar");
    } else {
      System.out.println("Nascendo a partir da Classe Sis, método de autenticação, Não pode Acessar");
    }
  }
}