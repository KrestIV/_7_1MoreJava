package org.example;

import java.util.HashSet;

public class PracticeSet {
    private HashSet<String> values;

    PracticeSet(String[] arrayNames){
        values = new HashSet<>();
        for(String element:arrayNames){
            values.add(element);
        }
    }

    public void addNew(String newName){
        values.add(newName);
    }

    public boolean search(String searchedName){
        return values.contains(searchedName);
    }

    public void deleteOld(String value){
        HashSet<String> newNameSet = new HashSet<String>();
        for (String element : values) if(!element.equals(value)) newNameSet.add(element);
        values = newNameSet;
    }

    @Override
    public String toString() {
        return  values.toString();
    }
}
