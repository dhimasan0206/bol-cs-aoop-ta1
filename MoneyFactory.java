public class MoneyFactory {
    public Money getMoney(String currencyCode, Float amount) {
        switch (currencyCode) {
            case "IDR":
                return new IDR(amount);
            case "USD":
                return new USD(amount);
            case "EUR":
                return new EUR(amount);
            case "GBP":
                return new GBP(amount);
            
            default:
                throw new ExceptionInInitializerError("unsupported currency");
        }
    }
}
