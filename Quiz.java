package quiz;
import java.util.Scanner;
public class Quiz 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int pontuacao = 0;
        String nome;
       
        System.out.print("BEM VINDO AO QUIZ SOBRE AS DISCIPLINAS DO CURSO!!!! \n\n");
        
        System.out.print("Qual seu nome? ");
        nome = input.nextLine();
        
        System.out.println("");
        
        System.out.println("Bem vindo ao quiz do curso "+ nome + "!! \n\n\n");       
        
        char resposta1;
        do {
            System.out.println("1. Qual a origem do nome da linguagem Java?\n A) Uma árvore do lado de fora do escritório\n B) O café original da ilha de Java na Indonésia\n C) O sobrenome do criador da linguagem");
            System.out.print("Digite sua resposta (A, B ou C): ");
            resposta1 = input.next().toUpperCase().charAt(0);

            if (resposta1 == 'A' || resposta1 == 'B' || resposta1 == 'C') 
            {
                if (resposta1 == 'B') 
                {
                    System.out.println("\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    System.out.println("\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                System.out.println("\nResposta inválida. Tente novamente.\n");
            }
        } while (true);

        
        char resposta2;
        do {
            System.out.println("2. Qual desses é um endereço IP de classe C?\n A) 202.45.12.34\n B) 10.45.67.89\n C) 134.56.23.78");
            System.out.print("Digite sua resposta (A, B ou C): ");
            resposta2 = input.next().toUpperCase().charAt(0);

            if (resposta2 == 'A' || resposta2 == 'B' || resposta2 == 'C') 
            {
                if (resposta2 == 'A') 
                {
                    System.out.println("\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    System.out.println("\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                System.out.println("\nResposta inválida. Tente novamente.\n");
            }
        } while (true);
        
        
        char resposta3;
        do {
            System.out.println("3. Qual é o comando usado para excluir uma tabela em sql?\n A) DELETE TABLE\n B) INSERT INTO\n C) DROP TABLE");
            System.out.print("Digite sua resposta (A, B ou C): ");
            resposta3 = input.next().toUpperCase().charAt(0);

            if (resposta3 == 'A' || resposta3 == 'B' || resposta3 == 'C') 
            {
                if (resposta3 == 'C') 
                {
                    System.out.println("\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    System.out.println("\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                System.out.println("\nResposta inválida. Tente novamente.\n");
            }
        } while (true);
        
        
        char resposta4;
        do {
            System.out.println("4. Qual é o comando usado para inserir dados em uma tabela em sql?\n A) DELETE TABLE\n B) INSERT INTO\n C) DROP TABLE");
            System.out.print("Digite sua resposta (A, B ou C): ");
            resposta4 = input.next().toUpperCase().charAt(0);

            if (resposta4 == 'A' || resposta4 == 'B' || resposta4 == 'C') 
            {
                if (resposta4 == 'B') 
                {
                    System.out.println("\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    System.out.println("\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                System.out.println("\nResposta inválida. Tente novamente.\n");
            }
        } while (true);
        
        
        
        char resposta5;
        do {
            System.out.println("5. Qual desses NÃO é uma estrutura de repetição?\n A) do while\n B) for\n C) if/else");
            System.out.print("Digite sua resposta (A, B ou C): ");
            resposta5 = input.next().toUpperCase().charAt(0);

            if (resposta5 == 'A' || resposta5 == 'B' || resposta5 == 'C') 
            {
                if (resposta5 == 'C') 
                {
                    System.out.println("\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    System.out.println("\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                System.out.println("\nResposta inválida. Tente novamente.\n");
            }
        } while (true);
        
        
        
        char resposta6;
        do {
            System.out.println("6. O que é um 'ESP32'?\n A) Um processador\n B) Um microondas\n C) Um microcontrolador");
            System.out.print("Digite sua resposta (A, B ou C): ");
            resposta6 = input.next().toUpperCase().charAt(0);

            if (resposta6 == 'A' || resposta6 == 'B' || resposta6 == 'C') 
            {
                if (resposta6 == 'C') 
                {
                    System.out.println("\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    System.out.println("\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                System.out.println("\nResposta inválida. Tente novamente.\n");
            }
        } while (true);
        
        
        
        char resposta7;
        do {
            System.out.println("7. O que é DHCP?\n A) Um protocolo usado para atribuir automaticamente endereços IP\n B) O sistema de nomes de domínio\n C) Todas as alternativas estão corretas");
            System.out.print("Digite sua resposta (A, B ou C): ");
            resposta7 = input.next().toUpperCase().charAt(0);

            if (resposta7 == 'A' || resposta7 == 'B' || resposta7 == 'C') 
            {
                if (resposta7 == 'A') 
                {
                    System.out.println("\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    System.out.println("\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                System.out.println("\nResposta inválida. Tente novamente.\n");
            }
        } while (true);
        
        
        char resposta8;
        do {
            System.out.println("8. O que o comando sql 'SELECT * FROM' faz?\n A) Seleciona e mostra todas as colunas da tabela mencionada\n B) Seleciona e mostra apenas a primeira coluna da tabela mencionada\n C) deleta a tabela");
            System.out.print("Digite sua resposta (A, B ou C): ");
            resposta8 = input.next().toUpperCase().charAt(0);

            if (resposta8 == 'A' || resposta8 == 'B' || resposta8 == 'C') 
            {
                if (resposta8 == 'A') 
                {
                    System.out.println("\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    System.out.println("\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                System.out.println("\nResposta inválida. Tente novamente.\n");
            }
        } while (true);
        
        
        
        char resposta9;
        do {
            System.out.println("9. Quem criou a linguagem Java?\n A) Albert Einstein\n B) James Gosling\n C) Tim Berners-Lee");
            System.out.print("Digite sua resposta (A, B ou C): ");
            resposta9 = input.next().toUpperCase().charAt(0);

            if (resposta9 == 'A' || resposta9 == 'B' || resposta9 == 'C') 
            {
                if (resposta9 == 'B') 
                {
                    System.out.println("\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    System.out.println("\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                System.out.println("\nResposta inválida. Tente novamente.\n");
            }
        } while (true);
        
        
        
        char resposta10;
        do {
            System.out.println("10. Na eletrônica, a corrente elétrica é representada pela letra:\n A) V\n B) C\n C) I");
            System.out.print("Digite sua resposta (A, B ou C): ");
            resposta10 = input.next().toUpperCase().charAt(0);

            if (resposta10 == 'A' || resposta10 == 'B' || resposta10 == 'C') 
            {
                if (resposta10 == 'C') 
                {
                    System.out.println("\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    System.out.println("\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                System.out.println("\nResposta inválida. Tente novamente.\n");
            }
        } while (true);

        
        
        if (pontuacao > 7)
        {
            System.out.println("Parabéns! Sua pontuação foi: " + pontuacao + "/10");
        }
        else if (pontuacao > 4 && pontuacao < 7)
        {
            System.out.println("Sua pontuação foi de: " + pontuacao + "/10");
        }
        else if (pontuacao < 4)
        {
            System.out.println("Pode melhorar. Sua pontuação foi de : " + pontuacao + "/10");
        }        
        
        input.close();
    }   
}
