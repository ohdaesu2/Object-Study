package study.chapter2.discountPolicy;

import study.chapter2.Money;
import study.chapter2.Screening;
import study.chapter2.discountCondition.DiscountCondition;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
