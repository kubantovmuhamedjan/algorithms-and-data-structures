package DS_and_Algorithm;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {

        Hashtable<String, String> table = new Hashtable<>(10);

        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        for (String key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "   " + key + "  " + table.get(key));
        }


//        for (String key : table.keySet()) {
//            int index = Math.abs(key.hashCode()) % 10;
//            System.out.println("key=" + key + " hash=" + key.hashCode() + " index=" + index + " value=" + table.get(key));
//        }

    }
}
