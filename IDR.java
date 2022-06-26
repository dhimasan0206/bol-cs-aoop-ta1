public class IDR extends Money{
    IDR(double amount) {
        this.currencyCode = "IDR";
        this.currencySymbol = "Rp";
        this.amount = amount;
    }

    @Override
    String print () {
        return this.currencySymbol + " " + this.amount;
    }
}
