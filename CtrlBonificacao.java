public class CtrlBonificacao {
  private double soma;

  // ? método que pega a bonificação para o Designer
  // ! método de bonificação especifico para o Designer, iremos pegar o método
  // ? padrão do Funcionario // The type Designer must implement the inherited
  // ? abstract method Funcionario.getBonificar()Java(67109264)
  // ? Atribui-se a Classe Mae para o parametro deste metodo.

  public void registra(Funcionario f) {
    double boni = f.getBonificar(); // ? pegar método bonificação definida para esta class.
    this.soma = this.soma + boni; // ? pegar a soma atual mais a bonificação.
  }

  public double getSoma() {
    return soma;
  }
}
