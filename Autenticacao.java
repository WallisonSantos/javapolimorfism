public class Autenticacao {
  private int senha;

  public void setSenha(int senha) {
    this.senha = senha;
  }

  public boolean setAutenticador(int senha) {
    if (this.senha == senha) {
      return true;
    } else {
      return false;
    }
  }
}