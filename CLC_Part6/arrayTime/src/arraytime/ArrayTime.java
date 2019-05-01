/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytime;

import java.util.Random;
/**
 *
 * @author Cantrell
 */
public class ArrayTime {

    public static void main(String[] args) {
     int x = 54654654;
        long start = System.currentTimeMillis();
        long finish;
        long total = 0;
        int[] array = new int[x];
        
        //Random numbers and then add to the array "r"
        for(int i = 0; i < x; i++){
            Random rand = new Random();
            int r = rand.nextInt(300);
            array[i] = r;
        }
        
      //Formula for adding the numbers in the array. 
        long sum = 0;
            for(int i= 0; i < x; ++i) 
                sum += array[i];
        
      //calculate the amound of time to run calculations.
        finish = System.currentTimeMillis();
        total = (finish - start);
        
        System.out.println("The sum is " + sum   
                + ". Run time was " + total + " milliseconds.");


    }
    
}
