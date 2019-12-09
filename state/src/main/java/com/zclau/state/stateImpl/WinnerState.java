package com.zclau.state.stateImpl;

import com.zclau.state.GumballMachine;
import com.zclau.state.State;

public class WinnerState implements State {

	private GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}


	@Override
	public void insertQuarter() {
		System.out.println("You can't...");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can't...");
	}

	@Override
	public void turnCrank() {
		System.out.println("You can't...");
	}

	@Override
	public void dispense() {
		System.out.println("You're a winner!!! You get two gumballs for your quarter");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("Oops, out of gumballs");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
}
