/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_patterns;

import java.util.Scanner;

/**
 *
 * @author janit
 */
public class Java_Patterns {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n;
        // Get number of lines
        System.out.println("Number of Lines");
        n = myObj.nextInt();
        //Right Angular Triangle Align Left
        System.out.println("Right Angular Triangle Align Left");
        for(int i=1; i <= n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("");
        
        //Right Angular Triangle Align Left-Up
        System.out.println("Right Angular Triangle Align Left-Up");
        for(int i=n; i >0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("");
        
        //Right Angular Triangle Align Right
        System.out.println("Right Angular Triangle Align Right");
        for(int i=n; i >0; i--){
            for(int j=1; j<=n; j++){
                if(j<i){
                    System.out.print("  ");
                }else
                {
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
        
        //Right Angular Triangle Align Up-Right
        System.out.println("Right Angular Triangle Align Up-Right");
        for(int i=1; i <=n; i++){
            for(int j=1; j<=n; j++){
                if(j<i){
                    System.out.print("  ");
                }else
                {
                    System.out.print(" *");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
        
        //Equilateral Triangle
        System.out.println("Right Angular Triangle Align Up-Right");
        for(int i=n; i >0; i--){
            for(int j=1; j<=n; j++){
                if(j<i){
                    System.out.print(" ");
                }else
                {
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
        
        //Equilateral Triangle Inverse
        System.out.println("Right Angular Triangle Align Up-Right");
        for(int i=1; i <=n; i++){
            for(int j=1; j<=n; j++){
                if(j<i){
                    System.out.print(" ");
                }else
                {
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
    }
}
