public class MoneyFactory {
    public Money getMoney(String currencyCode, Double amount) {
        switch (currencyCode) {
            case "IDR":
                return new IDR(amount);
            case "USD":
                return new USD(amount);
            case "Euro":
                return new Euro(amount);
            case "Pounds":
                return new Pounds(amount);
            
            default:
                throw new ExceptionInInitializerError("unsupported currency");
        }
    }
}
