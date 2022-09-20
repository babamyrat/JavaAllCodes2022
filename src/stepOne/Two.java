package stepOne;

import java.util.Scanner;

public class Two {
    // 1 code
    public static void startScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?: ");
        String name = scanner.nextLine();

        System.out.println("Hello "+name);
    }
}
