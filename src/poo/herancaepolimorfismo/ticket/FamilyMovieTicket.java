package poo.herancaepolimorfismo.ticket;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class FamilyMovieTicket extends MovieTicket {
    private final int numberOfPeople;

    public FamilyMovieTicket (BigDecimal value, String movieName, LanguageType languageType, int numberOfPeople) {
        super(value, movieName, languageType);
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public BigDecimal getFinalValue(){
        BigDecimal finalValue = super.getFinalValue().multiply(BigDecimal.valueOf(this.numberOfPeople));
        if (this.numberOfPeople > 3) {
            finalValue = finalValue.multiply(BigDecimal.valueOf(0.95));
        }
        return finalValue.setScale(2, RoundingMode.HALF_UP);
    }
}
