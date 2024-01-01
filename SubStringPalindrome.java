import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubStringPalindrome {
    public static void main(String[] args) {
        Palindrome obj = new SubStringPalindrome.Palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the substring: ");
        String subt = sc.nextLine();
        System.out.println();
        System.out.println("Available Palindromes are : ");
        obj.palindromeSearcher(subt);
    }

    static class Palindrome {

        public void palindromeSearcher(String substring) {
            List<String> substrings = substringChecker(substring);
            for (String record : substrings) {
                boolean temp = true;
                int size = record.length();
                for (int j = 0; j < size; j++) {
                    if (record.charAt(j) != record.charAt(size - j - 1)) {
                        temp = false;
                        break;
                    }
                }
                if (temp) {
                    System.out.println(record);
                }
            }
        }

        List<String> substringChecker(String value) {
            List<String> substrings = new ArrayList<>();
            for (int i = 0; i < value.length(); i++) {
                for (int j = i + 1; j <= value.length(); j++) {
                    String temp = value.substring(i, j);
                    substrings.add(temp);
                }
            }
            return substrings;
        }
    }
}
