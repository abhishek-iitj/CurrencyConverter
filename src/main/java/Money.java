abstract class Money {
    protected int amount;
    protected String currency;
    abstract Money times(int multiplier);

    static Money dollar (int amount){
        return new Dollar(amount);
    }

    static Money franc (int amount){
        return new Franc(amount, "CHF");
    }

    String currency(){
        return currency;
    }
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && this.getClass().equals(money.getClass());
    }
}
