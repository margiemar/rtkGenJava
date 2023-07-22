package com.march.rtk.util;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        BigDecimal modelVal = new BigDecimal("24.45555555");
        BigDecimal displayVal = modelVal.setScale(2, RoundingMode.HALF_EVEN);

        TestDec testDec = new TestDec("30.5");
        System.out.println(testDec.getPrice().multiply(new BigDecimal(2)));

    }
}

class TestDec{
    private BigDecimal price;

    public TestDec(String price) {
        this.price = new BigDecimal(price);

    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
