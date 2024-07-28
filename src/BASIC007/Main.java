package BASIC007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            int check = 0;
            String s;
            int year = sc.nextInt();
            if (year % 100 == 0)
            {
                if (year % 400 == 0){
                    check = 1;
                }
                else check = 0;
            }
            else if (year % 4 == 0) {
                check = 1;
            }
            else
                check = 0;

            if(check == 1){
                s = "Leap-year";
            }
            else{
                s = "Non Leap-year";
            }
            System.out.println(year + " : " + s);
        }
    }
}
