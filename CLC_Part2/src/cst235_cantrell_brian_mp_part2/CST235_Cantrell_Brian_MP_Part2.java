/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst235_cantrell_brian_mp_part2;

/**
 *
 * @author Cantrell
 */
public class CST235_Cantrell_Brian_MP_Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Setting each client to stage and printing message from each Client. 
        clientOne firstMessage = new clientOne();
	clientTwo secondMessage = new clientTwo();
	System.out.println(firstMessage.getClientOneBean().messageString());
	System.out.println(secondMessage.getClientTwoBean().messageString());
    }
    
}
