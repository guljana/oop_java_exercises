package com.techreturners.cats;

public abstract class WildCat implements Cat {

	private boolean sleepFlag = false;
	private final String settingStr = "wild";

	public abstract String eat();

	public abstract int getAverageHeight();

	public boolean isAsleep() {
		return sleepFlag;
	};

	public void goToSleep() {
		this.sleepFlag = true;

	};

	public void wakeUp() {
		this.sleepFlag = false;

	};

	public String getSetting() {
		return settingStr;
	};

}
