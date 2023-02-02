import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        int minimumAge = 7+(age/2);
        System.out.println(age + " year-olds should date somebody at least " + minimumAge + " years old.");
    }
}