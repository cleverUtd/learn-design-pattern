package com.zclau.command;

import com.zclau.receiver.CeilingFan;

public class CeilingFanHighCommand implements Command {

	CeilingFan ceilingFan;
	int prevSpeed;

	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.setHigh();
	}

	@Override
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.setHigh();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.setMedium();
		} else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.setLow();
		} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.setOff();
		}
	}
}
