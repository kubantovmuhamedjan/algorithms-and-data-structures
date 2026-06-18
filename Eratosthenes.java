package DS_and_Algorithm;

import java.util.Scanner;

public class Eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        boolean[] PrimeNumbers = sieveOfEratosthenes(num);

        for (int i = 0; i < PrimeNumbers.length; i++) {
            if (PrimeNumbers[i]) {
                System.out.print(i + " ");
            }
        }

    }



    private static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
