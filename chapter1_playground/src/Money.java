public class Money {

    public long amount;

    public Money(long amount) {
        this.amount = amount;
    }

    public Money plus(Money money) {
        return new Money(this.amount + money.amount);
    }

    public Money minus(Money money) {
        if(this.isLessThan(money)) {
            throw new IllegalArgumentException();
        }
        return new Money(this.amount - money.amount);
    }

    public Money times(int multiple) {
        return new Money(this.amount * multiple);
    }

    private boolean isLessThan(Money money) {
        return this.amount < money.amount;
    }

}
