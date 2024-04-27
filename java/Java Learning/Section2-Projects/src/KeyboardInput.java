import java.util.Scanner;

public class KeyboardInput {

    public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    String name;
    int age;
    String city;
    double rlno;

    System.out.println("What is your name ?");
    name = keyboard.nextLine();

    System.out.println("What is your age?");
    age = keyboard.nextInt();
    keyboard.nextLine();

    System.out.println("Enter a real no.");
    rlno = keyboard.nextDouble(); // Here we use the Keyboard to input for us a double value
    keyboard.nextLine();
    rlno = rlno * 2;
    System.out.println("Multiplied No. is " + rlno);


    System.out.println("What city do you live in?");
    city = keyboard.nextLine();

    System.out.println("Hello, " + name);
    System.out.println("age is, " + age);
    System.out.println("Mutiplined No. was " + rlno);
    System.out.println("City is, " + city);

    }
}
