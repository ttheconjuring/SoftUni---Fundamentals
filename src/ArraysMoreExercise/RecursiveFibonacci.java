package ArraysMoreExercise;

import java.util.Scanner;

public class RecursiveFibonacci {
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(fib(n));
        sc.close();
    }
}


