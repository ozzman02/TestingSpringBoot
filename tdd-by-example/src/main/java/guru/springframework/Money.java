package guru.springframework;

public abstract class Money {

    protected int amount;

    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
