import java.time.Duration;

public class Movie {

    private String title;
    private Duration duration;
    private Money fee;
    private DefaultDiscountPolicy discountPolicy;

    public Movie(String title, Duration duration, Money fee, DefaultDiscountPolicy discountPolicy) {
        this.title = title;
        this.duration = duration;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return this.fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(this.discountPolicy.calculateDiscountAmount(screening));
    }

}
