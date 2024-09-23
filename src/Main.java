import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static float getPrice(String prompt) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        float price;

        try {
            System.out.print(prompt);
            price = Float.parseFloat(br.readLine());
        } catch (Exception e) {
            return getPrice(prompt);
        }

        return price;
    }

    static float getShippingCost(float price) {
        if (price >= 100) {
            return 0;
        } else {
            return price * 0.02f;
        }
    }

    public static void main(String[] args) {
        float price = getPrice("Enter price: ");
        float shippingCost = getShippingCost(price);

        System.out.printf("Shipping Cost: $%.2f\n", shippingCost );
        System.out.printf("Total Cost: $%.2f\n", (shippingCost + price));
    }
}
