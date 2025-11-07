# 🎮 Jogo de Adivinhação com Números

Um jogo interativo de adivinhação desenvolvido em Java, onde o jogador tenta adivinhar um número secreto com diferentes níveis de dificuldade.

## 📋 Descrição

Este é um jogo de console que desafia o jogador a adivinhar um número secreto. O jogo oferece três níveis de dificuldade, sistema de pontuação e diferentes modos de jogo, tornando a experiência dinâmica e divertida.

## ✨ Características

- **3 Níveis de Dificuldade:**
  - **Fácil**: 20 tentativas para adivinhar o número 15
  - **Médio**: 15 tentativas com números aleatórios
  - **Difícil**: 6 tentativas com números aleatórios

- **Sistema de Pontuação:**
  - Pontuação inicial: 10.000 pontos
  - Bônus de 10.000 pontos por acertar na primeira tentativa
  - Penalidades por erro variam conforme a dificuldade

- **Modos de Jogo:**
  - Números pré-definidos
  - Números gerados aleatoriamente
  - Intervalo personalizado escolhido pelo jogador

## 🎯 Como Jogar

1. Execute o programa
2. Escolha entre ir para o MENU ou SAIR
3. Selecione o nível de dificuldade (1, 2 ou 3)
4. Nos níveis Médio e Difícil, escolha o modo de jogo:
   - Números aleatórios entre 1 e 15
   - Definir seu próprio intervalo de números
5. Digite seus palpites quando solicitado
6. Receba dicas se o número é maior ou menor
7. Ganhe pontos ao acertar!

## 🔧 Requisitos

- Java JDK 8 ou superior
- Terminal/Prompt de comando

## 🚀 Como Executar

### Compilação:
```bash
javac jogo.java
```

### Execução:
```bash
java Main
```

## 📊 Sistema de Pontuação

| Nível de Dificuldade | Tentativas | Penalidade por Erro |
|---------------------|------------|---------------------|
| Fácil               | 20         | -500 pontos         |
| Médio               | 15         | -666 pontos         |
| Difícil             | 6          | -1666 pontos        |

**Bônus Especial:** Acerte na primeira tentativa e ganhe +10.000 pontos extras!

## 🎮 Exemplo de Jogo

```
Digite 1 para ir pro MENU ou se preferir 2 para SAIR: 
1 - MENU
2 - SAIR
Digite uma das opções acima: 1
-----------------------------------------------------
-----------JOGO DE ADIVINHAÇÃO COM NÚMEROS-----------
-----------------------------------------------------
|----------------------------------------------------|
|(1) Fácil                                           |
|(2) Média                                           |
|(3) Difícil                                         |
|----------------------------------------------------|
Escolha o nível de dificuldade: 1
```

## 🛠️ Estrutura do Código

O jogo é estruturado com:
- Classe principal `Main`
- Sistema de menu interativo
- Três cases principais para cada nível de dificuldade
- Sub-cases para diferentes modos de jogo
- Sistema de loops para controle de tentativas
- Validação de entrada do usuário

## 📝 Funcionalidades Futuras

- [ ] Placar de recordes
- [ ] Modo multiplayer
- [ ] Interface gráfica
- [ ] Diferentes temas de jogo
- [ ] Sistema de conquistas

## 👨‍💻 Autor

Victor Alves

## 📄 Licença

Este projeto é de código aberto e está disponível para uso educacional.

---

🎲 **Divirta-se jogando e tente alcançar a maior pontuação possível!**
