package exercise1.model;

public class Engineer extends Officer {
	private String branch;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engineer(String name, int age, String gender, String address) {
		super(name, age, gender, address);
		// TODO Auto-generated constructor stub
	}

	public Engineer(String name, int age, String gender, String address, String branch) {
		super(name, age, gender, address);
		this.branch = branch;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" branch"+this.branch;
	}

}
