package util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }
}
