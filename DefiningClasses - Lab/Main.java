import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<Integer, BankAccount> bankAccount = new HashMap<>();

        String command = in.nextLine();



        while (!command.equals("End")) {
            String output = null;
            String[] tokens = command.split("\\s+");
            if (tokens[0].equals("Create")) {
                BankAccount account = new BankAccount();
                bankAccount.put(account.getId(), account);
                output = "Account ID" + account.getId() + " created";
            } else if (tokens[0].equals("Deposit")) {
                int id = Integer.parseInt(tokens[1]);
                int amount = Integer.parseInt(tokens[2]);
                if (!bankAccount.containsKey(id)) {
                    output = "Account does not exist";
                } else {
                    bankAccount.get(id).deposit(amount);
                    output = "Deposited " + amount + " to ID" + id;
                }
            } else if (tokens[0].equals("SetInterest")) {
                BankAccount.setInterestRate(Double.parseDouble(tokens[1]));
            } else {
                int id = Integer.parseInt(tokens[1]);
                int years = Integer.parseInt(tokens[2]);
                if (!bankAccount.containsKey(id)) {
                    output = "Account does not exist";
                } else {
                    double interest = bankAccount.get(id).getInterestRate(years);
                    output = String.format("%.2f", interest);
                }
            }

            if (output != null) {
                System.out.println(output);
            }

            command = in.nextLine();
        }
    }
}
