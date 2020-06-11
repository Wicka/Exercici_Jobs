package com.jobs.domain;

public class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;
	protected double salaryRate;


	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
		this.salaryRate=paymentRate.pay(salaryPerMonth);

	}


	@Override
	public String toString() {
		return "\nEmployee \n name = "+name+" \n address = "+address+" \n phone = "+phone+" \n salaryPerMonth = "+salaryPerMonth+" \n salaryRate = " +salaryRate+ "  \n";
	}


	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}

}
