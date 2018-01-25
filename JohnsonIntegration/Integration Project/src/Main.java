import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//sysout then ctrl + space
		
		Scanner scan = new Scanner(System.in);
		
		Dog spot  = new Dog();
		spot.size = 30;
		spot.breed = "German Shepard";
		Dog spuds = new Dog();
		spuds.size = 40;
		
		
		System.out.println("What is your name?");
		String userName =  scan.nextLine();
		System.out.println("Your name is " + userName);
		
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		System.out.println("Your integer was " + a);
		
		
		
	}

}


class Dog {
	double size;
	String breed; 
	
}
