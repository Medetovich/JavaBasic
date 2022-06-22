package recource.Lesseon15;

import java.util.Arrays;


public class Ls15 {
    public static void main(String[] args) {


        // наследование классов . способность одного класса
        // использовать и раширить (extends) фукциональность
        // другого класса
        int [] array = {10, 9 , 25};
        array[1] = 90;
        System.out.println(array[2]);
        System.out.println(array.length);
        AdvancedIntArray advancedIntArray = new AdvancedIntArray(3);
        advancedIntArray.set(0, 10);
        advancedIntArray.set(1, 20);
        advancedIntArray.set(2, 12);
        System.out.println(advancedIntArray.get(2));
        System.out.println(advancedIntArray.size());
        advancedIntArray.append(54);
        System.out.println(advancedIntArray.size());
        OfficeEmployee d = new OfficeEmployee("dina", "samsung", 2500, 400, "gennady");
        /*Employee s = new Employee("sad", "apple", 5000);*/
        System.out.println(d.getName());
        d.introduce();
        advancedIntArray.insert(3, 555 );
        advancedIntArray.print();
        System.out.println(" ");
        advancedIntArray.delete(4);
        advancedIntArray.print();
        System.out.println(advancedIntArray.contains(10));
        OfficeEmployee a = new OfficeEmployee("aleks", "nokia", 2100, 100, "artur");
       /* System.out.println(s.getId());*/
        System.out.println(d.getId());
        System.out.println(a.getId());



    }
}
