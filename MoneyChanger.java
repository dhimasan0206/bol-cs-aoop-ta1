import java.util.ArrayList;
import java.util.Scanner;

/**
 * MoneyChanger
 */
public class MoneyChanger {

    public static void main(String[] args) {
        ArrayList<String> targetCurrency = new ArrayList<>();
        targetCurrency.add("USD");
        targetCurrency.add("Euro");
        targetCurrency.add("Pounds");

        try (Scanner input = new Scanner(System.in)){
            
            System.out.print("Masukkan Jenis Mata Uang Asing [USD | Euro | Pounds] : ");
            String to = input.nextLine();

            if (!targetCurrency.contains(to)) {
                throw new IllegalArgumentException("Mata Uang Yang Anda Masukkan Salah, Silahkan Coba Kembali!");
            }

            System.out.print("Masukkan Nominal Uang yang akan ditukarkan : Rp");
            double amount = input.nextFloat();

            Money idr = new IDR(amount);
            Money toMoney = exchange(to, idr);
            System.out.println("Dengan " + idr.print() + " anda memperoleh " + toMoney.print());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Money exchange(String to, Money from) {
        ExchangeRate rates = new ExchangeRate();
        double rate = rates.getExchangeRate(from.currencyCode, to);
        
        MoneyFactory moneyFactory = new MoneyFactory();
        return moneyFactory.getMoney(to, from.amount / rate);
    }
}