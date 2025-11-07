import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int jogo = 1;
        int secreto = 15;
        int palpite = 0;
        int dificuldade;
        int pontos = 10000;
        int max;
        int min;
        int calc;
        int escolha1;
        int escolha2;
        int cont;


        while (jogo != 3) {
            System.out.println("Digite 1 para ir pro MENU ou se preferir 2 para SAIR: ");
            System.out.println("1 - MENU");
            System.out.println("2 - SAIR");
            System.out.print("Digite uma das opções acima: ");
            cont = ler.nextInt();

            if (cont == 2) {
                System.out.println("Obrigado por jogar o nosso jogo!");
                System.exit(0);
            } else if (cont > 2) {
                System.out.println("OPÇÃO INVÁLIDA!");
                continue;
            }

            System.out.println("-----------------------------------------------------");
            System.out.println("-----------JOGO DE ADIVINHAÇÃO COM NÚMEROS-----------");
            System.out.println("-----------------------------------------------------");
            System.out.println("|----------------------------------------------------|");
            System.out.println("|(1) Fácil                                           |");
            System.out.println("|(2) Média                                           |");
            System.out.println("|(3) Difícil                                         |");
            System.out.println("|----------------------------------------------------|");
            System.out.print("Escolha o nível de  dificuldade: ");
            dificuldade = ler.nextInt();

            switch (dificuldade) {
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("| Você entrou no nível de dificuldade Fácil |");
                    System.out.println("---------------------------------------------");
                    System.out.println("Você tem 20 tentativas para adivinhar o número sorteado");
                    int tentativas20 = 1;

                    while (tentativas20 <= 20) {
                        System.out.println("--------------------------------------------");
                        System.out.println("Suas tentativas são " + tentativas20 + " de 20");
                        System.out.println("--------------------------------------------");
                        System.out.println("Digite o seu palpite: ");
                        palpite = ler.nextInt();

                        if (palpite > secreto) {
                            System.out.println("O seu palpite é MAIOR do que o número secreto.");
                            pontos = pontos - 500;
                        } else if (palpite < secreto) {
                            System.out.println("O seu palpite é MENOR do que o número secreto.");
                            pontos = pontos - 500;
                        } else {
                            System.out.println("Parabéns! Você acertou o número secreto.");
                            System.out.println("O número secreto era: " + secreto);
                            System.out.println("----------------------------------");
                            
                            if (tentativas20 == 1) {
                                System.out.println("Você ganhou mais 10000 pontos por ter acertado de primeira");
                                pontos = pontos + 10000;
                                System.out.println("Agora você tem : " + pontos);
                            } else {
                                System.out.println("Sua pontuação é : " + pontos);
                            }
                            
                            int continua = 0;
                            System.out.println("-----------------------------------------------------");
                            System.out.println("Digite 1 para ir pro MENU ou se preferir 2 para SAIR: ");
                            System.out.println("1 - MENU");
                            System.out.println("2 - SAIR");
                            System.out.print("Digite uma das opções acima: ");
                            continua = ler.nextInt();

                            if (continua == 2) {
                                System.out.println("Obrigado por jogar o nosso jogo!");
                                System.exit(0);
                            } else if (continua > 2) {
                                System.out.println("OPÇÃO INVÁLIDA!");
                            }

                            tentativas20 = 20;
                        }
                        tentativas20++;
                    }
                    break;
        case 2:
          System.out.println("--------------------------------------------");
          System.out.println("| Você entrou no nível de dificuldade Média |");
          System.out.println("---------------------------------------------");
          System.out.println("Você tem 15 tentativas para adivinhar o número sorteado");

          System.out.println("+-------------------------------------------+");
          System.out.println("Aqui você poderá escolher ente:");
          System.out.println("1 - Os números serão gerados aleatoriamente entre 1 e 15.");
          System.out.println("2 - Você pode escolher dois número um inicial e outro final, nesse intervalo será sorteado um número aletorio.");
          System.out.println("+-------------------------------------------+");
          System.out.print("Qual é a sua escolha: ");
          escolha1 = ler.nextInt();

          switch (escolha1) {
            case 1:

              int tentativas15 = 1;
              while (tentativas15 <= 15) {
                System.out.println("--------------------------------------------");
                System.out.println("Suas tentativas são " + tentativas15 + " de 15");
                System.out.println("--------------------------------------------");
                int resposta = random.nextInt(15) + 1;
                System.out.println("Digite o seu palpite: ");
                palpite = ler.nextInt();

                if (palpite > resposta) {
                  System.out.println("O seu palpite é MAIOR do que o número secreto.");
                  pontos = pontos - 666;
                } else if (palpite < resposta) {
                  System.out.println("O seu palpite é MENOR do que o número secreto.");
                  pontos = pontos - 666;
                } else {
                  System.out.println("Parabéns!Você acertou o número secreto.");
                  System.out.println("O número secreto era: "+resposta);
                  System.out.println("----------------------------------");
                  if (tentativas15 == 1) {
                    System.out.println("Você ganhou mais 10000 pontos por ter acertado de primeira");
                    pontos = pontos + 10000;
                    System.out.println("Agora você tem : " + pontos);
                  } else {

                    System.out.println("Sua pontuação é : " + pontos);
                  }
                  int continua = 0;
              System.out.println("-----------------------------------------------------");
              System.out.println("Digite 1 para ir pro MENU ou se preferir 2 para SAIR: ");
              System.out.println("1 - MENU");
              System.out.println("2 - SAIR");
              System.out.print("Digite uma das opções acima: ");
              continua = ler.nextInt();

              if (continua == 2) {
                System.exit(0);
                 System.out.println("Obrigado por jogar o nosso jogo!");
              } else if (continua > 2) {
                System.out.print("OPÇÃO INVÁLIDA!");

              } else {
                
              }
                  tentativas15 = 15;

                }
                tentativas15++;
              }

              break;
            case 2:

              System.out.print("Digite o primeiro número: ");
              min = ler.nextInt();
              System.out.print("Digite o último número: ");
              max = ler.nextInt();
              calc = random.nextInt((max - min) + 1) + min;
              System.out.println("Os numeros escolhidos foram: " + min + " e " + max);
              int tentativas152 = 1;
              while (tentativas152 <= 15) {
                System.out.println("--------------------------------------------");
                System.out.println("Suas tentativas são " + tentativas152 + " de 15");
                System.out.println("--------------------------------------------");
                System.out.print("Digite o seu palpite: ");
                palpite = ler.nextInt();

                if (palpite > calc) {
                  System.out.println("O seu palpite é MAIOR do que o número secreto.");
                  pontos = pontos - 666;
                } else if (palpite < calc) {
                  System.out.println("O seu palpite é MENOR do que o número secreto.");
                  pontos = pontos - 666;
                } else {
                  System.out.println("Parabéns!Você acertou o número secreto.");
                  System.out.println("O número secreto era: "+calc);
                  System.out.println("----------------------------------");
                  if (tentativas152 == 1) {
                    System.out.println("Você ganhou mais 10000 pontos por ter acertado de primeira");
                    pontos = pontos + 10000;
                    System.out.println("Sua pontuação atual é : " + pontos);
                  } else {

                    System.out.println("Sua pontuação agora é : " + pontos);
                  }
                  int continua = 0;
              System.out.println("-----------------------------------------------------");
              System.out.println("Digite 1 para ir pro MENU ou se preferir 2 para SAIR: ");
              System.out.println("1 - MENU");
              System.out.println("2 - SAIR");
              System.out.print("Digite uma das opções acima: ");
              continua = ler.nextInt();

              if (continua == 2) {
                System.exit(0);
                 System.out.println("Obrigado por jogar o nosso jogo!");
              } else if (continua > 2) {
                System.out.print("OPÇÃO INVALIDA!");

              } else {
                 
              }
                  tentativas152 = 15;
                }
                tentativas152++;
              }

          }
          break;

        case 3:
          System.out.println("-----------------------------------------------");
          System.out.println("| Você entrou no nível de dificuldade Difícil | ");
          System.out.println("-----------------------------------------------");
          System.out.println("Você tem 6 tentativas para adivinhar o número sortudo");
          
          System.out.println("+-------------------------------------------+");
          System.out.println("Aqui você poderá escolher ente:");
          System.out.println("1 - Os números serão gerados aleatoriamente entre 1 e 15");
          System.out.println("2 - Você pode escolher dois número um inicial e outro final, nesse intervalo será sorteado um número aletorio");
          System.out.println("+-------------------------------------------+");
          System.out.print("Qual é a sua escolha: ");
          escolha2 = ler.nextInt();

          switch (escolha2) {
            case 1:
              int tentativas6 = 1;
              while (tentativas6 <= 6) {
                
                System.out.println("--------------------------------------------");
                System.out.println("Suas tentativas são " + tentativas6 + " de 6");
                System.out.println("--------------------------------------------");
                int resposta = random.nextInt(15) + 1;
                System.out.println("Digite o seu palpite: ");
                palpite = ler.nextInt();

                if (palpite > resposta) {
                  System.out.println("O seu palpite é MAIOR do que o número secreto.");
                  pontos = pontos - 1666;
                } else if (palpite < resposta) {
                  System.out.println("O seu palpite é MENOR do que o número secreto.");
                  pontos = pontos - 1666;
                } else {
                  System.out.println("Parabéns!Você acertou o número secreto.");
                  System.out.println("O número secreto era: "+resposta);
                  System.out.println("----------------------------------");
                  if (tentativas6 == 1) {
                    System.out.println("Você ganhou mais 10000 pontos por ter acertado de primeira");
                    pontos = pontos + 10000;
                    System.out.println("Agora você tem : " + pontos);
                  } else {

                    System.out.println("Sua pontuação é : " + pontos);
                  }
                  int continua = 0;
              System.out.println("-----------------------------------------------------");
              System.out.println("Digite 1 para ir pro MENU ou se preferir 2 para SAIR: ");
              System.out.println("1 - MENU");
              System.out.println("2 - SAIR");
              System.out.print("Digite uma das opções acima: ");
              continua = ler.nextInt();

              if (continua == 2) {
                System.exit(0);
                 System.out.println("Obrigado por jogar o nosso jogo!");
              } else if (continua > 2) {
                System.out.println("OPÇÃO INVALIDA!");

              } else {
                  
              }

                  tentativas6 = 6;
                }
                tentativas6++;
              }
              break;
            case 2:
              System.out.print("Digite o primeiro número: ");
              min = ler.nextInt();
              System.out.print("Digite o último número : ");
              max = ler.nextInt();
              calc = random.nextInt((max - min) + 1) + min;
              System.out.println("Os numeros escolhidos foram: " + min + " e " + max);
              int tentativas62 = 1;
              while (tentativas62 <= 6) {
                System.out.println("--------------------------------------------");
                System.out.println("Suas tentativas são " + tentativas62 + " de 6");
                System.out.println("--------------------------------------------");
                System.out.println("Digite o seu palpite: ");
                palpite = ler.nextInt();
                

                if (palpite > calc) {
                  System.out.println("O seu palpite é MAIOR do que o número secreto.");
                  pontos = pontos - 1666;
                } else if (palpite < calc) {
                  System.out.println("O seu palpite é MENOR do que o número secreto.");
                  pontos = pontos - 1666;
                } else {
                  System.out.println("Parabéns!Você acertou o número secreto.");
                  System.out.println("O número secreto era: "+calc);
                  System.out.println("----------------------------------");
                  if (tentativas62 == 1) {
                    System.out.println("Você ganhou mais 10000 pontos por ter acertado de primeira");
                    pontos = pontos + 10000;
                    System.out.println("Sua pontuação atual é : " + pontos);
                  } else {

                    System.out.println("Sua pontuação agora é : " + pontos);
                  }
                  int continua = 0;
                  
              System.out.println("-----------------------------------------------------");
              System.out.println("Digite 1 para ir pro MENU ou se preferir 2 para SAIR: ");
              System.out.println("1 - MENU");
              System.out.println("2 - SAIR");
              System.out.print("Digite uma das opções acima: ");
              continua = ler.nextInt();

              if (continua == 2) {
                System.exit(0);
                 System.out.println("Obrigado por jogar o nosso jogo!");
              } else if (continua > 2) {
                System.out.println("OPÇÃO INVALIDA!");

              } else {
                
              }
                  tentativas62 = 6;
                }
                        tentativas62++;
                    }
                    break;
            }
            break;

            default:
                System.out.println("Valor inválido!");
                break;
        }
    }
    
    ler.close();
  }
}