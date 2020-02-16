package exercise1.model;

public class Staff extends Officer {
	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Staff(String name, int age, String gender, String address, String job) {
		super(name, age, gender, address);
		this.job = job;
	}

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, int age, String gender, String address) {
		super(name, age, gender, address);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" job "+this.job;
	}

}
