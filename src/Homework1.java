import java.util.Scanner;

public class Homework1 {
    static Scanner enter;

    public static void main(String[] args) {
        enter = new Scanner(System.in);

        ScannerMyParameters();
        System.out.println();
        CharToInt();
        System.out.println();
        calculateBim();
        System.out.println();

        enter.close();
    }
    public static void ScannerMyParameters() {

        System.out.print("Please, enter your name :");
        String name = enter.nextLine();

        System.out.print("Please, enter your surname :");
        String surname = enter.nextLine();

        System.out.print("Please, enter your age :");
        String age = enter.nextLine();

        System.out.print("Please, enter your height :");
        String height = enter.nextLine();

        System.out.print("Please, enter your weight :");
        String weight = enter.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Sureame: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Haight: " + height);
        System.out.println("Weight: " + weight);

    }

    public static void CharToInt() {

        char mySymbol = 'A';
        System.out.println("A -" + (int) mySymbol);
        char mySymbol1 = 'C';
        System.out.println("C -" + (int) mySymbol1);

    }

    public static void calculateBim() {

        System.out.print("Please, enter your Weight :");
        double Weight = enter.nextDouble();
        System.out.print("Please, enter your Height :");
        double Height = enter.nextDouble();
        double BMI = Weight / (Height * Height);

        System.out.println("BMI is " + BMI + " kg/m2");

    }
}
