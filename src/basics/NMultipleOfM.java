package basics;

import java.util.Scanner;

public class NMultipleOfM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n % m == 0) {
            System.out.println(n + " is multiples of" + m);
        }else{
            System.out.println(n + " is not multiples of " + m);
        }
    }
}
