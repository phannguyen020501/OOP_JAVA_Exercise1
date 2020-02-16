package exercise1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerOfficer {
	private List<Officer> officers;
	public managerOfficer() {
		this.officers=new ArrayList<Officer>();
	}
	public void addOfficer(Officer officer) {
		this.officers.add(officer);
	}
	public List<Officer> searchOfficerByName(String name){
		
		return officers.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
		
	}
	public void showListInforOfficer() {
		this.officers.forEach(o->System.out.println(o.toString()));
	}

}
