import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] list = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "Book", "Education"),
            new Product(4, "Shoes", "Fashion")
        };

        String searchName = "Phone";

        int result1 = SearchUtil.linear(list, searchName);
        System.out.println("Linear found at: " + result1);

        Arrays.sort(list, (a, b) -> a.name.compareToIgnoreCase(b.name));

        int result2 = SearchUtil.binary(list, searchName);
        System.out.println("Binary found at: " + result2);
    }
}
