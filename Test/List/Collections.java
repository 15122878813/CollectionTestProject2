package List;

import java.util.*;

public class Collections {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        arrayList.add("a");

        arrayList.add("b");

        arrayList.add("c");

//        java.util.Collections.addAll(arrayList,new String[]{"1","2","3"});
        java.util.Collections.addAll(arrayList,"cnm");

        System.out.println(arrayList);

        /////////////////////////////////////////////////////////////////

        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(3);

        hashSet.add(2);

        hashSet.add(1);

        java.util.Collections.addAll(hashSet,new Integer[]{1,5,6});

        java.util.Collections.addAll(hashSet,5200);
        //set集合没有顺序之分,故可以对其进行升序写出
//        System.out.println(hashSet);
        /////////////////////////////////////////////////////////////////
        java.util.Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 1;
            }
        });
    }
}
