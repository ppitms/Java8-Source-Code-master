package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class MyArrayList<T> {

    private ArrayList<T> list = new ArrayList<>();

    public synchronized void add(T t) {
        Map<Object, Object> map = new TreeMap<>();
        
        list.add(t);
    }

    public synchronized void test(){}


}
