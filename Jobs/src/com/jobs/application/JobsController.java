package com.jobs.application;

import com.jobs.domain.*;
import com.jobs.persistence.EmployeeRepository;

import java.util.List;

public class JobsController {

	private EmployeeRepository repository;
	
	public JobsController(){
		//INICIO EL ATRIBUTO repository en el CONSTRUCTOR
		this.repository = new EmployeeRepository();
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{

       //MODIFICO LA DECLARACION PARA QUE SEA UN OBJETO AbsStaffMember COMO ESPERA RECIBIR EL METOD ADDMEMBERS
        AbsStaffMember boss = new Boss(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
        AbsStaffMember employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
        //IMPLEENTO LA DECLARACION MANAGERS
        AbsStaffMember manager = new Manager(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
        repository.addMember(manager);
		
	}


	public void payAllEmployeers() {
        List<AbsStaffMember> list = repository.getAllMembers();
        for (AbsStaffMember member : list) {
            member.pay();
        }
	
	}

	public String getAllEmployees() {
		String allEmployees = "";
		for (AbsStaffMember member: repository.getAllMembers()) {
			allEmployees= allEmployees + "\n" + member;

		}
		return allEmployees;
	}

	public void createVolunteer(String name, String address, String phone, String description)  throws Exception{
		// IMPLEMENTO VOLUNTEER y MODIFICO PARAMETROS

        AbsStaffMember volunteer = new Volunteer(name, address, phone,  description);
        repository.addMember(volunteer);


    }
	
	
	
}
