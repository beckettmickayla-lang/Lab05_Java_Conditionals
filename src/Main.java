import java.util.Scanner;
void main() {
    Scanner in = new Scanner(System.in);
    double itemPrice = 0;
    String Trash = "";
    double totalCost = 0;
    System.out.print("Enter your item price: ");
    if (in.hasNextDouble()) {
        itemPrice = in.nextDouble();
        in.nextLine(); // Remember to clear the buffer here
        if (itemPrice>=100) {
            System.out.print("Your shipping is free and your total cost is " + itemPrice);
        } else if (itemPrice<100) {
            totalCost = (itemPrice * 0.02) + itemPrice;
            System.out.print("Your total cost with shipping is " + totalCost);
        }
    } else {
        Trash = in.nextLine();
        System.out.print("Enter a valid item price. You entered: " + Trash);
    }
}