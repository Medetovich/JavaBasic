package recource.Ls17;

//
public class Fraction {
    private int num;
    private int den;

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public Fraction multiply(Fraction f) {
        int num1 = getNum() * f.getNum();
        int den1 = getDen() * f.getDen();
        if (num1 == den1) {
            num1 = 1;
            den1 = 1;
            return new Fraction(num1, den1);
        }
        for (int i = den1 / 2 + 1; i > 1; i--) {
            if ((num1 % i == 0) && (den1 % i == 0)) {
                num1 = num1 / i;
                den1 = den1 / i;
                break;
            }
        }
        return new Fraction(num1, den1);
    }

    public Fraction add(Fraction f) {
        int num1;
        int den1;
        if (getDen() != f.getDen()) {
            num1 = getNum() * f.getDen() + getDen() * f.getNum();
            den1 = getDen() * f.getDen();}
        else {
            num1 = getNum() + f.getNum();
            den1 = getDen();
        }
        if (num1 == den1) {
            num1 = 1;
            den1 = 1;
            return new Fraction(num1, den1);
            }
        for (int i = (den1); i > 1; i--) {
            if ((num1 % i == 0) && (den1 % i == 0)) {
                num1 = num1 / i;
                den1 = den1 / i;
                return new Fraction(num1, den1);
                }
            }
        return new Fraction(num1, den1);
    }

    public Fraction devide(Fraction f) {
        int num1 = getNum() * f.getDen();
        int den1 = getDen() * f.getNum();
        if (num1 == den1) {
            num1 = 1;
            den1 = 1;
            return new Fraction(num1, den1);
        }
        for (int i = den1 / 2 + 1; i > 1; i--) {
            if ((num1 % i == 0) && (den1 % i == 0)) {
                num1 = num1 / i;
                den1 = den1 / i;
                break;
            }
        }
        return new Fraction(den1, num1);
    }

    public Fraction minus (Fraction f){
        int num1;
        int den1;
        if (getDen() != f.getDen()) {
            num1 = getNum() * f.getDen() - getDen() * f.getNum();
            den1 = f.getDen() * getDen();
            num1 = Math.abs(num1);}
        else {
            num1 = getNum() - f.getNum();
            den1 = getDen();
            num1 = Math.abs(num1);
        }
        if (num1 == den1) {
            num1 = 1;
            den1 = 1;
            return new Fraction(num1, den1);
        }
        for (int i = den1 / 2 + 1; i > 1; i--) {
            if ((num1 % i == 0) && (den1 % i == 0)) {
                num1 = num1 / i;
                den1 = den1 / i;
                return new Fraction(num1, den1);
            }
        }
        return new Fraction(num1, den1);
    }
    public void print() {
        System.out.println(" " + num + "/" + den);
    }

}
