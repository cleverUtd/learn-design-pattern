package com.zclau.observer.v1;

public interface Subject {

	void registerObserver(Observer observer);

	void removeObserver(Observer observer);

	/**
	 * 状态改变时，调用此方法通知所有的观察者
	 */
	void notifyObservers();
}
