import java.util.Scanner;

// Asks the user for an adverb and prints it back
public class get_adverbs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get an adverb from the user and save it
        String adverb = get_adverb(scanner);
        System.out.println("You entered the adverb: " + adverb);
        scanner.close();
    }

    // Asks for one adverb and returns it to main
    public static String get_adverb(Scanner scanner) {
        System.out.print("Enter an adverb: ");
        String adverbInput = scanner.nextLine();
        return adverbInput;
    }
}
