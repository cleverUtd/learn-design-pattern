package com.zclau.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {

	private PersonBean person;

	public NonOwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
		String methodName = method.getName();
		if (methodName.startsWith("get")) {
			return method.invoke(person, args);
		} else if ("setHotOrNotRating".equals(methodName)) {
			return method.invoke(person, args);
		} else if (methodName.startsWith("set")) {
			throw new IllegalAccessException();
		}
		return null;
	}
}
