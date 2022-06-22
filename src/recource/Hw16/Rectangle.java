package recource.Hw16;

public class Rectangle extends Shape{
    int width;
    int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            System.out.println();
            for (int j = 0; j < width; j++) {
                System.out.print(symbol);

            }
        }
    }
    public Rectangle(char symbol, int width, int height){
        super(symbol);
        this.width = width;
        this.height = height;
    }

}
