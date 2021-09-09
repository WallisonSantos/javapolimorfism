
// ! Iremos transformar esta classe em uma INTERFACE (contrato que defini obrigações)
// * é uma classe abstrata com todo os métodos abstratos, não ha implementação, algo concreto.
// ? establecemos um contrato, este contrato precisa ser assinado, e quem assina este contrato precisa:
// ? implementar (setSenha, setAutenticador) não podemos extender esta classe, deveremos implementar

public abstract interface Autentica {

  public abstract void setSenha(int senha);

  public abstract boolean setAutenticador(int senha);
}
