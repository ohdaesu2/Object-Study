package study.chapter2.discountPolicy;

import study.chapter2.Money;
import study.chapter2.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
