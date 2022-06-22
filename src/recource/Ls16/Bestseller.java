package recource.Ls16;

public class Bestseller extends LiteratureBook {
    public Bestseller(int id, String title, String author, double price, double coef) {
        super(id, title, author, price);
        this.coef = coef;
    }
    public static void hello(){
        System.out.println("hello from Bestseller");
    }

    public double getCoef() {
        return coef;
    }

    public void setCoef(double coef) {
        this.coef = coef;
    }

    private double coef;
    @Override
    public double calculatePrice(){
        return super.calculatePrice() * coef;
    }
}
