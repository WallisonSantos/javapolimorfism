// ? A palavra chave com a menor visibilidade é private, depois vem o protected e depois public.
// ? private - apenas visível dentro da classe
// ? protected - visível dentro da classe e também para as filhas Repare também que protected é relacionado com a herança.
// ? public - visível em todo lugar
// ? A partir de uma instância de uma classe filha Pode-se sim chamar qualquer método da classe mãe. 
// ? Uma classe pode ter diversas "filhas e netas" (que herdam umas das outras) mas não podemos escolher o que será herdado.

public class Testar {
    public static void main(String[] args) {
        // ! Utilizar uma função de Regex para autenticar o CPF
        // ! Erro Gerente gerente = new Funcionario() pois Funcionario nao pode receber
        // ? POLIMORFISMO: Correto => Funcionario Gerente = new Gerente();
        // !Erro: Funcionario wallison = new Funcionario();

        Gerente G = new Gerente();

        Funcionario designer = new Designer();

        Funcionario gerente = new Gerente();

        CtrlBonificacao controleBonus = new CtrlBonificacao();
    }
}