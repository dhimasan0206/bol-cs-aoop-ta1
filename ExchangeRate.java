import java.util.HashMap;

public class ExchangeRate {
    private HashMap<String, HashMap<String, Double>> rates = new HashMap<>();

    ExchangeRate() {
        HashMap<String, Double> idr = new HashMap<>();
        idr.put("IDR", (double)1);
        idr.put("USD", (double)12000);
        idr.put("Euro", (double)15000);
        idr.put("Pounds", (double)17500);
        this.rates.put("IDR", idr);

        HashMap<String, Double> usd = new HashMap<>();
        usd.put("USD", (double)1);
        this.rates.put("USD", usd);

        HashMap<String, Double> Euro = new HashMap<>();
        Euro.put("Euro", (double)1);
        this.rates.put("Euro", Euro);

        HashMap<String, Double> Pounds = new HashMap<>();
        Pounds.put("Pounds", (double)1);
        this.rates.put("Pounds", Pounds);
    }

    public double getExchangeRate(String from, String to) {
        if (from.equals(to)) {
            return 1;
        }
        return this.rates.get(from).get(to);
    }
}
