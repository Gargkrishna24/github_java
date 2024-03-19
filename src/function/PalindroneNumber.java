package function;

public class PalindroneNumber {
    public static boolean isPalindrome(int number) {
        int temp= number;
        int palindromeNumber = 0;
        while (number > 0) {
           int numbers = number % 10;
            palindromeNumber = palindromeNumber*10+numbers;
            number = number / 10;
        }
        return palindromeNumber==temp;
    }

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(1221);
        System.out.println("palindrome = " + palindrome);
    }
}
