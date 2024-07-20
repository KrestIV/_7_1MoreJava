package org.example;

import java.util.ArrayDeque;

public class PracticeQueue {
    private ArrayDeque<String> values;

    PracticeQueue(String[] arrayOfStrings){
        values = new ArrayDeque<>();
        int i = 0;
        while(i < arrayOfStrings.length) {
            values.addFirst(arrayOfStrings[i]);
            i++;
        }
    }

    public void addNew(String value){
        values.addLast(value);
    }

    public boolean search(String value){
        return values.contains(value);
    }

    public void deleteFirst(){
        values.removeFirst();
    }

    @Override
    public String toString() {
        return values.toString();
    }
}
