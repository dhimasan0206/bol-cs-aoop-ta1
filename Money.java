public class Money {
    String currencyCode = "";
    Float amount = Float.valueOf(0);

    String print () {
        return this.currencyCode + " " + this.amount;
    }
}
