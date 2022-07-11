package recource.HW18;

public class FahrenheitCon implements HW18{

    @Override
    public double convert(int celcius) {
        return celcius * 9/5 + 32;
    }
}
