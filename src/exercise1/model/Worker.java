package exercise1.model;

public class Worker extends Officer {
	private int level;
	

	public Worker(String name, int age, String gender, String address, int level) {
		super(name, age, gender, address);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(String name, int age, String gender, String address) {
		super(name, age, gender, address);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" level " + this.level;
	}

}
