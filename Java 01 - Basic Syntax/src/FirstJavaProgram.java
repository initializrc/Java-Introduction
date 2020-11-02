import java.util.Scanner;

public class FirstJavaProgram {
    public static void main(String[] args) {
        // syntax output
        System.out.println("<<< SYNTAX JAVA >>>\n");
        System.out.println("<<< Output Print >>>");
        System.out.println("Hello World");
        System.out.print("Hello World 1 ");
        System.out.printf("%s\n", "Hello World 2");

        // primitive data type
        System.out.println("\n<<< Primitive Data Type >>>");
        int numberInteger = 5;
        long numberLong = 7;
        double numberDouble = 4.5;
        float numberFloat = (float) 6.5;
        char alphabet = 'A';
        boolean bool = true;

        System.out.println("Integer Number : " +  numberInteger);
        System.out.println("Long Number : " + numberLong);
        System.out.println("Double Number : " + numberDouble);
        System.out.println("Float Number : " + numberFloat );
        System.out.println("Alphabet : " + alphabet);
        System.out.println("Boolean : " + bool);

        //arithmetic operators
        System.out.println("\n<<< Arithmetic Operators >>>");
        int number1 = 105;
        int number2 = 49;

        System.out.println("First Number : " + number1);
        System.out.println("Second Number : " + number2);
        System.out.println("+ Result: " + (number1 + number2));
        System.out.println("- Result: " + (number1 - number2));
        System.out.println("* Result: " + (number1 * number2));
        System.out.println("/ Result: " + (number1 / number2));
        System.out.println("% Result: " + (number1 % number2)); // modulus

        // selection
        System.out.println("\n<<< Selection >>>");
        System.out.println("*If Else*");
        int number_1 = 9;
        int number_2 = 7;

        if (number_1 == number_2){
            System.out.println("The number is same");
        } else if (number_1 > number_2){
            System.out.println("Number_1 > Number_2");
        } else if (number_1 < number_2){
            System.out.println("Number_1 < Number_2");
        }

        System.out.println("*Switch Case*");
        int menu = 5;
        switch (menu){
            case 1 :
                System.out.println("Menu 1");
                break;
            case 2 :
                System.out.println("Menu 2");
                break;
            case 3 :
                System.out.println("Menu 3");
                break;
            default:
                System.out.println("Default Menu");
        }

        // syntax input
        System.out.println("\n<<< Inputan >>>");
        Scanner scan = new Scanner(System.in);

        String name;
        int age;
        float gpa;

        System.out.println("Input Name: ");
        name = scan.nextLine();

        System.out.println("Input Age: ");
        age = scan.nextInt();

        System.out.println("Input GPA: ");
        gpa = scan.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);

        // repetition / iteration / looping
        System.out.println("\n<<< Looping >>>");
        // for
        System.out.println("*For*");
        for (int i = 0; i < 15; i++){
            System.out.println("NUmber : " + i);
        }

        System.out.println("For with Break & Continue");

        for (int i = 0; i < 15; i++){
            if (i == 5){
                break;
            }

            if (i == 3){
                continue;
            }
            System.out.println("Number : " + i);
        }

        // while
        // perhitungan mundur
        System.out.println("\n*While*");
        int numbers = 10;
        while (numbers > 5){
            System.out.println("Number : " + numbers);
            numbers--;
        }

        // do while
        System.out.println("*DO While*");
        int number;

        do {
            System.out.println("Input Number [1 - 10] : ");
            number = scan.nextInt(); scan.nextLine();
        } while (number < 1 || number > 10);

    }
}