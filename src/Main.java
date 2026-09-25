import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your dinner choice of C, F, or V: ");
    String dinnerChoice;
    dinnerChoice = scanner.next();
    if (dinnerChoice.equalsIgnoreCase("C")) {
        System.out.println("You get the Chicken Parmesan.");
    } else if (dinnerChoice.equalsIgnoreCase("F")) {
        System.out.println("You get the Roast Salmon.");
    } else if (dinnerChoice.equalsIgnoreCase("V")) {
        System.out.println("You get the Butternut Squash.");
    } else {
        System.out.println("Invalid choice. Please select C, F, or V.");
    }

    scanner.close();
}

