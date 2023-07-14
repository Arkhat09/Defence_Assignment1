import java.util.Scanner;

public class Palindrome {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String input1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String input2 = scanner.nextLine();

        boolean isPalindrome1 = checkPalindrome(input1);
        boolean isPalindrome2 = checkPalindrome (input2);
        System.out.println(input1 + " is " + (isPalindrome1 ? "a palindrome" : "Yes"));
        System.out.println(input2 + " is  " + (isPalindrome2 ? "a palindrome" : "No"));

    }
    public static boolean checkPalindrome(String str ) {
        if (str.length() <=1) {
            return true;
        }else if (str.charAt(0) != str.charAt(str.length()- 1 ) ) {
            return false;
        }else {
            return checkPalindrome(str.substring(1, str.length() -1 ));
        }
        }
    }



