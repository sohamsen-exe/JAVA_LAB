import java.util.Map;
import java.util.HashMap;

public class maps {
    public static void main(String[] args) {
        Map <String, Integer> Country = new HashMap<>();
        Country.put("India ", 1);
        Country.put("Pakistan ", 0);
        Country.put("Russia ", 420);
        System.out.println("Countries: " + Country);

        for (Map.Entry <String, Integer> entry : Country.entrySet()) {
            System.out.println("Country: " + entry.getKey() +"- " + entry.getValue());
        }
    }
}
