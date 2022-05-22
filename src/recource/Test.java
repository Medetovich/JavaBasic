package recource;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int b[] = {12, 5, 3, 65, 6, 9};
        System.out.println(Arrays.toString(thirdValue(b)));
    }


    public static int[] thirdValue(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int temp = i;
            int max = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = j;
                    max = a[j];

                }
            }

            a[temp] = a[i];
            a[i] = max;
}
    return a;
    }
}