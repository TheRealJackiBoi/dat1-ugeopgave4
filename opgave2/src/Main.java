import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //new scanner object
        Scanner scn = new Scanner(System.in);

        //get name
        System.out.println("Please type your name");
        String name = scn.nextLine();

        //display name
        System.out.println("Hello " + name);

        //get age
        System.out.println("Please type your age");
        int age = scn.nextInt();

        //display age
        System.out.println("So you are " + age + " years old, " + name);

        //calculate years until retirement
        int retirementAge = 67;
        int yearsToRetirement = retirementAge - age;

        //display yearsToRetirement
        System.out.println("You can retire in " + yearsToRetirement + " years");
        
    }
}