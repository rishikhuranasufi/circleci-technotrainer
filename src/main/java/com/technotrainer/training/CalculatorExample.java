package com.technotrainer.training;

public class CalculatorExample {
	
	public static void main (String arg[]){
		
		CalculatorExample calculatorExample = new CalculatorExample();
		try {
			String fisrtNo = arg[0];
			String secondNumber = arg[1];

			int sumOutputIs = calculatorExample.additionOfTwoNumber(fisrtNo, secondNumber);

			int mulOutputIs = calculatorExample.multiplicationOfTwoNumber(fisrtNo, secondNumber);

			calculatorExample.printDetails(fisrtNo, secondNumber, sumOutputIs, mulOutputIs);
		}catch (Exception ex){
			System.out.println("Issue while executing sample code \n " +
					"Please make sure to execute program using command java -jar circleci-0.0.1-SNAPSHOT-jar-with-dependencies.jar 2 2 \n" +
					"Still getting error/ Exception, please reach out to instructor.");
			ex.printStackTrace();
		}
	}

    public boolean printDetails(String fisrtNo, String secondNumber, int sumOutputIs, int mulOutputIs) {
        System.out.println("Hello Participants ");
        System.out.println("Inputted details are "+ "\nFirst number is "+ fisrtNo+ "\nSecond number is "+ secondNumber);
        System.out.println("OutPut of Sum Method is "+ sumOutputIs);
        System.out.println("OutPut of Multiplication Method is "+ mulOutputIs);
        return true;
    }

    public int additionOfTwoNumber(String fisrtNo, String secondNumber){
		int sumIs = 0;
		sumIs = Integer.parseInt(fisrtNo) + Integer.parseInt(secondNumber);
		return sumIs;
	}
	
	public int multiplicationOfTwoNumber(String fisrtNo, String secondNumber){		
		int multiplicationIs = 0;
		multiplicationIs = Integer.parseInt(fisrtNo) * Integer.parseInt(secondNumber);
		return multiplicationIs;
	}

}
