package palindrome;

 // @author Sofi
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Type a word: ");
        String word = scanner.nextLine ();
        boolean palindrome = true;

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)) {
                    palindrome = false;
                    break;
                }
        }    
        System.out.println("The word " + (palindrome ? "is" : "is not") + " Palindrome");
    }
}
