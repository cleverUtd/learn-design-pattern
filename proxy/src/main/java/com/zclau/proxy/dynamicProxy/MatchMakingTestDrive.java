package com.zclau.proxy.dynamicProxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class MatchMakingTestDrive {


	private static Map<String, PersonBean> personDB;

	static {
		personDB = new HashMap<>();
		personDB.put("joe", new PersonBeanImpl("Joe Javabean"));
	}

	public static void main(String[] args) {
		MatchMakingTestDrive drive = new MatchMakingTestDrive();
		drive.drive();

	}


	public void drive() {
		PersonBean joe = personDB.get("joe");

		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterests("bowling, Go");
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerProxy.getName());

		try {
			nonOwnerProxy.setInterests("bowling, Go");
		} catch (Exception e) {
			System.out.println("Can't set interests from non owner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
	}

	private PersonBean getOwnerProxy(PersonBean personBean) {
		return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
				personBean.getClass().getInterfaces(),
				new OwnerInvocationHandler(personBean));
	}

	private PersonBean getNonOwnerProxy(PersonBean personBean) {
		return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
				personBean.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(personBean));
	}
}
