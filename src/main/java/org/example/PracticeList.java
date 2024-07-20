package org.example;

import java.util.Vector;

public class PracticeList {
    private Vector<String> values;

    PracticeList(String[] arrayNames){
        values = new Vector<>();
        for(int i = 0; i < arrayNames.length; i++){
            values.add(arrayNames[i]);
        }
    }

    public void addNewName(String newName){
        values.add(newName);
    }

    public boolean search(String searchedName){
        return values.contains(searchedName);
    }

    public void deleteOldName(int index){
        Vector<String> newValues = new Vector<String>();
        for (int i = 0; i < values.size(); i++) if(i != index) newValues.add(values.get(i));
        values = newValues;
    }

    @Override
    public String toString() {
        return values.toString();
    }
}
