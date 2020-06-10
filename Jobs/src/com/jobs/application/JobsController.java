package com.jobs.application;

import com.jobs.domain.Employee;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository;
	
	public JobsController(){
		//INICIO EL ATRIBUTO repository en el CONSTRUCTOR
		this.repository = new EmployeeRepository();
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(boss);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		// TODO Auto-generated method stub
		
	}


	public void payAllEmployeers() {
		// TODO Auto-generated method stub
	
	}

	public String getAllEmployees() {
		String allEmployees = "";
		for (AbsStaffMember member: repository.getAllMembers()) {
			allEmployees= allEmployees +"\n"+ absStaffMember;

		}
				// TODO Auto-generated method stub
		return allEmployees;
	}

	public void createVolunteer(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
