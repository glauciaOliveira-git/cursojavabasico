/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.cursojavabasico.aula12;

/**
 *
 * @author Glaucia Oliveira
 */
import java.util.Scanner;

public class LeituraDadosTeclado {
    
    public static void main (String []args){
        
        Scanner scan = new Scanner(System.in);
        
       /* System.out.println("Digite o seu nome completo: ");
        
        String seuNomeCompleto = scan.nextLine();
        
        System.out.println("Seu nome completo é: " + seuNomeCompleto);
        
        
        
        
         System.out.println("Digite o seu primeiro nome: ");
         String seuPrimeiroNome = scan.next();
          System.out.println("Seu primeiro nome é: " + seuPrimeiroNome);*/
        
          
          
         /*System.out.println("Digite sua idade: ");
        
         int idade = scan.nextInt();
         
          System.out.println("Sua idade é: " + idade);
          
          
           System.out.println("Digite sua altura: ");
        
         double altura = scan.nextDouble();
         
          System.out.println("Sua altura é: " + altura);*/
         
         System.out.println("Digite seu primeiro nome, sua altura, sua idade, se tem filhos e quantas mascota");
          String nome = scan.next();
          float altura = scan.nextFloat();
          int idade = scan.nextInt();
          boolean stf = scan.nextBoolean();
          byte numMascotas = scan.nextByte();
          
          System.out.println("Você digitou os seguintes valores; ");
          
           System.out.println("Seu nome é:" +nome);
                    System.out.println("Sus altura é: " + altura);
                             System.out.println("Sua idade é" + idade);
                                      System.out.println("Você tem Filhos? " +stf);
                                               System.out.println("Quantas mascotas você tem: " +numMascotas);
          
        
    }
    
}
