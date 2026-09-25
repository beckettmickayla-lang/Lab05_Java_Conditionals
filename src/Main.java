import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your age in years: ");
    int age = scanner.nextInt();
    if (age >= 21) {
        System.out.print("You are 21 or older. You get a wristband.");
    } else {
         System.exit(0);
    }
}

