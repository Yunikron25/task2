package git.roman;

import java.util.Scanner;

public class maine {

    public static class CompareStrings {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первую строку: ");
            String a = scanner.nextLine();

            System.out.print("Введите вторую строку: ");
            String b = scanner.nextLine();

            if (a.equals(b)) {
                System.out.println("Строки идентичны");
            } else {
                System.out.println("Строки неидентичны");
            }
        }
    }
}
