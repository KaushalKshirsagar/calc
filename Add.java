import java.util.Scanner;

public class Add {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input
        System.out.println("Enter first number:");
        int n1 = sc.nextInt();
        
        System.out.println("Enter second number:");
        int n2 = sc.nextInt();

        // Performing addition
        int addition = n1 + n2;
        System.out.println("Addition = " + addition);


		int subtraction = n1 - n2;
                System.out.println("Subtraction = ", subtraction);

		sc.close();
	}
        // Performing multiplication
        int multiplication = n1 * n2;
        System.out.println("Multiplication = " + multiplication);
        
        // Closing scanner
        sc.close();
    }

}

