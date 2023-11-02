package com.crio.qcalc;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Starting QCalc..");
		LogicCalculator calc = new LogicCalculator();
		calc.XOR(8, 6);
		
		calc.printResult();
		
	}

}
