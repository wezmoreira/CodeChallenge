package leetcode;

public class PalindromeNumber {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x) {
        String xToStringReverse = new StringBuilder(Integer.toString(x)).reverse().toString();
        String xToString = new StringBuilder(Integer.toString(x)).toString();
        boolean compare = xToStringReverse.equals(xToString);

        if(compare){
            return true;
        }
        return false;
    }
}

/*
    Given an integer (x, return true if x is a palindrome, and
    false otherwise.

    Example 1:

    Input: x = 121
    output: true

    Explanation: 121 reads as 121 from left to
    right and from right to left.

    Example 2:

    Input: x = -121
    output: false

    Explanation: From left to right, it reads
    -121. From right to left, it becomes 121-.
    Therefore it is not a palindrome.
 */
