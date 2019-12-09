package com.zclau.state.stateImpl;

import com.zclau.state.GumballMachine;
import com.zclau.state.State;

public class SoldOutState implements State {

	private GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Oops, out of gumballs");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Oops, out of gumballs");
	}

	@Override
	public void turnCrank() {
		System.out.println("Oops, out of gumballs");
	}

	@Override
	public void dispense() {
		System.out.println("Oops, out of gumballs");
	}
}
