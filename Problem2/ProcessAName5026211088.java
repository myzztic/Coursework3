import java.util.Scanner;

public class ProcessAName5026211088 {
    public static void main(String[] args){
        // Import and declare
        Scanner input = new Scanner(System.in);
        String name, firstName, lastName;
        char firstChar;
        int firstSpace, lastSpace;

        // Input full name
        System.out.print("Type your name: ");
        name = input.nextLine();

        // Get first char
        firstSpace = name.indexOf(" ");
        firstName = name.substring(0, firstSpace);
        firstChar = firstName.charAt(0);
        
        // Get last name by detecting the last " " (space) on a string
        lastSpace = name.lastIndexOf(" ");
        lastName = name.substring(lastSpace + 1);
        
        // Output
        System.out.println("Your name is: " + lastName + ", " + firstChar + ".");
    }
}
