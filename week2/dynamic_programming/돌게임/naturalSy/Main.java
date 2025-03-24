package dynamic_programming.돌게임.naturalSy;

import java.util.Scanner;

public class Main {

    public class StoneGame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.close();

            if (n % 2 == 1) {
                System.out.println("SK");
            } else {
                System.out.println("CY");
            }
        }
    }
}
