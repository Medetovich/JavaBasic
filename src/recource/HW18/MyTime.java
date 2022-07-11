package recource.HW18;

import recource.Ls16.MyArrayList;

import java.util.Objects;

public class MyTime<d> {
    private int hours;
    private int minutes;
    private int seconds;
    public MyTime(){}
    public MyTime(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    public MyTime add(MyTime a){
        int h = getHours()+a.getHours();
        int m = getMinutes() + a.getMinutes();
        int s = getSeconds() + a.getSeconds();
        if (s >= 60){
            m += s / 60;
            s %= 60;
        }
        if (m >= 60){
            h += m / 60;
            m %= 60;
        }
        return new MyTime(h,m,s);
    }

    @Override
    public String toString() {
        return "MyTime " +
                "hours = " + hours +
                ", minutes = " + minutes +
                ", seconds = " + seconds;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MyTime))
            return false;
        MyTime d = (MyTime) o;
        if (getMinutes() == (d.getMinutes()) && getHours()==d.getHours() && getSeconds() == d.getSeconds());
            return true;

    }


    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

}
