package Linklist;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {
    int capacity;
    Map<Integer, String> cacheMap = new HashMap<>();
    LinkedList<Integer> pointerList = new LinkedList<>();

    public LRUCache(int capacityIn){
        capacity = capacityIn;
    }

    public String get(int key){
        String value = cacheMap.get(key);
        if(value != null){
            pointerList.remove(key);
            pointerList.addFirst(key);
        }
        return value;
    }

    public void put(int key, String value){
        if(cacheMap.size() >= capacity){
            int keyTobeRemoved = pointerList.removeLast();
            cacheMap.remove(keyTobeRemoved);
        }
        cacheMap.put(key,value);
        pointerList.addFirst(key);
    }
}
