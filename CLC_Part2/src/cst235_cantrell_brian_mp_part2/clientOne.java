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
class clientOne {
    private enterpriseBean clientOneBean = new enterpriseBean();
	
	public clientOne (){
		clientOneBean.messageString("This is Client one Bean and proves the scalability of use accross clients.");
	}
	//EJB reference
	public enterpriseBean getClientOneBean (){
		return clientOneBean;
	}
}
