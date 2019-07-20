public class Sum implements MoneyExpression{
    Money augend;
    Money addend;
    Sum(Money augend, Money addend){
        this.augend = augend;
        this.addend = addend;
    }
}
