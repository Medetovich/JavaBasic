package recource.Ls16;

import org.w3c.dom.ls.LSOutput;

public class App {
    public static void main(String[] args) {
        //Book book = new Book(1, "Корабль", "Гоголь", 11.54);
        LiteratureBook harry = new LiteratureBook(2, "Поттер", "Роулиг", 40.11);
        Bestseller lord = new Bestseller(3, "властелин", "Брайн", 13, 1.5);
        describeBook(lord);
        Book [] books = {/*book,*/ harry, lord};
        Book book = harry;
        for (Book b:books
             ) {
            describeBook(b);
        }
        LiteratureBook j = lord;
        j.hello();
        Bestseller.hello();

        // Полиморфизм - возможость вызвать один и тот же метод у обьектов производных классов
        // по ссылке на базовый класс
    }
    public static void describeBook(Book book){
        System.out.println("id: " + book.getId() +
                " author: " + book.getAuthor() +
                " price " + book.calculatePrice());
    }




}
