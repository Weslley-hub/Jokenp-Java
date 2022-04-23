package PedraPapelTesoura01;

import java.util.Scanner;


public class PedraPepelTesoura01 {

    public static void main(String[] args) {         
            int jogador1, jogador2;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println ("1 PEDRA");
            System.out.println ("2 PAPEL");
            System.out.println ("3 TESOURA");
            System.out.println ("\nEscolha uma opção");
            //Escolha do Jogadores
            do{
            System.out.println ("Primeiro Jogador: ");
            jogador1 = teclado.nextInt();
            
            System.out.println ("\nSegundo Jogador: ");
            jogador2 = teclado.nextInt();
            
            switch (jogador1) {
                case 1:
                    System.out.println("Primeiro Jogador Escolheu PEDRA");
                    break;
                    
                case 2:
                    System.out.println("Primeiro Jogador Escolheu PAPEL");
                    break;
                    
                case 3:
                    System.out.println("Primeiro Jogador Escolheu TESOURA");
                    break;
                    
                default:
                    System.out.println("Opção Invalida!!");
                    break;
            }
            
            switch (jogador2) {
                case 1:
                    System.out.println("Segundo Jogador Escolheu PEDRA");
                    break;
                    
                case 2:
                    System.out.println("Segundo Jogador Escolheu PAPEL");
                    break;
                    
                case 3:
                    System.out.println("Segundo Jogador Escolheu TESOURA");
                    break;
                    
                default:
                    System.out.println("Opção Invalida!!");
                    break;
                    
            } if (jogador1==jogador2) {
                             System.out.println("EMPATE! JOGUE NOVAMENTE");
                            }
            }while(jogador1==jogador2); //CASO DE EMPATE
        }
        
    //DETERMINAR JOGADOR VENCEDOR
        if ((jogador1 == 1 && jogador2 == 3) || (jogador1 == 2 && jogador2 == 1) || (jogador1 == 3 && jogador2 == 2)) {
            System.out.println("Primeiro jogador venceu!");
        } else {
            System.out.println("Segundo jogador venceu!");
        }
    
    }    
}

