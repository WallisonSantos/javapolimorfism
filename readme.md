# HERANÇA - REUTILIZAÇÃO DE CÓDIGO, POLIMORFISMO:
## REUTILIZAÇÃO DE CÓDIGO: COMPOSIÇÃO COM JAVA, onde uma unica classe é responsável pela implementação,
## POLIMORFISMO: INTERFACES COM JAVA, onde uma classe é totalmente abstrata e determina a assinatura das classe que a irão implementar

# Herdando de várias classes
## Vimos na última aula que não existe herança múltipla em Java. Como podemos contornar a falta disso?
- Podemos contornar esta situação com o uso de interfaces: Correto! Utilizando interfaces temos uma outra forma de conseguir polimorfismo sem herança

# Conceitos de Interfaces
## Sobre interfaces, qual das alternativas abaixo é VERDADEIRA?
- Ela é um contrato onde quem assina se responsabiliza por implementar esses métodos (cumprir o contrato)

# Classes Abstratas x Interfaces
## Sobre classes abstratas e interfaces, selecione todas as afirmativas verdadeiras:

-- Podemos estender apenas uma classe abstrata, mas podemos implementar várias interfaces ???
- Correto! Existe apenas herança simples em Java, mas podemos implementar quantas interfaces que quisermos..

-- Classes abstratas não podem ser instanciadas, interfaces sim ???
- Errado! Na verdade nenhuma das duas podem ser implementadas. Não podemos dar new na classe abstrata, nem na interface!

-- Todos os métodos de uma interface são abstratos, os de uma classe abstrata podem não ser ???
- Correto, todos os métodos na interface são sempre abstratos e sempre públicos. Em uma classe abstratos podemos ter métodos concretos e abstratos

# Sobre o polimorfismo
## Quanto ao conceito do Polimorfismo marque as alternativas corretas:
-- É a capacidade de um objeto chamar métodos do seu pai usando super ??
- Errado, através super deixamos claro que queremos acessar um membro da classe mãe.

-- É a capacidade de um objeto ser referenciado por vários tipos.
- Correta, podemos comunicar com um objeto através de tipos de variáveis diferentes. Por exemplo, se existir uma classe Gerente que seja filha de Funcionario, um objeto do tipo Gerente pode ser referenciado com o tipo Funcionario também.

-- Temos polimorfismo quando uma classe extende de outra ou também quando uma classe implementa uma interface.
- Correta, temos polimorfismo via herança ou interface.

-- Só temos polimorfismo quando uma classe extende de outra, ou seja, apenas via herança.
- Errado, vimos que as interfaces são uma alternativa também para ter polimorfismo.