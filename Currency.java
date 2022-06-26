import java.util.HashMap;

public enum Currency {
    IDR("IDR", "IDR", "Rp"),
    USD("USD", "USD", "$"),
    EURO("EURO", "Euro", "€"),
    POUNDS("POUNDS", "Pounds", "£");

    private final String value;
    private final String displayName;
    private final String symbol;

    private static final HashMap<String, Currency> mapping = new HashMap<String, Currency>();

    static {
        for (Currency curr : Currency.values()) {
            mapping.put(curr.getValue(), curr);
        }
    }

    private Currency(String value, String displayName, String symbol) {
        this.value = value;
        this.displayName = displayName;
        this.symbol = symbol;
    }

    public String getValue() {
        return value;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Currency get(String value) {
        return mapping.get(value);
    }
}