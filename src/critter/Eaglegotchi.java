package critter;

public class Eaglegotchi {
	private String name;	
	private int mood;
	private int hungerLevel;
	private String iconPath;	

	public Eaglegotchi(String name, int mood, int hungerLevel, String iconPath) {
		this.name = name;
		this.mood = mood;
		this.hungerLevel = hungerLevel;
		this.iconPath = iconPath;
	}
	
	public Eaglegotchi() {
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMood() {
		return mood;
	}
	public void setMood(int mood) {
		this.mood = mood;
	}
	public int getHungerLevel() {
		return hungerLevel;
	}
	public void setHungerLevel(int hungerLevel) {
		this.hungerLevel = hungerLevel;
	}
	public String getIconPath() {
		return iconPath;
	}
	public void setIconPath(String icon) {
		this.iconPath = icon;
	}
}
