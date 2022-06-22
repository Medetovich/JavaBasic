package recource.Hw16;

public class Realize {
    public static void main(String[] args) {
        Line line = new Line('#', 10);
        //System.out.println(line.getLength());
        //line.draw();
        Rectangle rectangle = new Rectangle(line.getSymbol(), 6, 3);
        //rectangle.draw();
        Shape[] figures = {line, rectangle};
        Picture picture = new Picture('$', figures);
        picture.draw();


    }

}
