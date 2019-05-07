package com.zclau;

import com.zclau.command.CeilingFanHighCommand;
import com.zclau.command.CeilingFanMediumCommand;
import com.zclau.command.CeilingFanOffCommand;
import com.zclau.receiver.CeilingFan;

public class CeilingFanRemoteControlLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		CeilingFan ceilingFan = new CeilingFan("Living Room");

		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

		remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
		remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

		remoteControl.onButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

	}
}
