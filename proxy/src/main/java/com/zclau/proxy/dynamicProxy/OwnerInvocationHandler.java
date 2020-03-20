package com.zclau.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

	private PersonBean person;

	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws InvocationTargetException, IllegalAccessException {

		if (method.getName().startsWith("get")) {
			return method.invoke(person, args);
		} else if (method.getName().equals("setHotOrNotRating")) {
			throw new IllegalAccessException();
		} else if (method.getName().startsWith("set")) {
			return method.invoke(person, args);
		}

		return null;
	}
}
