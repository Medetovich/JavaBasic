package recource.hw14;

import recource.HW11;

public class hw14 {

    public static void main(String[] args) {
        LoanTaker vas = new LoanTaker(50, 19000);
        LoanIssuer gen = new LoanIssuer(false, false);
        LoanTaker va = new LoanTaker(18, 30000);
        LoanIssuer ge = new LoanIssuer(false, false);
        LoanTaker v = new LoanTaker(71, 30000);
        LoanIssuer g = new LoanIssuer(false, false);
        System.out.println(gen.checkLoanTaker(vas));
        System.out.println(gen.checkLoanTaker(va));
        System.out.println(gen.checkLoanTaker(v));
        int[] li  = {12, 43, 21, 3, 5, 6, 4};
        int[] li1  = {1, 43, 21, 3, 5, 6, 4};
        BiSearch(li, 3);
        BiSearch(li1, 1);

    }
    public static void BiSearch(int[] a, int b){
        HW11.selectionSort(a);
        int pos;
        int step = 1;
        int f = 0;
        int l = a.length - 1;
        pos = (a[0] + a.length - 1) / 2;
        while((a[pos] != b) && (f <= l)){
            step++;
            if (a[pos]>b) {
                l = pos - 1;
            }else{
                f = pos + 1;
            }
            pos = (f + l) / 2;
        }
        if (f <= l){
            System.out.println("position " + pos + ",  value " + b + ", step " + step);
        }else{
            System.out.println("not found, steps -  " + step);
        }

    }


}
class LoanTaker{
    int age;
    int salary;
    LoanTaker(int age, int salary){ // конструктор
        this.age = age;
        this.salary = salary;

    }

}
class LoanIssuer{
    boolean isLazy;
    boolean isKind;
    LoanIssuer(boolean isLazy, boolean isKind){ // коструктор
        this.isLazy = isLazy;
        this.isKind = isKind;

    }

    boolean checkLoanTaker(LoanTaker a) { // Функция
        if (isLazy == true && a.age >= 18 && a.salary >= 20000){
            return true;
        }else if(isLazy == false && isKind == true && a.age <= 70 && a.age >= 18 && a.salary >=20000){
            return true;
        }else if(isLazy == false && isKind == false && a.salary >= 20000 && a.age <= 50 && a.age >= 18){
            return true;
        }else return false;



    }
}

