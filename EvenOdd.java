import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = scanner.nextInt();

if (number % 2 == 0) {
System.out.println(number + " is an Even number.");
} else {
System.out.println(number + " is an Odd number.");
}
scanner.close();
}
}
