import java.util.HashMap;
import java.util.Map;

public class Main {
        private static final Map<String, Integer> map = new HashMap<>();
    public static void main(String[] args) {


        addToMap("str1",2);
        addToMap("str2",1);
//        addToMap("str1",2);
        addToMap("str1",5);
        System.out.println(map);
    }
        public static void addToMap(String key, int value) {
            if (!map.containsKey(key)) {
                map.put(key, value);
            } else {
                int valueFromMap = map.get(key);
                if (valueFromMap == value) {
                    throw new IllegalArgumentException();
                } else {
                    map.put(key,value);
                }
            }

        }

}