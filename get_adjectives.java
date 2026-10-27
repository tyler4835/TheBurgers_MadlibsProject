import java.util.Scanner;

// Asks the user for an adjective and prints it back
public class get_adjectives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get an adjective from the user and save it
        String adjective = get_adjective(scanner);
        System.out.println("You entered the adjective: " + adjective);
        scanner.close();
    }

    // Asks for one adjective and returns it to main
    public static String get_adjective(Scanner scanner) {
        System.out.print("Enter an adjective: ");
        String adjectiveInput = scanner.nextLine();
        return adjectiveInput;
    }
}
