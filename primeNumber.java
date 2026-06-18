package DS_and_Algorithm;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (isPrime(num)){
            System.out.println(num + " - This is prime number! ");
        }else {
            System.out.println(num +" - This is not prime number! ");
        }
    }

    private static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        if (num ==2){
            return true;
        }
        if (num % 2 == 0){
            return false;
        }

        for (int i = 3; i*i <= num; i+=2) {
            if (num % i ==0){
                return false;
            }
        }
        return true;
    }
}
