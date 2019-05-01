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
class enterpriseBean {
    public enterpriseBean(){}
	
	private String messageString;
	
	public void messageString(String message){
		messageString = message;
	}
	public String messageString(){
		return messageString;
	}
}
