package org.example;

import java.util.Vector;

public class PracticeSet {
    private Vector<String> nameSet;

    PracticeSet(String[] arrayNames){
        nameSet = new Vector<>();
        for(int i = 0; i < arrayNames.length; i++){
            nameSet.add(arrayNames[i]);
        }
    }

    public void addNewName(String newName){
        nameSet.add(newName);
    }

    public boolean search(String searchedName){
        return nameSet.contains(searchedName);
    }

    public void deleteOldName(int index){
        Vector<String> newNameSet = new Vector<String>();
        for (int i = 0; i < nameSet.size(); i++) if(i != index) newNameSet.add(nameSet.get(i));
        nameSet = newNameSet;
    }

    @Override
    public String toString() {
        String result = "PracticeSet{nameSet=";
        for(int i = 0; i < nameSet.size(); i++) result = result + nameSet.get(i) + "\n";
        result += '}';
        return  result;
    }
}
