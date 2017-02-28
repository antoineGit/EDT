package Modules;

public class Room {

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Room(int num, int capacity) {
		super();
		this.num = num;
		this.capacity = capacity;
	}

	private int num;
	private int capacity;
	
}
