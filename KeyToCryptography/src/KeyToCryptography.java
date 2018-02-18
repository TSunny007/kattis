import java.util.Arrays;
import java.util.Scanner;

public class KeyToCryptography {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String cipherText = sc.next();
        String secretText = sc.next();
        char[] key = new char[cipherText.length()];
        char[] answer = new char[cipherText.length()];
            for (int i = 0; i < secretText.length(); i++) {
                if(i<key.length){
                    key[i]= secretText.charAt(i);
                }
            }
            //Prelim work finished. Starting deciphering now
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (char) ((cipherText.charAt(i) - key[i]) >= 0 ? (cipherText.charAt(i) - key[i]+'A'): ('Z'+1+(cipherText.charAt(i) - key[i])));
                    //If the difference is positive then we can just add that to A, however, because the difference is cyclic, if its negative then we have to handle it differently
            if (i + secretText.length() < key.length) {
                key[i+secretText.length()] = answer[i];
            }
        }
        System.out.println(String.valueOf(answer));
    }

}
