public class Bank {
    Money reduce(MoneyExpression source, String to) {
        Sum sum = (Sum) source;
        return sum.reduce(to);
    }
}
