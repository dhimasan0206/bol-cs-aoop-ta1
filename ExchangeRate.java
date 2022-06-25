import java.util.HashMap;

public class ExchangeRate {
    private HashMap<String, HashMap<String, Float>> rates = new HashMap<>();

    ExchangeRate() {
        HashMap<String, Float> idr = new HashMap<>();
        idr.put("IDR", (float)1);
        idr.put("USD", (float)14829.50);
        idr.put("EUR", (float)15661.73);
        idr.put("GBP", (float)18187.64);
        this.rates.put("IDR", idr);

        HashMap<String, Float> usd = new HashMap<>();
        usd.put("USD", (float)1);
        this.rates.put("USD", usd);

        HashMap<String, Float> eur = new HashMap<>();
        eur.put("EUR", (float)1);
        this.rates.put("EUR", eur);

        HashMap<String, Float> gbp = new HashMap<>();
        gbp.put("GBP", (float)1);
        this.rates.put("GBP", gbp);
    }

    public float getExchangeRate(String from, String to) {
        if (from.equals(to)) {
            return 1;
        }
        return this.rates.get(from).get(to);
    }
}
