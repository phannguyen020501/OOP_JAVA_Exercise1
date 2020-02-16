package exercise1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerOfficer {
	private List<Officer> officers;
	public managerOfficer() {
		this.officers=new ArrayList<Officer>();
	}
	//add officer
	public void addOfficer(Officer officer) {
		this.officers.add(officer);
	}
	//search officer by name
	public List<Officer> searchOfficerByName(String name){
		
		return officers.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
		
	}
	//show list information officer
	public void showListInforOfficer() {
		this.officers.forEach(o->System.out.println(o.toString()));
	}

}
