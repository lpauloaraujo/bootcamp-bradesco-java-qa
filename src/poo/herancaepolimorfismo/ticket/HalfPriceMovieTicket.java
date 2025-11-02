package poo.herancaepolimorfismo.ticket;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class HalfPriceMovieTicket extends MovieTicket {

    public HalfPriceMovieTicket (BigDecimal value, String movieName, LanguageType languageType) {
        super(value, movieName, languageType);
    }

    @Override
    public BigDecimal getFinalValue () {
        return super.getFinalValue().divide(BigDecimal.valueOf(2), 2, RoundingMode.HALF_UP);
    }
}
