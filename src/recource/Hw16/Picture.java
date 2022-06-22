package recource.Hw16;

public class Picture extends Shape{
    public Picture(char symbol, Shape []array) {
        super(symbol);

        this.array = array;
    }
    int elem;
    Shape [] array;

    @Override
    public void draw() {
        for (Shape i:array)
            i.draw();
    }

    public Shape [] getArray() {
        return array;
    }

    public void setArray(Shape[] array) {
        this.array = array;
    }
}
