
import java.util.Scanner;

public class get_places {

    public static void main(String[] args) {
        // Set up scanner and call method to get user's place input
        Scanner scanner = new Scanner(System.in);
        String place = get_place(scanner);

        System.out.println("You entered the place: " + place);
        scanner.close();
    }

    // Prompts user to enter a place and returns their response
    public static String get_place(Scanner scanner) {
        System.out.print("Enter a place: ");
        String placeInput = scanner.nextLine();
        return placeInput;
    }
}
