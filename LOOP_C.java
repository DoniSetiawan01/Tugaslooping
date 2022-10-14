/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author user
 */
public class LOOP_C {
    public static void main(String[] args) {
                System.out.println("For");
        for (int g = 1; g<= 5; g++){
            for (int h = 1; h <= 4; h++)
            {
                System.out.print("*");   
            }
            System.out.println("0");
        }
        System.out.println("");
        System.out.println("While");
        int i = 1;
        while(i <= 5){
            int j = 1;
            while(j <= 5){
                System.out.print("*");
                j++;
            }
            System.out.println("0");
            i++;
        }

        System.out.println("");
        System.out.println("Do While");
        int x = 1;
        do
        {
            int y =1;
             do
            {
                System.out.print("*");
                y++;
            } while (y <=5);

            System.out.println("0");
            x++;
        } while (x<=5);
    }
}
