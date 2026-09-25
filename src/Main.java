import java.util.Scanner;
void main() {
    Scanner in = new Scanner(System.in);
    int birthMonth;
    String trash = "";
    System.out.print("Enter your birth month: ");
    if (in.hasNextInt()) {
        birthMonth = in.nextInt();
        in.nextLine(); // Remember to clear the buffer here
        if (birthMonth >= 1 && birthMonth  <= 12) {
            System.out.print("Your birth month is: " + birthMonth);
        } else {
            System.out.print("Enter a valid birth month 1-12. You entered: " + birthMonth);
        }
    } else {   trash = in.nextLine();
        System.out.print("Enter a valid birth month. You entered: " + trash);
    }
}
