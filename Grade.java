import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter total marks: ");
double totalMarks = scanner.nextDouble();
System.out.print("Enter obtained marks: ");
double obtainedMarks = scanner.nextDouble();
double percentage = (obtainedMarks / totalMarks) * 100;
System.out.println("Percentage: " + percentage + "%");
if (percentage >= 90) {
System.out.println("Grade A");
} else if (percentage >= 80) {
System.out.println("Grade B");
} else if (percentage >= 70) {
System.out.println("Grade C");
} else if (percentage >= 60) {
System.out.println("Grade D");
} else if (percentage >= 40) {
System.out.println("Grade E");
} else {
System.out.println("Grade F");
}
scanner.close();
}
}
