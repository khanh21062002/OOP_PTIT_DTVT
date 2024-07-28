package BASIC003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String name = sc.nextLine();
            System.out.println("Hi " + name);
        }
    }
}
