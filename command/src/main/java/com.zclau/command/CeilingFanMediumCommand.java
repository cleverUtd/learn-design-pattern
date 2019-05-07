package com.zclau.command;

import com.zclau.receiver.CeilingFan;

public class CeilingFanMediumCommand implements Command {

	CeilingFan ceilingFan;
	int prevSpeed;

	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.setMedium();
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
