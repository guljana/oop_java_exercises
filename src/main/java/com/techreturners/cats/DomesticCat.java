package com.techreturners.cats;

public class DomesticCat  extends CommonCat implements Cat{

	private final String settingStr = "domestic";
	private final String eatSound = "Purrrrrrr";
	private final String eatComment = "It will do I suppose";

	private final int avgHieght = 23;

	

	public String getSetting() {
		return settingStr;
	};

	public int getAverageHeight() {
		return avgHieght;

	};

	public String eat() {
		return eatSound;
	};
	public String eatComment() {
		return eatSound+" "+eatComment;
	};

}
