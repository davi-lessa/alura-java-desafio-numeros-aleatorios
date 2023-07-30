
# Desafio Alura: conta bancária - curso Primeiro Projeto em Java

A proposta é construir uma aplicação na qual o jogador tentará acertar um número aleatório de 0 a 100, com no máximo 5 tentativas.

Além disso, a cada tentativa errada, será alertado se o número inserido é maior ou menor que o correto.

## Planejando o desafio


Iniciaremos com uma mensagem e em seguida aguardaremos um número:

```
Um número aleatório de 0 a 100 foi gerado e você tem apenas 5 chances para acertá-lo. Valendo!
```
Recebendo um valor incorreto e havendo chances restantes, uma mensagem no seguinte formato deve aparecer:
```
Ops, o número inserido é (MENOR | MAIOR) que o gerado! Tente um valor (menor | maior).
(n) chance("s" | "") restante("s" | ""). Boa sorte!
```
Se o usuário acertar, será exibido:
```
Parabéns, você acertou!
Continuar? (S/n)
```
Se ao final não houver acerto, será exibido:
```
Não foi dessa vez. Boa sorte na próxima!
Continuar? (S/n)
```

## Features adicionais
- Tentativas restantes desconsideram valores fora do range (0, 100)
- Capacidade de jogar nova partida
- Pontuação entre rodadas e final.
- Formatação de em singular / plural para número de chances restantes.

#### Possíveis melhorias:
- Usuário escolher nível de dificuldade (qtd. de números) (easy: 0-10, normal, 0-25, hard: 0-50, ultra-hard: 0-100)
- Estatística de acerto
- Persistir estatísticas
## Fazendo uma cópia do projeto

Clone esse repositório com o comando abaixo:
```
git clone https://github.com/davi-lessa/alura-java-desafio-numeros-aleatorios.git
```
## Contacting me

🧠 Em constante aprendizado

💬 Contato: davidev@mail.com