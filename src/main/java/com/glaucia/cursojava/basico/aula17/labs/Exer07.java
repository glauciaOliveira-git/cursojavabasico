/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.cursojava.basico.aula17.labs;

import java.util.Scanner;

/**
 *
 * @author Glaucia Oliveira
 */
public class Exer07 {
    
    public static void main (String []args){
        
        Scanner scan = new Scanner(System.in);
        int num;
        int maior = Integer.MIN_VALUE;
        
        for(int i = 0; i<5; i++){
            System.out.println("Digite um número: ");
            num = scan.nextInt();
            if(num>maior){
                maior=num;
            }
            
        }
        
         System.out.println("O maior número digitado è:"+maior);
    }
    
}
