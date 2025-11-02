package poo.herancaepolimorfismo.clock;

import java.time.LocalTime;

public final class AmericanClock extends Clock {

    @Override
    public void setHour (int hour) {
        if (hour >= 0 && hour <= 11) {
            this.hour = hour;
        }
        else if (hour == 12) {
            this.hour = 0;
            if (this.complement.equals(Complement.AM)) {
                this.complement = Complement.PM;
            } else {
                this.complement = Complement.AM;
            }
        }
        else System.out.printf("%s is an invalid value of hour.\n", hour);
    }

    @Override
    public void currentTime() {
        System.out.println(LocalTime.of(hour, minute, second) + " " + complement);
    }

    @Override
    public void extractInformation (Clock clock) {
        if (clock instanceof AmericanClock) {
            setHour(clock.hour);
            setMinute(clock.minute);
            setSecond(clock.second);
            this.complement = ((AmericanClock) clock).complement;
        } else if (clock instanceof BrazilianClock) {
            if (clock.hour <= 11) {
                setHour(clock.hour);
                this.complement = Complement.AM;
            } else {
                setHour(clock.hour - 12);
                this.complement = Complement.PM;
            } setMinute(clock.minute);
            setSecond(clock.second);
        } else {
            System.out.println("The input must be a clock object.");
        }
    }

}
