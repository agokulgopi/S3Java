import java.util.Scanner;
import java.util.*;

public class PalindromeOrNot {
    
    
    static boolean isPalindrome(String str)
    {
        int i=0,j=str.length()-1;
        while (i<j) {
            if (str.charAt(i)!=str.charAt(j)) 
                return false;
            i++;
            j--;
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        str=str.toLowerCase();
        if (isPalindrome(str)) {
            System.out.println("Yes, It is Palindrome.");
        } else {
            System.out.println("It is not Palindrome."); 
        }
    }
}
