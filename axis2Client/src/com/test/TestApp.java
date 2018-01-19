package com.test;

import org.apache.axis2.AxisFault;

import com.axis2.entity.xsd.Users;
import com.axis2.ws.impl.GetFirst;
import com.axis2.ws.impl.GetFirstResponse;
import com.axis2.ws.impl.GetUserById;
import com.axis2.ws.impl.GetUserByIdResponse;
import com.axis2.ws.impl.MyServiceStub;

public class TestApp {

	public static void main(String[] args) {

		try {
			MyServiceStub stub=new MyServiceStub();
			GetFirst getFirst=new GetFirst();
			GetFirstResponse first = stub.getFirst(getFirst);
			String get_return = first.get_return();
			System.out.println(get_return);
			
			GetUserById getUserById8=new GetUserById();
			getUserById8.setId(15);
			GetUserByIdResponse userById = stub.getUserById(getUserById8);
			Users get_return2 = userById.get_return();
			System.out.println(get_return2.getId()+"--"+get_return2.getUid()+"*---"+get_return2.getUname());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
