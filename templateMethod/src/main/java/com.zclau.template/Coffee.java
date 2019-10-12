package com.zclau.template;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {
	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

	@Override
	boolean customerWantsCondiments() {
		String answer = getUserInput();

		return answer.toLowerCase().startsWith("y");
	}

	private String getUserInput() {
		String answer = null;

		System.out.println("Would you like mile and sugar with your coffee [y/n] ?");

		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			answer = in.readLine();
		} catch (Exception e) {
			System.err.println("IO error trying to read your answer");
		}

		if (answer == null) {
			return "no";
		}
		return answer;
	}
}
