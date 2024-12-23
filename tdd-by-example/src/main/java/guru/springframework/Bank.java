package guru.springframework;

public class Bank {

    Money reduce(Expression expression, String toCurrency) {
        return expression.reduce(toCurrency);
    }

}
