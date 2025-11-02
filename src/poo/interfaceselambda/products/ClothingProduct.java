package poo.interfaceselambda.products;

import java.math.BigDecimal;

public class ClothingProduct implements Product {
    private BigDecimal value = BigDecimal.ZERO;

    @Override
    public BigDecimal taxValue () {
        BigDecimal tax = this.value.multiply(BigDecimal.valueOf(0.025));
        return this.value.add(tax);
    }

    public void setValue (float value) {
        this.value = BigDecimal.valueOf(value);
    }

}
