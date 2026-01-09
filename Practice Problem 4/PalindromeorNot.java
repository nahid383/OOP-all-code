
import java.util.Scanner;

public class PalindromeorNot {
    public static boolean  palindrome(String s){

        int len  = s.length();
        int n = len-1;
        for (int i = 0; i < len/2; i++) {
            if(s.charAt(i)!=s.charAt(n)){
                return false;
            }
            n--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(palindrome(s)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
