package study.chapter2.discountCondition;

import study.chapter2.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
