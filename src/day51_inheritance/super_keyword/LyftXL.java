package day51_inheritance.super_keyword;

import day51_inheritance.super_keyword.Lyft;

public class LyftXL extends Lyft {

    @Override
    public double calculateRate(double miles) {
        // calculateRate of Lyft + 10%
        return super.calculateRate(miles) * 1.1;
    }
}
