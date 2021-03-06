package com.jobs.domain;

public class Manager extends AbsStaffMember{
    protected double salaryPerMonth;
    protected IPaymentRate paymentRate;
    protected double salaryRate;



    public Manager(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate) throws Exception {
        super(name, address, phone);
        if(salaryPerMonth<0) throw new Exception();
        if(paymentRate==null) throw new Exception();

        this.salaryPerMonth=salaryPerMonth;
        this.paymentRate=paymentRate;
        this.salaryRate=paymentRate.pay(salaryPerMonth);

    }



    @Override
    public void pay() {

    }
    @Override
    public String toString() {
        return "\nManager \n name = "+name+" \n address = "+address+" \n phone = "+phone+" \n salaryPerMonth = "+salaryPerMonth+" \n salaryRate = " +salaryRate+ "   \n";
    }

}
