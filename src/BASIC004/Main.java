package BASIC004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- >0){
            System.out.println("Ten ban la gi: ");
            String name = sc.nextLine();
            String s = "Hi ";
            System.out.println(s + name);
        }
    }
}
