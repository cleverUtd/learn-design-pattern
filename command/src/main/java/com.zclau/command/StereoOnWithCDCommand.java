package com.zclau.command;

import com.zclau.receiver.Stereo;

public class StereoOnWithCDCommand implements Command {

	private Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume();
	}

	@Override
	public void undo() {

	}
}
