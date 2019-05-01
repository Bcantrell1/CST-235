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
class clientTwo {
    private enterpriseBean clientTwoBean = new enterpriseBean();
	
	public clientTwo (){
		clientTwoBean.messageString("This is Client two Bean and proves the scalability of use accross clients.");
	}
	
        //EJB reference 
	public enterpriseBean getClientTwoBean (){
		return clientTwoBean;
	}
}
