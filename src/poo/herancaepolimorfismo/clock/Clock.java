package poo.herancaepolimorfismo.clock;

import java.time.LocalTime;

public abstract sealed class Clock permits AmericanClock, BrazilianClock{
    protected int hour;
    protected int minute;
    protected int second;
    protected Complement complement = Complement.AM;

    public void currentTime () {
        System.out.println(LocalTime.of(hour, minute, second));
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
        else if (hour == 24) {
            this.hour = 0;
        }
        else System.out.printf("%s is an invalid value of hour.\n", hour);
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else if (minute == 60) {
            setHour(this.hour + 1);
            setMinute(0);
        } else System.out.printf("%s is an invalid value of minute.\n", minute);
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else if (second == 60) {
            setMinute(minute + 1);
        } else System.out.printf("%s is an invalid value of second.\n", second);
    }

    public void setComplement (Complement complement) {
        this.complement = complement;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public Complement getComplement() {return complement; }

    public void extractInformation(Clock clock) {

    }

}
