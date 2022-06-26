import java.text.DecimalFormat;

public class Money {
    String currencyCode = "";
    Double amount = Double.valueOf(0);

    String print () {
        DecimalFormat df = new DecimalFormat("0.00");
        Currency currency = getCurrency();
        return currency.getSymbol() + " " + df.format(this.amount) + " " + currency.getDisplayName();
    }

    public Currency getCurrency() {
        return Currency.get(this.currencyCode);
    }
}
