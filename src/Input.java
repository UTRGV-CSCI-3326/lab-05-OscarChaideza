import java.util.Scanner;

public class Input{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);

        //Get and store the user's name. (Store as text)
        String name; 
        System.out.print("Enter the user's name: ");
        name = input.nextLine();

        //Get and store the user's age. (Store as a whole number)
        int age; 
        System.out.print("Enter the user's age: ");
        age = input.nextInt();

        //Get and store the user's weight. (Store it as a real number)
        double weight;
        System.out.print("Enter the user's weight: ");
        weight = input.nextDouble();

        //Get and store if the user is a smoker. (Store it as either true or false)
        boolean smoker;
        System.out.print("Is the user a smoker (True or False): ");
        smoker = input.nextBoolean();

        //Output all of the information back to the user.
        System.out.format("\nThe User's entered iformation is the following: \nUser's name: %s \nUser's age: %s \nUser's weight: %s \nIs the user a smoker: %s \n", name, age, weight, smoker);
    }
}
