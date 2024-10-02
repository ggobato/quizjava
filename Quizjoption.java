package quiz;
import javax.swing.JOptionPane;
public class Quizjoption 
{
    public static void main(String[] args)
    {
        int pontuacao = 0;
        String nome;
        
        JOptionPane.showMessageDialog(null,"BEM VINDO AO QUIZ SOBRE AS DISCIPLINAS DO CURSO!!!! \n\n");
        
        nome = JOptionPane.showInputDialog("Qual seu nome?");
        
        JOptionPane.showMessageDialog(null,"Bem vindo ao quiz do curso "+ nome + "!! \n\n\n");
        
        String resposta1;
        do {
            resposta1 = JOptionPane.showInputDialog("1. Qual a origem do nome da linguagem Java?\n A) Uma árvore do lado de fora do escritório\n B) O café original da ilha de Java na Indonésia\n C) O sobrenome do criador da linguagem \nDigite sua resposta (A, B ou C): ");

            if (resposta1.equals("A") || resposta1.equals("a") || resposta1.equals("B") || resposta1.equals("b") || resposta1.equals("C") || resposta1.equals("c")) 
            {
                if (resposta1.equals("B") || resposta1.equals("b")) 
                {
                    JOptionPane.showMessageDialog(null,"\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null,"\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null,"\nResposta inválida. Tente novamente.\n");
            }
        } while (true);
        
        
        
        String resposta2;
        do {
            resposta2 = JOptionPane.showInputDialog("2. Qual desses é um endereço IP de classe C?\n A) 202.45.12.34\n B) 10.45.67.89\n C) 134.56.23.78 \nDigite sua resposta (A, B ou C): ");

            if (resposta2.equals("A") || resposta2.equals("a") || resposta2.equals("B") || resposta2.equals("b") || resposta2.equals("C") || resposta2.equals("c")) 
            {
                if (resposta2.equals("A") || resposta2.equals("a")) 
                {
                    JOptionPane.showMessageDialog(null,"\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null,"\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null,"\nResposta inválida. Tente novamente.\n");
            }
        } while (true);
        
        
        
        String resposta3;
        do {
            resposta3 = JOptionPane.showInputDialog("3. Qual é o comando usado para excluir uma tabela em sql?\n A) DELETE TABLE\n B) INSERT INTO\n C) DROP TABLE \nDigite sua resposta (A, B ou C): ");

            if (resposta3.equals("A") || resposta3.equals("a") || resposta3.equals("B") || resposta3.equals("b") || resposta3.equals("C") || resposta3.equals("c")) 
            {
                if (resposta3.equals("C") || resposta3.equals("c")) 
                {
                    JOptionPane.showMessageDialog(null,"\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null,"\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null,"\nResposta inválida. Tente novamente.\n");
            }
        } while (true);
        
        
        
        String resposta4;
        do {
            resposta4 = JOptionPane.showInputDialog("4. Qual é o comando usado para inserir dados em uma tabela em sql?\n A) DELETE TABLE\n B) INSERT INTO\n C) DROP TABLE \nDigite sua resposta (A, B ou C): ");

            if (resposta4.equals("A") || resposta4.equals("a") || resposta4.equals("B") || resposta4.equals("b") || resposta4.equals("C") || resposta4.equals("c")) 
            {
                if (resposta4.equals("B") || resposta4.equals("b")) 
                {
                    JOptionPane.showMessageDialog(null,"\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null,"\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null,"\nResposta inválida. Tente novamente.\n");
            }
        } while (true);
        
        
        
        String resposta5;
        do {
            resposta5 = JOptionPane.showInputDialog("5. Qual desses NÃO é uma estrutura de repetição?\n A) do while\n B) for\n C) if/else \nDigite sua resposta (A, B ou C): ");

            if (resposta5.equals("A") || resposta5.equals("a") || resposta5.equals("B") || resposta5.equals("b") || resposta5.equals("C") || resposta5.equals("c")) 
            {
                if (resposta5.equals("C") || resposta5.equals("c")) 
                {
                    JOptionPane.showMessageDialog(null,"\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null,"\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null,"\nResposta inválida. Tente novamente.\n");
            }
        } while (true);
        
        
        
        String resposta6;
        do {
            resposta6 = JOptionPane.showInputDialog("6. O que é um 'ESP32'?\n A) Um processador\n B) Um microondas\n C) Um microcontrolador \nDigite sua resposta (A, B ou C): ");

            if (resposta6.equals("A") || resposta6.equals("a") || resposta6.equals("B") || resposta6.equals("b") || resposta6.equals("C") || resposta6.equals("c")) 
            {
                if (resposta6.equals("C") || resposta6.equals("c")) 
                {
                    JOptionPane.showMessageDialog(null,"\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null,"\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null,"\nResposta inválida. Tente novamente.\n");
            }
        } while (true);
        
        
        
        String resposta7;
        do {
            resposta7 = JOptionPane.showInputDialog("7. O que é DHCP?\n A) Um protocolo usado para atribuir automaticamente endereços IP\n B) O sistema de nomes de domínio\n C) Todas as alternativas estão corretas \nDigite sua resposta (A, B ou C): ");

            if (resposta7.equals("A") || resposta7.equals("a") || resposta7.equals("B") || resposta7.equals("b") || resposta7.equals("C") || resposta7.equals("c")) 
            {
                if (resposta7.equals("A") || resposta7.equals("a")) 
                {
                    JOptionPane.showMessageDialog(null,"\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null,"\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null,"\nResposta inválida. Tente novamente.\n");
            }
        } while (true);
        
        
        
        String resposta8;
        do {
            resposta8 = JOptionPane.showInputDialog("8. O que o comando sql 'SELECT * FROM' faz?\n A) Seleciona e mostra todas as colunas da tabela mencionada\n B) Seleciona e mostra apenas a primeira coluna da tabela mencionada\n C) deleta a tabela \nDigite sua resposta (A, B ou C): ");

            if (resposta8.equals("A") || resposta8.equals("a") || resposta8.equals("B") || resposta8.equals("b") || resposta8.equals("C") || resposta8.equals("c")) 
            {
                if (resposta8.equals("A") || resposta8.equals("a")) 
                {
                    JOptionPane.showMessageDialog(null,"\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null,"\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null,"\nResposta inválida. Tente novamente.\n");
            }
        } while (true);
        
        
        
        String resposta9;
        do {
            resposta9 = JOptionPane.showInputDialog("9. Quem criou a linguagem Java?\n A) Albert Einstein\n B) James Gosling\n C) Tim Berners-Lee \nDigite sua resposta (A, B ou C): ");

            if (resposta9.equals("A") || resposta9.equals("a") || resposta9.equals("B") || resposta9.equals("b") || resposta9.equals("C") || resposta9.equals("c")) 
            {
                if (resposta9.equals("B") || resposta9.equals("b")) 
                {
                    JOptionPane.showMessageDialog(null,"\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null,"\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null,"\nResposta inválida. Tente novamente.\n");
            }
        } while (true);
        
        
        
        String resposta10;
        do {
            resposta10= JOptionPane.showInputDialog("10. Na eletrônica, a corrente elétrica é representada pela letra:\n A) V\n B) C\n C) I \nDigite sua resposta (A, B ou C): ");

            if (resposta10.equals("A") || resposta10.equals("a") || resposta10.equals("B") || resposta10.equals("b") || resposta10.equals("C") || resposta10.equals("c")) 
            {
                if (resposta10.equals("C") || resposta10.equals("c")) 
                {
                    JOptionPane.showMessageDialog(null,"\nParabéns! Resposta correta!\n");
                    pontuacao++;
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null,"\nResposta incorreta!\n");
                }
                break;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null,"\nResposta inválida. Tente novamente.\n");
            }
        } while (true);
        
        
        if (pontuacao > 7)
        {
        JOptionPane.showMessageDialog(null, "Parabéns! Sua pontuação foi: " + pontuacao + "/10");
        }
        else if (pontuacao > 4 && pontuacao < 7)
        {
        JOptionPane.showMessageDialog(null, "Você terminou o quiz! Sua pontuação foi: " + pontuacao + "/10");
        }
        else if (pontuacao < 4)
        {
        JOptionPane.showMessageDialog(null, "Pode melhorar! Sua pontuação foi: " + pontuacao + "/10");
        }               
    }
}