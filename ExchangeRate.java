import java.util.HashMap;

public class ExchangeRate {
    private HashMap<String, HashMap<String, Double>> rates = new HashMap<>();

    ExchangeRate() {
        HashMap<String, Double> idr = new HashMap<>();
        idr.put("IDR", (double)1);
        idr.put("USD", (double)12000.00);
        idr.put("EURO", (double)15000.00);
        idr.put("POUNDS", (double)17500.00);
        this.rates.put("IDR", idr);

        HashMap<String, Double> usd = new HashMap<>();
        usd.put("USD", (double)1);
        this.rates.put("USD", usd);

        HashMap<String, Double> eur = new HashMap<>();
        eur.put("EURO", (double)1);
        this.rates.put("EURO", eur);

        HashMap<String, Double> gbp = new HashMap<>();
        gbp.put("POUNDS", (double)1);
        this.rates.put("POUNDS", gbp);
    }

    public double getExchangeRate(String from, String to) {
        if (from.equals(to)) {
            return 1;
        }
        return this.rates.get(from).get(to);
    }
}
