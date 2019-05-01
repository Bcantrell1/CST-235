/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securityexample;

/**
 *
 * @author Cantrell
 */
public class SecurityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*This is my example of writing more results to a value than are 
        available in the value. In other words there are 20 available spots
        to be filled. I am filling it with 25 thus causing the app to fail. 
        */
    
        int tooMuchData = 5;
        int[] storage = new int[20];
        
        for (int i = 0; i < 25; i++)
            storage[i] = 5;
        
        System.out.println("This is too much data too handle" + tooMuchData);
        
    }
    
}
