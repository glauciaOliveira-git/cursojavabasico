/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.cursojavabasico.aula14;

/**
 *
 * @author Glaucia Oliveira
 */
import java.util.Scanner;

public class IfEslse {
    
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        
        /*System.out.println("Idade é: ");
        int idade = scan.nextInt();
        
        if (idade >= 18){
          System.out.println("É maior de idade "); 
        
        }else{
          System.out.println("Não é maior de idade ");   
        }*/
       
       // se for bararato tem que valor<=que 10,00 
       // 10< valor <15 - pedir desconto
       //!5<= valor < 17 - pesquisar mais
       // valor > =17 ta caro
       
        System.out.println("Entre com o valor: "); 
       double valor = scan.nextDouble();
        
       
        if (valor <= 10){
          System.out.println("Compensa comprar: ");    
        }else if( valor >10 && valor <15 ){
             System.out.println("Peça um desconto: ");          
                }else if(valor >= 15 && valor <17){
                  System.out.println("Pesquise mais um pouco: ");   
                    
                }else{
                    System.out.println("Está muito caro!!!!");
                }
       
       
        
    }
    
}
