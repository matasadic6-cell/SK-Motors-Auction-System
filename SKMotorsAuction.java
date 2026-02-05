import java.util.Scanner;

public class SKMotorsAuction {

    public static void main(String[] args) {

        Scanner input;
        input = new Scanner(System.in);

        // ===== VEHICLE DETAILS =====
        System.out.print("Enter vehicle registration number: ");
        String regNumber = input.nextLine();

        System.out.print("Enter vehicle cost: ");
        double vehicleCost = input.nextDouble();

        System.out.print("Enter total deposits made: ");
        double deposit = input.nextDouble();

        System.out.print("Enter total expenses incurred: ");
        double expenses = input.nextDouble();

        System.out.print("Enter balance left on vehicle: ");
        double balance = input.nextDouble();

        input.nextLine(); // clear buffer

        // ===== BIDDERS =====
        String highestBidder = "";
        double highestBid = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("\nEnter bidder " + i + " name: ");
            String name = input.nextLine();

            System.out.print("Enter bid amount: ");
            double bid = input.nextDouble();
            input.nextLine();

            if (bid > highestBid) {
                highestBid = bid;
                highestBidder = name;
            }
        }

        // ===== CLEAR BALANCE =====
        deposit = deposit + balance;

        // ===== CALCULATIONS =====
        double totalMoneyIn = deposit + highestBid;
        double totalCost = vehicleCost + expenses;
        double profitLoss = totalMoneyIn - totalCost;

        // ===== OUTPUT =====
        System.out.println("\n========== AUCTION RESULT ==========");
        System.out.println("Vehicle Reg No: " + regNumber);
        System.out.println("Winning Bidder: " + highestBidder);
        System.out.println("Winning Bid: " + highestBid);

        System.out.println("\n========== FINANCIAL SUMMARY ==========");
        System.out.println("Total Money In: " + totalMoneyIn);
        System.out.println("Total Cost: " + totalCost);

        if (profitLoss > 0) {
            System.out.println("PROFIT: " + profitLoss);
        } else if (profitLoss < 0) {
            System.out.println("LOSS: " + Math.abs(profitLoss));
        } else {
            System.out.println("NO PROFIT, NO LOSS");
        }

        input.close();
    }
}