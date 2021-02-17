package JavaCollection.task3509;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* 
Collections & Generics
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static <T> ArrayList <T> newArrayList(T... elements) {
        ArrayList<T> arrayList = new ArrayList<T>();
        for(T o : elements){
            arrayList.add(o);
        }
        //напишите тут ваш код
        return arrayList;
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        HashSet<T> set = new HashSet<>();
        for(T o : elements){
            set.add(o);
        }
        //напишите тут ваш код
        return set;
    }

    public static<K, V> HashMap<K,V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        if (keys.size()!=values.size()){
            throw new IllegalArgumentException();
        }
        HashMap<K,V> hashMap = new HashMap<>();
        for(int i = 0; i < keys.size(); i++){
            hashMap.put(keys.get(i), values.get(i));
        }
        return hashMap;
    }
}
