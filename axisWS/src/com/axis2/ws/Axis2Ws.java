package com.axis2.ws;

import com.axis2.entity.Users;
/**
 * webservice����ӿ���
 * @author Administrator
 *
 */
public interface Axis2Ws {
	String getFirst();
	String getInputString(String string);
	Users getUserById(int id) ;
	String getAddResult(int num1,int num2);
}
