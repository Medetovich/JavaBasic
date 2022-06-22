package recource.Ls16;
// Абстрактный класс - это класс у которого есть состояние и часть методов
// один или несколько методов его обьявлены абстрактными и не содержат реализации
// эти методы требуются реализовать в дочерних классах
// создать экземпляр абстрактного класса нельзя
abstract public class Book {
    private int id;
    private String title;
    private String author;
    private double price;
    public abstract boolean isAlibris();

    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
    public double calculatePrice(){
        return getPrice();
    }

}
