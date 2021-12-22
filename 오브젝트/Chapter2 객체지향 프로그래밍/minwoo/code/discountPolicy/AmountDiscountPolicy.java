package study.chapter2.discountPolicy;

import study.chapter2.Money;
import study.chapter2.Screening;
import study.chapter2.discountCondition.DiscountCondition;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
