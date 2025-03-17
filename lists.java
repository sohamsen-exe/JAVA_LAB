import java.util.*;

class lists {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String city;
        int index;
        String city_name;

        while (true) {
            System.out.println("Enter City Name (Type 'Done' to end loop)");
            city = s.next();
            if (city.equalsIgnoreCase("Done")) {
                break;
            }
        }
        list.add(city);

        System.out.println("CITY DETAILS");
        System.out.println(list);
        System.out.println();

        System.out.println("Enter Index to find");
        index = s.nextInt();
        String find_city = list.get(index);
        System.out.println("Using Index: " + find_city);
        System.out.println();

        System.out.println("Enter City name to remove");
        city_name = s.next();
        list.remove(city_name);

        System.out.println(list);
        System.out.println();
    }
}
