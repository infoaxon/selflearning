import java.util.Scanner;

public class KeyboardInput {

    public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    String name;
    int age;
    String city;

    System.out.println("What is your name ?");
    name = keyboard.nextLine();

    System.out.println("What is your age?");
    age = keyboard.nextInt();
    keyboard.nextLine();


    System.out.println("What city do you live in?");
    city = keyboard.nextLine();

    System.out.println("Hello, " + name);
    System.out.println("age is, " + age);
    System.out.println("City is, " + city);

    }
}
