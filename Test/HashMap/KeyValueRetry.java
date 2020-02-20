package HashMap;

import java.util.HashMap;

public class KeyValueRetry {

    public static void main(String[] args) {

        HashMap<String, Object> hashMap = new HashMap<>();

        hashMap.put("1","c");

        Object b = hashMap.put("1", "b");

        System.out.println(b);

    }
}
