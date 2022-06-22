package recource.Ls16;

public class LiteratureBook extends Book{
    // Наследование extends
    // в джаве только одиароное наследование
    //можно переопределять методы из родительского класса при этом
    // реализация родительских методов доступна через super
    // статические методы не могут переопределяться
    public static void hello(){
        System.out.println("FROM lITERATURE BOOK");
    }
    @Override
    public boolean isAlibris() {
        return false;
    }

    public LiteratureBook(int id, String title, String author, double price) {
        super(id, title, author, price);

    }
    @Override
    public double calculatePrice(){
        return super.calculatePrice() + 10;
    }
}
