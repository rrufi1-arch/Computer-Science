public class OrderProcessor {
    public static double getBeforeTaxCost(Item[] items) {
        double subtotal = 0;
        for (Item item : items) {
            double price = item.getPrice();
            int quantity = item.getQuantity();
            double itemTotal = price * quantity;
            subtotal += itemTotal;
        }
        return subtotal;
    }

    public static String[] getPremiumItems(Item[] items) {
        String[] expensiveItems = new String[items.length];
        int premiumCount = 0;
        for (Item item : items) {
            String name = item.getName();
            double price = item.getPrice();
            if (price > 50.0) {
                expensiveItems[premiumCount] = name;
                premiumCount += 1;
                System.out.println(name + " is a premium item at $" + price);
            } else {
                System.out.println(name + " is a regular item at $" + price);
            }
        }
        return expensiveItems;
    }

    public static int getPremiumCount(String[] expensiveItemsCleaned) {
        return expensiveItemsCleaned.length;
    }

    public static String[] cleanPremiumItemsArray(String[] expensiveItems) {
        int items = 0;
        for (int i = 0; i < expensiveItems.length; i++) {
            if (expensiveItems[i] != null) {
                items += 1;
            }
        }
        String[] expensiveItemsFinal = new String[items];
        int expensiveItemsFinalIndex = 0;
        for (int i = 0; i < expensiveItems.length; i++) {
            if (expensiveItems[i] != null) {
                expensiveItemsFinal[expensiveItemsFinalIndex] = expensiveItems[i];
                expensiveItemsFinalIndex += 1;
            }
        }
        return expensiveItemsFinal;
    }

    private static double[] getTaxAndTotal(double subtotal, double taxRate) {
        double tax;
        double total;
        if (subtotal > 0) {
            tax = subtotal * taxRate;
            total = subtotal + tax;
        } else {
            tax = 0;
            total = 0;
        }
        double[] data = new double[2];
        data[0] = tax;
        data[1] = total;
        return data;
    }

    public static void printResults(int subtotal, double[] taxAndTotal, int finalPremiumCount, int premiumCount) {
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + taxAndTotal[0]);
        System.out.println("Total: $" + taxAndTotal[1]);
        System.out.println("Number of premium items: " + premiumCount);
    }
}