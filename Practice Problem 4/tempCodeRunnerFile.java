
import java.util.Scanner;

public class freqCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len  = s.length();
        int[] freq = new int[26];
        for (int i = 0; i < len; i++) {
            freq[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if(freq[i]>0){
                System.out.println((char)(i+'a') + ":" + freq[i]);
            }
        }
    }
}
