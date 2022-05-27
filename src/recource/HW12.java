package recource;

import java.util.Arrays;
import java.util.ArrayList;

public class HW12 {
    public static void main(String[] args) {
        int[] li = {1, 5, 4, 4, 4, 4};
        int[] li1 = {32, 32, 9, 443, 12, 7,};
        int[] li2 = {21, 443, 12, 4, 9, 65, 32};
        double[] li3 = {1,2,3,4};
        int[] li4 = {1, 1, 5, 9, 4, 12};
        Test.thirdValue(li);
        //System.out.println(thirdBiggestSize(li));
        //System.out.println(equalsValuesOfTwoElements(li1, li2));
        //System.out.println(averageElemOfArrays(li1));
        System.out.println(disOfArrays(li3));
        //System.out.println(isInside(li, li4));
        System.out.println(rekSumOfArray(li, li.length - 1));
        //System.out.println(nod(35, 18));
    }

    public static int thirdBiggestSize(int[] a) {
        int checkValue = 0;
        int d = 0;
        int c = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > c  ) {
                checkValue += 1;
            }
            if (checkValue == 2) {
                d = a[i];
                break;
            }

        }
        return d;
    }

    public static ArrayList equalsValuesOfTwoElements(int[] a, int[] b) {
        ArrayList c = new ArrayList<>(a.length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c.add(0, a[i]);
                }
            }

        }
        return c;
    }

    public static double averageElemOfArrays(int[] a) {
        double b = 0;
        for (int i = 0; i < a.length; i++) {
            b += a[i];
        }
        return b / a.length;
    }

    public static double disOfArrays(double[] a) {
        int m = a.length;
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        double average = sum / m;
        double disp = 0;
        for (int i = 0; i < a.length; i++) {
            disp += (a[i] - average) * (a[i] - average);
        }
        return disp / m;
    }

    public static boolean isInside(int[] a, int[] b) {
        boolean d = false;
        int step = 0;
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    step += 1;
                    break;
                }
            }
            d = a.length == step ? true : false;
        }
        return d;
    }

    public static int rekSumOfArray(int[] a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a[b] + rekSumOfArray(a, b - 1);
        }
    }

    public static int nod(int a, int b) {
        if (a <= 0) {
            return a + b;
        }
        return nod(b % a, a);
    }


}
