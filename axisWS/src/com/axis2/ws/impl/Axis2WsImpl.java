package com.axis2.ws.impl;

import com.axis2.entity.Users;
import com.axis2.ws.Axis2Ws;
/**
 * webservice����ӿ�ʵ����
 * @author Administrator
 *
 */
public class Axis2WsImpl implements Axis2Ws {
	@Override
	public String getFirst() {
		return "my first axis2 service!";
	}

	@Override
	public String getInputString(String string) {
		return "������ַ���Ϊ:" + string;
	}

	@Override
	public Users getUserById(int id) {
		return new Users(id, "mochasoft", "Ħ�����");
	}

	@Override
	public String getAddResult(int num1, int num2) {
		return num1+"+"+num2+"="+(num1+num2);
	}

}