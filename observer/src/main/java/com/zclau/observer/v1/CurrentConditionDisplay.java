package com.zclau.observer.v1;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;

	public CurrentConditionDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature
		+ "F degree and " + humidity + "% humidity");
	}
}
