package recource.Hw16;

public class Line extends Shape{
    int length = 4;
    @Override
    public void draw() {
        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Line(char symbol, int length){
        super(symbol);
        this.length = length;
    }
}
