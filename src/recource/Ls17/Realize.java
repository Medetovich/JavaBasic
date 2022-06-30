package recource.Ls17;

public class Realize {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(8, 7);
        Fraction fr = new Fraction(7, 7);
        fr.multiply(fraction).print();
        fr.add(fraction).print();
        fr.devide(fraction).print();
        fr.minus(fraction).print();
        CustomArrayList list = new CustomArrayList();
        System.out.println(list.size());
        list.append(13);
        list.append(1);
        list.append(19);
        list.append(55);
        list.insert(1, 555);
        System.out.println(list.size());
        //list.printAllElem();
        list.append(new int[] {12});
        list.printAllElem();
        System.out.println(list.size());
        System.out.println(list.contains(1));
    }
}
