package recource;
import java.util.ArrayList;
import java.util.Arrays;

public class hw13 {
    public static void main(String[] args) {
        int[] li = {13, 12, 5, 3, 4};
        System.out.println(Arrays.toString(delete(li, 1)));
        String aa = ")12 + 5) + (22 + 12)";
        System.out.println(scammersTrue(aa));
        System.out.println(getIndexOfElement(li, 19));
        java();
    }

    public static int[] delete(int[] a, int b) {
        int[] arr = new int[a.length - 1];
        for (int i = 0; i < a.length; i++) {
            if (i == b) {
                for (int j = 0; j < i; j++) {
                    arr[j] = a[j];
                }
                for (int k = i; k < a.length - 1; k++) {
                    arr[k] = a[k + 1];
                }
                break;
            }
        }
        return arr;
    }
    public static boolean scammersTrue(String s) {
        char[] d = s.toCharArray();
        char[] sk = {')', '('};
        boolean a = true;
        int st1 = 0;
        int st2 = 0;
        for (int j = 0; j < d.length; j++) {
            if (st1 < st2) {
                a = false;
                break;
            } else if (d[j] == sk[1]) {
                st1 += 1;
            } else if (d[j] == sk[0]) {
                st2 += 1;
            }
        }
        if (st1 == st2) {
            a = true;
        }
        return a;
    }
    public static int getIndexOfElement (int [] a, int b) {
        HW11.selectionSort(a);
        int d = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= b && i < a.length - 1) {
                d = i;
                break;
            }else if(a[i] < b && i == a.length - 1){
                d = i + 1;
                break;
            }
        }
        return d;
    }
    public static void java(){
        System.out.println("   J   a  v    v  a");
        System.out.println("   J  a a  v  v  a a");
        System.out.println("J  J aaaaa  VV  aaaaa");
        System.out.println("JJJ a    a  V  a    a");

    }

}



