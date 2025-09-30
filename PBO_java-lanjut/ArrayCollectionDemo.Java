import java.util.ArrayList;
import java.util.HashMap;

public class ArrayCollectionDemo {
    public static void main(String[] args) {
        // Array
        String[] buah = {"Apel", "Mangga", "Jeruk"};
        for (String b : buah) {
            System.out.println(b);
        }

        // ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        for (String s : list) {
            System.out.println(s);
        }

        // HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Satu", 1);
        map.put("Dua", 2);
        System.out.println("Nilai 'Dua': " + map.get("Dua"));
    }
}
