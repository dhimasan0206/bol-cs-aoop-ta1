import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * MoneyChanger
 */
public class MoneyChanger {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            printHeader();

            System.out.print("Masukkan Jenis Mata Uang Asing [USD | Euro | Pounds] : ");
            String to = input.next().toUpperCase();

            validateCurrency(to);

            System.out.print("Masukkan Nominal Uang yang akan ditukarkan : Rp");
            double amount = input.nextDouble();

            Money idr = new IDR(amount);
            Money toMoney = exchange(to, idr);
            System.out.println("Dengan " + idr.print() + " anda memperoleh " + toMoney.print());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printHeader() {
        System.out.println("Money Changer -- Foreigner Money");
        System.out.println("================================\n\n");
    }

    public static boolean validateCurrency(String code) throws InvalidCurrencyException {
        final List<String> allCurrency = Stream.of(Currency.values())
                                               .map(Currency::getValue)
                                               .collect(Collectors.toList());

        if (!allCurrency.contains(code)) {
            throw new InvalidCurrencyException("Mata Uang Yang Anda Masukkan Salah, Silahkan Coba Kembali!");
        }
        return true;
    }

    public static Money exchange(String to, Money from) {
        ExchangeRate rates = new ExchangeRate();
        double rate = rates.getExchangeRate(from.currencyCode, to);
        
        MoneyFactory moneyFactory = new MoneyFactory();
        return moneyFactory.getMoney(to, from.amount / rate);
    }
}