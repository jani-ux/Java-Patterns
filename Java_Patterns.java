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
        System.out.print("Number of Lines");
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
        System.out.println("Equilateral Triangle");
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
        System.out.println("Equilateral Triangle Inverse");
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

        //Right Angular Triangle Align Left Outline
        System.out.println("Right Angular Triangle Align Left Outline");
        for(int i=1; i <= n; i++){
            for(int j=1; j<=i; j++){
                if(j==i || j==1 || i==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");

        //Right Angular Triangle Align Left-Up Outline
        System.out.println("Right Angular Triangle Align Left-Up Outline");
        for(int i=n; i >0; i--){
            for(int j=1; j<=i; j++){
                if(j==i || j==1 || i==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");

        //Right Angular Triangle Align Right Outline
        System.out.println("Right Angular Triangle Align Right Outline");
        for(int i=n; i >0; i--){
            for(int j=1; j<=n; j++){
                if(j<i){
                    System.out.print("  ");
                }else if(j==i || j==n || i==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");

        //Right Angular Triangle Align Up-Right Outline
        System.out.println("Right Angular Triangle Align Up-Right Outline");
        for(int i=1; i <=n; i++){
            for(int j=1; j<=n; j++){
                if(j<i){
                    System.out.print("  ");
                }else if(j==i || j==n || i==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
        
        //Equilateral Triangle Outline
        System.out.println("Equilateral Triangle Outline");
        for(int i=n; i >0; i--){
            for(int j=1; j<=n; j++){
                if(j<i){
                    System.out.print(" ");
                }else if(j==i || j==n || i==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
        
        //Equilateral Triangle Inverse Outline
        System.out.println("Equilateral Triangle Inverse Outline");
        for(int i=1; i <=n; i++){
            for(int j=1; j<=n; j++){
                if(j<i){
                    System.out.print(" ");
                }else if(j==i || j==n || i==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
        
        //Diamond Outline
        System.out.println("Diamond Outline");
        for(int i=n; i >1; i--){
            for(int j=1; j<=n; j++){
                if(j<i){
                    System.out.print(" ");
                }else if(j==i || j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        for(int i=1; i <=n; i++){
            for(int j=1; j<=n; j++){
                if(j<i){
                    System.out.print(" ");
                }else if(j==i || j==n ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
        
        //Diamond
        System.out.println("Diamond");
        for(int i=n; i >1; i--){
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
        
        //Pyramid
        System.out.println("Pyramid");
        for(int i=1; i<=n; i++){
            for(int j=n; j>i; j--){
                System.out.print("  ");
            }
            for(int j=1; j<= 2*i -1 ; j++){
            System.out.print(" *");
        }
            System.out.println(" ");
        }
    }
}
