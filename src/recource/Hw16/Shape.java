package recource.Hw16;

public abstract class Shape {
    public char symbol;
    abstract public void draw();

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public Shape(char symbol){
        this.symbol = symbol;
    }
}
