package exercise1.model;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		Scanner sc4=new Scanner(System.in);
		Scanner sc5=new Scanner(System.in);
		ManagerOfficer managerOfficer=new ManagerOfficer();
	    while(true) {
              System.out.println("Application Manager Officer");
              System.out.println("Enter 1: To insert officer");
              System.out.println("Enter 2: To search officer by name");
              System.out.println("Enter 3: To show information officer");
              System.out.println("Enter 4: To exit");
              int line =sc.nextInt();
              switch(line) {
                   case 1:{
	                      System.out.println("Enter 1: To insert engineer");
                          System.out.println("Enter 2: To insert worker");
                          System.out.println("Enter 3: To insert staff");
                          int type =sc.nextInt();
                          switch(type) {
                                  case 1 :{
	                                  System.out.println("Enter name");
	                                  String name=sc1.nextLine();
	                                  System.out.println("Enter age");
	                                  int age=sc2.nextInt();
	                                  System.out.println("Enter gender");
	                                  String gender=sc3.nextLine();
	                                  System.out.println("Enter address");
	                                  String address=sc4.nextLine();
	                                  System.out.println("Enter branch");
	                                  String branch=sc5.nextLine();
	                                  Officer engineer=new Engineer(name, age, gender, address, branch);
	                                  managerOfficer.addOfficer(engineer);
	                                  System.out.println(engineer.toString());
	                                  break;
	
                                      }
                                  case 2:{
	                                  System.out.println("Enter name");
	                                  String name=sc1.nextLine();
	                                  System.out.println("Enter age");
	                                  int age=sc2.nextInt();
	                                  System.out.println("Enter gender");
	                                  String gender=sc3.nextLine();
	                                  System.out.println("Enter address");
	                                  String address=sc4.nextLine();
	                                  System.out.println("Enter level");
	                                  int level=sc5.nextInt();
	                                  Officer worker=new Worker(name, age, gender, address, level);
	                                  managerOfficer.addOfficer(worker);
	                                  System.out.println(worker.toString());
	                                  break;
	
                                      }
                                  case 3:{
	                                  System.out.println("Enter name");
	                                  String name=sc1.nextLine();
	                                  System.out.println("Enter age");
	                                  int age=sc2.nextInt();
	                                  System.out.println("Enter gender");
	                                  String gender=sc3.nextLine();
	                                  System.out.println("Enter address");
	                                  String address=sc4.nextLine();
	                                  System.out.println("Enter job");
	                                  String job=sc5.nextLine();
	                                  Officer staff=new Staff(name, age, gender, address, job);
	                                  managerOfficer.addOfficer(staff);
	                                  System.out.println(staff.toString());
	                                  break;
                                      }
                                  default:
	                                  System.out.println("invalid");
		                              break;
	                         }
	                   break;
                       }
                       case 2:{
	                          System.out.println("Enter name to search");
	                          String name= sc1.nextLine();
	                          managerOfficer.searchOfficerByName(name).forEach(o -> System.out.println(o.toString()));
	                          break;
                            }
                       case 3:{
	                          System.out.println("List officer");
	                          managerOfficer.showListInforOfficer();
	                          break;
                            }
                       case 4:{
	                          return;
	
                            }
                       default:
	                          System.out.println("invalid");
	                          continue;

                     }
              }


	}

}
