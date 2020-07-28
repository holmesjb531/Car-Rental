import java.util.Scanner;

public class carRental {
	
	private String name;
	private String email;
	private String phoneNumber;
	private String typeOfCar;
	private String detailsCar;
	private String option;
	private int age;
	
	Scanner sc = new Scanner(System.in);
	
	
	public carRental() {
		
	}
	
	public void personalInfo(String name) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Great! So you chose option: " + this.option);
		System.out.println("First we'll need to get some information from you. First, what is your name?");
		this.name = scan.nextLine();
		
		System.out.println();
		System.out.println("Nice to meet you " + this.name + "!");
		
		
		boolean correct = true;
		
		while(correct) {
			
			System.out.println("What's your email?");
			this.email = scan.nextLine();
			
			
			if(!(this.email.contains("@") && this.email.contains("."))) {
				System.out.println("Sorry your email is invalid! Can you try again?");
			} else {
				break;
			}
		}
		
		while(correct) {
			
			System.out.println("How old are you?");
			this.age = scan.nextInt();
			
			
			if((this.age < 0 && this.age > 99)) {
				System.out.println("Sorry! That age is invalid");
			} else {
				break;
			}
		}

		System.out.println("Great! One last thing we'll need is your phone number.");
	
		while(correct) {
			
			//prints twice for some reason. haven't found a solution for it yet
			System.out.println("What's your phone number?(Please provide the area code of the number as well)");
			this.phoneNumber = scan.nextLine();

			
			if(!(this.phoneNumber.contains("-") && (this.phoneNumber.length() == 12))) {
				System.out.println("Sorry your phone number is invalid! Can you try again?");
			}else {
				correct = false;
				break;
			}
		}
		
