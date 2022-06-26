public class IDR extends Money{
    IDR(double amount) {
        this.currencyCode = "IDR";
        this.currencySymbol = "Rp";
        this.amount = amount;
    }

    String print () {
        return this.currencySymbol + " " + this.amount;
    }
}
