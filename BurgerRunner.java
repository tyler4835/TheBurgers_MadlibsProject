
import java.util.Scanner;

public class BurgerRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the blank story first
        System.out.println("=== BURGER MAD LIBS ===");
        System.out.println("Fill in the blanks to create your own story!\n");

        System.out.println("Once upon a time in [place], a [adjective] burger appeared with one goal: to [verb] the world.");
        System.out.println("Armed with [number] golden fries, he [adverb] marched toward [place], but [number] [adjective] [noun]s tried to stop him.");
        System.out.println("Suddenly, a [adjective] giant fork attacked! The burger grabbed his [adjective] spatula and prepared to [verb].");
        System.out.println("The burger [adverb] dodged the fork, climbed onto a [noun], and spotted a [adjective] [noun] controlling it.");
        System.out.println("He [adverb] leaped forward and used his spatula to [verb] the control panel, saving the city of [place].");
        System.out.println("The villain [adverb] surrendered, and the burger shared his [number] [adjective] fries. Everyone lived [adverb] ever after!");

        // Collect user inputs in story order
        System.out.println("\n=== ENTER YOUR WORDS ===");

        String place1 = get_places.get_place(scanner);
        String adjective1 = get_adjectives.get_adjective(scanner);
        String verb1 = get_verbs.get_verb(scanner);

        String number1 = get_numbers.get_number(scanner);
        String adverb1 = get_adverbs.get_adverb(scanner);
        String place2 = get_places.get_place(scanner);
        String number2 = get_numbers.get_number(scanner);
        String adjective2 = get_adjectives.get_adjective(scanner);
        String noun1 = get_nouns.get_noun(scanner);

        String adjective3 = get_adjectives.get_adjective(scanner);
        String adjective4 = get_adjectives.get_adjective(scanner);
        String verb2 = get_verbs.get_verb(scanner);

        String adverb2 = get_adverbs.get_adverb(scanner);
        String noun2 = get_nouns.get_noun(scanner);
        String adjective5 = get_adjectives.get_adjective(scanner);
        String noun3 = get_nouns.get_noun(scanner);

        String adverb3 = get_adverbs.get_adverb(scanner);
        String verb3 = get_verbs.get_verb(scanner);
        String place3 = get_places.get_place(scanner);

        String adverb4 = get_adverbs.get_adverb(scanner);
        String number3 = get_numbers.get_number(scanner);
        String adjective6 = get_adjectives.get_adjective(scanner);
        String adverb5 = get_adverbs.get_adverb(scanner);

        // Create the completed story
        String story =
            "Once upon a time in " + place1 + ", a " + adjective1 + " burger appeared with one goal: to " + verb1 + " the world.\n" +

            "Armed with " + number1 + " golden fries, he " + adverb1 + " marched toward " + place2 + ", but " + number2 + " " + adjective2 + " " + noun1 + "s tried to stop him.\n" +

            "Suddenly, a " + adjective3 + " giant fork attacked! The burger grabbed his " + adjective4 + " spatula and prepared to " + verb2 + ".\n" +

            "The burger " + adverb2 + " dodged the fork, climbed onto a " + noun2 + ", and spotted a " + adjective5 + " " + noun3 + " controlling it.\n" +

            "He " + adverb3 + " leaped forward and used his spatula to " + verb3 + " the control panel, saving the city of " + place3 + ".\n" +

            "The villain " + adverb4 + " surrendered, and the burger shared his " + number3 + " " + adjective6 + " fries. Everyone lived " + adverb5 + " ever after!";

        // Display the completed story
        System.out.println("\n=== YOUR COMPLETED MAD LIBS STORY ===");
        System.out.println(story);

        // Close scanner
        scanner.close();
    }
}
