package com.zclau.proxy;

import java.rmi.Naming;

public class MyRemoteClient {

	public static void main(String[] args) {
		new MyRemoteClient().go();
	}

	public void go() {
		try {
			MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");

			String result = service.sayHello();

			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
