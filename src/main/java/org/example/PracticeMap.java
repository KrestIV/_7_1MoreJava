package org.example;

import java.util.HashMap;

public class PracticeMap {
    private HashMap<Integer,String> values;

    PracticeMap(String[] arrayOfStrings){
        values = new HashMap<>();
        if(arrayOfStrings.length > 0){
            int i = 0;
            do{
                values.put(i, arrayOfStrings[i]);
                i++;
            }while(i < arrayOfStrings.length);
        }
    }

    public void addNew(String value){
        values.put(values.size(),value);
    }

    public boolean search(int key){
        return values.containsKey(key);
    }

    public void deleteOld(int key){
        if(this.search(key)) values.replace(key, null);
    }

    @Override
    public String toString() {
        return values.toString();
    }
}
