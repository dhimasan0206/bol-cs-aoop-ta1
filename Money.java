public class Money {
    String currencyCode = "";
    String currencySymbol = "";
    Double amount = Double.valueOf(0);

    String print () {
        return this.currencySymbol + " " + this.amount + " " + this.currencyCode;
    }
}
