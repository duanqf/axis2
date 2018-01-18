package com.axis2.ws.impl;

import com.axis2.entity.Users;
import com.axis2.ws.Axis2Ws;
/**
 * webservice服务接口实现类
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
		return "输入的字符串为:" + string;
	}

	@Override
	public Users getUserById(int id) {
		return new Users(id, "mochasoft", "摩卡软件");
	}

	@Override
	public String getAddResult(int num1, int num2) {
		return num1+"+"+num2+"="+(num1+num2);
	}

}