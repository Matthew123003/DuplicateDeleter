package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(Integer num : array){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> results = new ArrayList<>();

        for(Integer num : array){
            if(freqMap.get(num) < maxNumberOfDuplications){
                results.add(num);
            }
        }
        return results.toArray(new Integer[0]);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(Integer num : array){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> results = new ArrayList<>();

        for(Integer num : array){
            if(freqMap.get(num) != exactNumberOfDuplications){
                results.add(num);
            }
        }
        return results.toArray(new Integer[0]);
    }
}
