package lambdafunction;

@FunctionalInterface
interface PalindromeCheck{
    boolean isPalindrome(String str);
}

public class Palindrome{
    public static void main(String[] args) {
        PalindromeCheck checker = (str)->{
            String cleaned = str.replaceAll("\\s+","").toLowerCase();
            String reversed = new StringBuilder(cleaned).reverse().toString();
            return cleaned.equals(reversed);
        };

        String input = "Madam";

        if(checker.isPalindrome(input)){
            System.out.println(input + " is a Palindrome");
        }else{
            System.out.println(input + " is Not a Palindrome");
        }
    }
}