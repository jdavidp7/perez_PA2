package perez_p2;
import java.util.Scanner;
public class BMICalculator {
private double weight, height, bmi;
public int choice, valid = 1;
public Scanner input = new Scanner(System.in);
	public void readUserData() {
		
		// Create a BMI calculator that reads the user’s weight and height 
		// Providing an option for the user to select which formula to use
		readUnitType();
		readMeasurementData();		
		 
	}
	// calculate the user’s body mass index.
	public void calculateBmi() {
		double bmi;
		double weight = getWeight();
		double height = getHeight();
		
		if (choice == 1) {
			bmi = (703 * weight) / (height * height);
			setBmi(bmi);
		}else if (choice == 2) {
			bmi = (weight)/ (height * height);
			setBmi(bmi);
		}else {
			System.out.println("No calculation occurred.");
		}
	}
	// Displays the user's body mass index
	public void displayBmi() {
		if (choice != 3 && getHeight() > 0 && getWeight() > 0) {
			System.out.printf("Your BMI is %.2f\n", getBmi());
			
			calculateBmiCategory();
		}
		input.close();
		
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		if (weight > 0) {
			this.weight = weight;
			valid = 1;
		} else {
			System.out.println("Enter a positive nonzero number");
			valid = 0;
		}
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if (height > 0) {
			this.height = height;
			valid = 1;
		} else {
			System.out.println("Enter a positive nonzero number");
			valid = 0;
		}
	}
	public double getBmi() {
		return bmi;
	}
	public void setBmi(double bmi) {
		if (bmi >= 0) {
			this.bmi = bmi;
		}
	}
	public void readUnitType() {
		System.out.println("Press 1 to calculate BMI using pounds and inches");
		System.out.println("Press 2 to calculate BMI using kilograms and meters");
		System.out.println("Press 3 to exit");
		choice = input.nextInt();
		//input.close();
	}
	public void readMeasurementData() {
		while (1 != 0){
			//Create a BMI calculator that reads the user’s weight and height 
			//(providing an option for the user to select which formula to use),
			if (choice == 1) {
				readImperialData();
				break;
				
			}
			else if (choice == 2) {
				readMetricData();
				break;
			}
			else if (choice == 3) {
				break;
			}
			else {
				System.out.println("Invalid option.");
				readUnitType();
			}
		}
		
		
		
		
	}
	public void readMetricData() {
			System.out.println("Enter weight in kilograms: ");
			double weight = input.nextDouble();
			setWeight(weight);
			if (valid == 1) {
				System.out.println("Enter height in meters: ");
				double height = input.nextDouble();
				setHeight(height);
			} 
			if (valid == 0) {
				choice = 3;
			}
		
	}
	public void readImperialData() {
		
			System.out.println("Enter weight in pounds: ");
			double weight = input.nextDouble();
			setWeight(weight);
			if (valid == 1) {
				System.out.println("Enter height in inches: ");
				double height = input.nextDouble();
				setHeight(height);
			}
			if (valid == 0) {
				choice = 3;
			}
		
	}
	public void calculateBmiCategory() {
		if (bmi < 18.5) {
			System.out.println("You are underweight");
		}
		if (bmi >= 18.5 && bmi <= 24.99) {
			System.out.println("Normal weight");
		}
		if (bmi >= 25 && bmi <= 29.99) {
			System.out.println("You are overweight");
		}
		if (bmi >= 30) {
			System.out.println("You are obese");
		}
	}
	
}

