import java.util.Arrays;

public class HW11 {
    public static void main(String[] args) {
        int[][] test = {
                {123, 5, 0, -4}, {12, 54, 54, -12}, {4, 4, 8, 15}
        };
        int[] test1 = {12, 54, 11};
        int[] test2 = {2, 5, 19};
        int[] test3 = {16, 32, -5};
        System.out.println(quantityOfNegNumber(test)); // первое задание
        System.out.println(Arrays.toString(getMax(test1, test2, test3)));// второе задание
        selectionSort(test1);
        selectionSort(test3);
        System.out.println(Arrays.toString(test3));

    }


    public static int quantityOfNegNumber(int[][] a) {
        int subArray = 0;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            temp = 0;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 0) {
                    temp += 1;
                    break;
                }
            }
            if (temp > 0) {
                subArray += 1;
            }
        }
        return subArray;
    }

    public static int[] getMax(int[] a, int[] b, int[] c) {
        int[] maxArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= b[i] && a[i] >= c[i]) {
                maxArray[i] = a[i];
            }
            if (b[i] >= a[i] && b[i] >= c[i]) {
                maxArray[i] = b[i];
            }
            if (c[i] >= b[i] && c[i] >= a[i]) {
                maxArray[i] = c[i];
            }
        }
        return maxArray;
    }
    public static void selectionSort(int[]a){
        for(int i = 0; i < a.length; i++){
            int temp = i;
            int min = a[i];
            for(int j = i + 1; j < a.length; j++){
                if (a[j] < a[i]){
                    temp = j;
                    min = a[j];
                }
            }
            a[temp] = a[i];
            a[i] = min;
        }
    }

}
