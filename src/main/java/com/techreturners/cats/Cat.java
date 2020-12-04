package com.techreturners.cats;

interface Cat {

	public boolean isAsleep();

	public void goToSleep();

	public String getSetting();

	public int getAverageHeight();

	public String eat();

	public void wakeUp();

	default void run() {
		System.out.println("I'm running!.....Same for everyone");
	}

}