		System.out.println("Wonderful! Now that we have all that squared away we can move forward with your option!");
		showInfo();
		System.out.println();
	}
	
	public void Introduction() {

		System.out.println("Hello my name is Jalen and welcome to my car shop! "
				+ "We have a lot of cars for rental so please feel free to look around!");
		
		System.out.println("What brings you in today? (Please choose a number between 1-3)");
		System.out.println("1. Rent a car\n2. Get the details of a specific car\n3. Leave");
		this.option = sc.nextLine();
		
		
		if(option.equals("1")) {
			personalInfo(name);
			rentalCar();
		}else if(option.equals("2")) {
			detailsOfCar();
			
		}else {
			Conclusion();
		}
	}
	
	private void Conclusion() {
		System.out.println("It was a pleasure doing business with you " + name + "! "
				+ "I hope you enjoy the car and we look forward to doing business with you soon!");
		
	}

	public void rentalCar() {
		System.out.println("You chose option 1 so you will be renting a vehicle! We have three types of cars you can rent");
		System.out.println("1. Regular Car\n2. Truck\n3. Electric car");
		System.out.println("Which one would you like to choose? (Please choose a number)");
		this.typeOfCar = sc.nextLine();
		
		boolean number = true;
		Scanner scan = new Scanner(System.in);
		
		while(number) {
			
			if(!(typeOfCar.equals("1") || typeOfCar.equals("2") || typeOfCar.equals("3"))) {
				System.out.println("Sorry! Please choose a number!");
			}else {
				break;
			}
			
		}
		
		if(typeOfCar.equals("1")) {
			System.out.println("So you wanted a Regular Car. Nice! Here are the list of our options for cars:");
			System.out.println("1. 2015 Hyundai Sonata Sport\n2. 2016 Volkswagen Jetta\n3. 2020 Lexus NX");
			String rentalCar = scan.nextLine();
			
			if(rentalCar.equals("1")) {
				System.out.println("So you wanted the 2015 Hyunday Sonata Sport! Good choice! Here are the specs for this specific car.");
				this.detailsCar = "2015 Hyundai Sonata Sport";
				System.out.println(detailsCar);
				detailsOfCar();
				
			}
			
			if(rentalCar.equals("2")) {
				System.out.println("So you want the 2016 Volkswagen Jetta! Nice choice! Here are the specs for this specific car.");
				this.detailsCar = "2016 Volkswagen Jetta";
				System.out.println(detailsCar);
				detailsOfCar();
			}
			
			if(rentalCar.equals("3")) {
				System.out.println("So you want the 2020 Lexus! Excellent choice! Here are the specs for this specific car.");
				this.detailsCar = "2020 Lexus NX";
				System.out.println();
				System.out.println(detailsCar);
				detailsOfCar();
			}
			
		}else if(typeOfCar.equals("2")) {
			System.out.println("So you want a truck! Okay!");
			System.out.println("The only truck we have available is the 2020 Ford F-150.");
			System.out.println("Here are the specs for it.");
			this.detailsCar = "2020 Ford F-150";
			detailsOfCar();
			
		}else if(typeOfCar.equals("3")) {
			System.out.println("So you want an electric car! Nice!");
			System.out.println("the only electric car we have is the Tesla Model S");
			System.out.println("Here are the specs for it.");
			this.detailsCar = "Tesla Model S";
			detailsOfCar();
		}
		
	}
	
	public void detailsOfCar() {
		
		if(option.equals("2")) {
			System.out.println("Here are the list of our options:");
			System.out.println("1. 2015 Hyundai Sonata Sport\n2. 2016 Volkswagen Jetta\n3. 2020 Lexus NX\n4. 2020 Ford F-150 \n5. Tesla Model S");
			
			System.out.println("Which vehicle would you like to get the specs for?");
			detailsCar = sc.nextLine();
		}
			

		
		if(detailsCar.equals("2015 Hyundai Sonata Sport") || detailsCar.equals("1")) {
			System.out.println("SEATING: 5 passengers"
					+ "\nMILES PER GALLON: 18.5"
					+ "\nHORSEPOWER: 245 Hp");
			System.out.println();
			System.out.println("The price to rent is $60 a day.");
			
			if(option.equals("1")) {
				System.out.println("Would you like to choose this car?");
				String yesOrNo = sc.nextLine();
					
				if(yesOrNo.toLowerCase().equals("yes")) {
					System.out.println("Nice!");
					Conclusion();
						
				}else {
					System.out.println("No? Well Okay!");
					
					if(option.equals("1")) {
						rentalCar();
					}else {
						detailsOfCar();
					}
				
				}
			
			}else {
				detailsOfCar();
			}
			
		}else if(detailsCar.equals("2016 Volkswagen Jetta") || detailsCar.equals("2")) {
			System.out.println("SEATING: 5 passengers"
					+ "\nMILES PER GALON: 14.5"
					+ "\nHORSEPOWER: 150 Hp");
			System.out.println();
			System.out.println("The price to rent is $50 a day.");
			System.out.println("Would you like to choose this car?");
			String yesOrNo = sc.nextLine();
			
			if(option.equals("1")) {
				System.out.println("Would you like to choose this car?");
				 yesOrNo = sc.nextLine();
					
				if(yesOrNo.toLowerCase().equals("yes")) {
					System.out.println("Nice!");
					Conclusion();
						
				}else {
					System.out.println("No? Well Okay!");
					
					if(option.equals("1")) {
						rentalCar();
					}else {
						detailsOfCar();
					}
				
				}
			
			}else {
				System.out.println("Would you like to look at the specs of another?");
				yesOrNo = sc.nextLine();
				
				if(yesOrNo.toLowerCase().equals("yes")) {
					System.out.println("Okay");
					detailsOfCar();
						
				}else {
					System.out.println("No? Well Okay!");
					
					if(option.equals("1")) {
						rentalCar();
					}else {
						detailsOfCar();
					}
				
				}
			}
			
		}else if(detailsCar.equals("2020 Lexus NX") || detailsCar.equals("3")) {
			System.out.println("SEATING: 5 passengers"
					+ "\nMILES PER GALON: 15.9"
					+ "\nHORSEPOWER: 235 hp");
			System.out.println();
			System.out.println("The price to rent is $90 a day.");
			System.out.println("Would you like to choose this car?");
			String yesOrNo = sc.nextLine();
			
			if(yesOrNo.toLowerCase().equals("yes")) {
				System.out.println("Nice!");
				Conclusion();
			}else {
				System.out.println("No? Well Okay!");
				
				if(option.equals("1")) {
					rentalCar();
				}else {
					detailsOfCar();
				}
			}
		}else if(detailsCar.equals("2020 Ford F-150") || detailsCar.equals("4")) {
			System.out.println("SEATING: 6 passengers"
					+ "\nMILES PER GALON: 19"
					+ "\nHORSEPOWER: 450 hp");
			System.out.println();
			System.out.println("The price to rent is $100 a day.");
			System.out.println("Would you like to choose this car?");
			String yesOrNo = sc.nextLine();
			
			if(yesOrNo.toLowerCase().equals("yes")) {
				System.out.println("Nice!");
				Conclusion();
			}else {
				System.out.println("No? Well Okay!");
				
				if(option.equals("1")) {
					rentalCar();
				}else {
					detailsOfCar();
				}
			}
			
		}else if(detailsCar.equals("Tesla Model S") || detailsCar.equals("5")) {
			System.out.println("SEATING: 5 passengers"
					+ "\nMILES PER GALON: 100"
					+ "\nHORSEPOWER: 778 hp");
			System.out.println();
			System.out.println("The price to rent is $85 a day.");
			System.out.println("Would you like to choose this car?");
			String yesOrNo = sc.nextLine();
			
			if(yesOrNo.toLowerCase().equals("yes")) {
				System.out.println("Nice!");
				Conclusion();
			}else {
				System.out.println("No? Well Okay!");
				
				if(option.equals("1")) {
					rentalCar();
				}else {
					detailsOfCar();
				}
			}
		}
	}
	
	public void showInfo() {
		System.out.println("So here's all of your info: ");
		System.out.println("\nNAME: " + name +
				"\nAGE: " + age +
				"\nEMAIL: " + email +
				"\nPHONE NUMBER: " + phoneNumber +
				"\nOPTION: " + option); 
	}
	
}
