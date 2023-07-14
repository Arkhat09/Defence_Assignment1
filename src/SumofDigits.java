import java.util.Scanner;

public class SumofDigits {
    public static int sumOfDigits (int n){
        if(n<10) {
            return n;
        }else{
            return n % 10 +sumOfDigits(n/10);

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = sumOfDigits(n);
        System.out.println("Sum of digits  " + sum );

    }
}