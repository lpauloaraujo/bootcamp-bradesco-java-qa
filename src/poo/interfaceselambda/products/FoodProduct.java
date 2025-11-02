package poo.interfaceselambda.products;

import java.math.BigDecimal;

public class FoodProduct implements Product {
    private BigDecimal value = BigDecimal.ZERO;

    @Override
    public BigDecimal taxValue () {
        BigDecimal tax = this.value.multiply(BigDecimal.valueOf(0.01));
        return this.value.add(tax);
    }

    public void setValue (float value) {
        this.value = BigDecimal.valueOf(value);
    }

}
