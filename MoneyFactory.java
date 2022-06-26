public class MoneyFactory {
    public Money getMoney(String currencyCode, Double amount) {
        switch (currencyCode) {
            case "IDR":
                return new IDR(amount);
            case "USD":
                return new USD(amount);
            case "EURO":
                return new EUR(amount);
            case "POUNDS":
                return new GBP(amount);
            
            default:
                throw new ExceptionInInitializerError("unsupported currency");
        }
    }
}
