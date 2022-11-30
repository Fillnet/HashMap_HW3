import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("str1", 2);
        map.put("str2", 1);
        map.put("str1", 2);
        map.put("str1", 5);
        System.out.println(map);
//        map.addToMap("str1", 2);
    }
        
}