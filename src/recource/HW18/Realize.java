package recource.HW18;

public class Realize {
    public static void main(String[] args) {
        FahrenheitCon fahr = new FahrenheitCon();
        KelvinCon kel = new KelvinCon();
        System.out.println(kel.convert(20));
        System.out.println(fahr.convert(20));
        System.out.println(new FahrenheitCon().convert(121));
        System.out.println(new KelvinCon().convert(121));

        MyTime time = new MyTime(1,99,67);
        MyTime t = new MyTime(2,58,55);

        System.out.println(t.add(time));


    }



}
