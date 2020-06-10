package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory implements IPaymentRate{

	
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.5;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return 0;//todo 
			}
		};
	}
	// METODO PARA MANAGER
	
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return 0;//todo
			}
		};
	}

	@Override
	public double pay(double salaryPerMonth) {
		return 0;
	}
}
