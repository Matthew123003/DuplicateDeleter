package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        Map<String, Integer> freqMap = new HashMap<>();
        for(String str : array){
            freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
        }

        List<String> results = new ArrayList<>();

        for(String str : array){
            if(freqMap.get(str) < maxNumberOfDuplications){
                results.add(str);
            }
        }
        return results.toArray(new String[0]);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Map<String, Integer> freqMap = new HashMap<>();
        for(String str : array){
            freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
        }

        List<String> results = new ArrayList<>();

        for(String str : array){
            if(freqMap.get(str) != exactNumberOfDuplications){
                results.add(str);
            }
        }
        return results.toArray(new String[0]);
    }
}
