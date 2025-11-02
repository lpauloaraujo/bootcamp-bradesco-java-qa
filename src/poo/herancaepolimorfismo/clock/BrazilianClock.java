package poo.herancaepolimorfismo.clock;

public final class BrazilianClock extends Clock {

    @Override
    public void extractInformation (Clock clock) {
        if (clock instanceof BrazilianClock) {
            setHour(clock.hour);
            setMinute(clock.minute);
            setSecond(clock.second);
        } else if (clock instanceof AmericanClock) {
            if (clock.getComplement().equals(Complement.AM)) {
                setHour(clock.hour);
            } else {
                setHour(clock.hour + 12);
            } setMinute(clock.minute);
            setSecond(clock.second);
        } else {
            System.out.println("The input must be a clock object.");
        }
    }
}
