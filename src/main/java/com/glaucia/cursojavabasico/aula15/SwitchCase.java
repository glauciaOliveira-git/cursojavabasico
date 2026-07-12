/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.cursojavabasico.aula15;

import java.util.Scanner;

/**
 *
 * @author Glaucia Oliveira
 */
public class SwitchCase {
     public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Entre com o número equivalente ao dia da semana: ");
        int diaSemana = scan.nextInt();
        
        switch(diaSemana){
            case 1:  System.out.println("DOMINGO ");break;
             case 2:  System.out.println("SEGUNDA-FEIRA");break;
              case 3:  System.out.println("TERÇA- FEIRA");break;
               case 4:  System.out.println("QUARTA-FEIRA ");break;
                case 5:  System.out.println("QUINTA-FEIRA ");break;
                 case 6:  System.out.println("SESXTA-FEIRA ");break;
                  case 7:  System.out.println("SÁBADO ");break;
                  //Caso nenhuma dessas condicionais sejam atendidas:default
                  default:  System.out.println("NÃO É UM DIA DA SEMANA "); 
                  
        }
        
        
     }
    
}
