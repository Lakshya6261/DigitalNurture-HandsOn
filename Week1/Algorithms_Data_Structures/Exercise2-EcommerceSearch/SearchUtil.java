public class SearchUtil {
    public static int linear(Product[] data, String key) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].name.equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }

    public static int binary(Product[] data, String key) {
        int left = 0, right = data.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = data[mid].name.compareToIgnoreCase(key);
            if (cmp == 0) return mid;
            if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
