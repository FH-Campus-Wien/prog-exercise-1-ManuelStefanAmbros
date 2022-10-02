package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
        // input your solution here
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901" + System.lineSeparator()
                + "         __" + System.lineSeparator()
                + " _(\\    |@@|" + System.lineSeparator()
                + "(__/\\__ \\--/ __" + System.lineSeparator()
                + "   \\___|----|  |   __" + System.lineSeparator()
                + "       \\ }{ /\\ )_ / _\\" + System.lineSeparator()
                + "       /\\__/\\ \\__O (__" + System.lineSeparator()
                + "      (--/\\--)    \\__/" + System.lineSeparator()
                + "      _)(  )(_" + System.lineSeparator()
                + "     `---''---`");
        // input your solution here
    }

    //todo Task 3
    public void sumOfLiterals(){
        int chaVar = 'Z';
        int hexVar = 0xface;
        String myOctal = "012";
        int octVar = Integer.parseInt(myOctal, 8);
        long myLong = 80L;
        int lonVar = (int) myLong;
        float myFloat = 44e-1f;
        int floVar = (int) myFloat;
        float myFloat2 = 5.5f;
        int floVar2 = (int) myFloat2;
        double myDouble = 8.88e1;
        int douVar = (int) myDouble;
        double myDouble2 = 99.9;
        int douVar2 = (int) myDouble2;
        int total = chaVar + hexVar + octVar + lonVar + floVar + floVar2 + douVar + douVar2;

        System.out.println(total);
        // input your solution here
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner numberInput = new Scanner(System.in);
                int number = numberInput.nextInt();
                int number2 = numberInput.nextInt();
                numberInput.close();
        System.out.println(number + number2);

        // input your solution here
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner numberInput = new Scanner(System.in);
        int x = numberInput.nextInt();
        int y = numberInput.nextInt();
        numberInput.close();
        System.out.print("Before Swap:\nx: y: ");

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap:\nx: " + x + "\ny: " + y);
        // input your solution here
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner numberInput = new Scanner(System.in);
        int num1 = numberInput.nextInt();
        int num2 = numberInput.nextInt();
        numberInput.close();
        String result;

        if (num1 > num2)
            result = "n1 > n2";
        else if (num2 > num1)
            result = "n2 > n1";
        else
            result = "n1 == n2";

        System.out.println("n1: n2: " + result);
        // input your solution here
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner revenueInput = new Scanner(System.in);
        System.out.println("Enter annual revenue: ");
        int revenue = revenueInput.nextInt();
        revenueInput.close();
        String response;

        if (revenue < 0 || revenue >= 100000)
            response = "Invalid Revenue";
        else if (0 <= revenue && revenue < 20000)
            response = "Poor Sales Revenue";
        else if (20000 <= revenue && revenue < 50000)
            response = "Average Sales Revenue";
        else if (50000 <= revenue && revenue < 80000)
            response = "Good Sales Revenue";
        else
            response = "Excellent Sales Revenue";

        System.out.println(response);
    // input your solution here
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}