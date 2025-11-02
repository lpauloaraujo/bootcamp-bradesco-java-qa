package poo.herancaepolimorfismo.ticket;

import java.math.BigDecimal;

public abstract sealed class MovieTicket permits HalfPriceMovieTicket, FamilyMovieTicket {
    private BigDecimal value;
    private String movieName;
    private LanguageType languageType;

    public MovieTicket () {

    }

    public MovieTicket (BigDecimal value, String movieName, LanguageType languageType) {
        this.value = value;
        this.movieName = movieName;
        this.languageType = languageType;
    }

    public BigDecimal getFinalValue() {
        return value;
    }

    public String getMovieName() {
        return movieName;
    }

    public LanguageType getLanguageType() {
        return languageType;
    }

}
