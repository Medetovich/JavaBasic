package recource;

import java.util.Locale;

public class Hw19 {
    public static void main(String[] args) {
        String b = "nALlan ";
        String d = "321 4532 fds dsa 3123 312 1 11 1";
        System.out.println(polind(b));
        System.out.println(quant(b, 'l'));
        System.out.println(countOfWords(d));
        System.out.println(nQuantity(d,9));
        System.out.println(almostLastWord(d));

    }
    public static boolean polind(String a){
        a = a.toLowerCase();
        boolean flag = false;
        int step = 0;
        char [] s = new char[a.length()];
        for (int i = 0; i < a.length() ; i++) {
            s[i] = a.charAt(i);
        }
        for (int i = 0; i < s.length / 2; i++) {
            if(s[i] == s[s.length - 1 - i]){
                step += 1;
                if (step == s.length / 2) {
                    flag = true;
                }
            }

        }
    return flag;
    }
    public static int quant (String a, char b){
        int count = 0;
        a = a.toLowerCase();
        char [] s = new char[a.length()];
        for (int i = 0; i < a.length() ; i++) {
            s[i] = a.charAt(i);
        }
        for (int i = 0; i < s.length; i++) {
            if (s[i] == b)
                count +=1;
        }
    return count;
    }
    public static int countOfWords (String a) {
        String[] b = a.split(" ");
        return b.length;
    }
    public static String nQuantity(String a, int n){
        return a = a.substring(0, n);
    }
    public static String almostLastWord(String a){
        String[] b = a.split(" ");
        return b[b.length - 2];
    }
}
