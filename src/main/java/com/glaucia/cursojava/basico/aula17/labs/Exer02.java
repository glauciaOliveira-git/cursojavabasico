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
public class Exer02 {
    
      
    public static void main (String []args){
        
        Scanner scan = new Scanner(System.in);
        boolean informValidas = false;
        
        do{
          System.out.println("Digite o nome do usuário: ");  
          String nameUser = scan.next();
          
           System.out.println("Digite a senha: ");  
          String passWord = scan.next();
          
          if(nameUser.equalsIgnoreCase(passWord)){
          //informValidas = false;
            System.out.println("Senha igual ao nome. Digite outra senha: ");  
          }else{
              informValidas = true;
            System.out.println("Senha válida!");    
          }
          
        }while(!informValidas);
        
    }
    
}
