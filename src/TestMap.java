import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Phu", 28);
        hashMap.put("Mai", 23);
        hashMap.put("Tùng", 19);
        hashMap.put("Tiến", 18);
        System.out.println("Display entries in hashMap");
        System.out.println(hashMap +"\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Phú",28);
        linkedHashMap.put("Mai",23);
        linkedHashMap.put("Tùng",19);
        linkedHashMap.put("Tiến",18);
        System.out.println("\nThe age for" + " Tùng is " + linkedHashMap.get("Tùng"));




    }
}


