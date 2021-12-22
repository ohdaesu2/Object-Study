package study.chapter2.discountPolicy;

import study.chapter2.Money;
import study.chapter2.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
