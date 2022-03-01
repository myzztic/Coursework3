import java.util.Scanner;

public class TestClass5026211088 {
    public static void main(String[] args) {
        // import
        ComputeMethods5026211088 compute = new ComputeMethods5026211088();
        Scanner input = new Scanner(System.in);

        // Temperature Converter
        System.out.print("Insert temp in fahrenheit: ");
        double degreesF = input.nextDouble();   // Scanner
        double degreesC = compute.fToC(degreesF);
        System.out.println("Temp in celsius is " + degreesC);
        System.out.println();
        
        // Hypotenuse
        System.out.println("Given a side triangle.");
        System.out.print("Insert first side length: ");
        int length1 = input.nextInt();          // Scanner
        System.out.print("Insert second side length: ");
        int length2 = input.nextInt();          // Scanner
        double result = compute.hypotenuse(length1, length2);
        System.out.println("Hypotenuse is " + result);
        System.out.println();

        // Sum of Dice
        System.out.println("You rolled 2 dice.");
        int dicesum = compute.roll();
        System.out.println("The sum of the dice values is " + dicesum);
    }
    
}
