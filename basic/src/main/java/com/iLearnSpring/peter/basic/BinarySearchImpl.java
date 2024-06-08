package com.iLearnSpring.peter.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Way to tell spring that this class is a bean
@Component
public class BinarySearchImpl {

    // way to tell spring that this is dependencies
    @Autowired
    private Sort sort;

    public BinarySearchImpl(Sort sort) {
        super();
        this.sort = sort;
    }

    public int search(int numbers[], int numberToSearch) {
        // Implementing Sorting Logic
        int[] sortedNumbers = this.sort.sort(numbers);

        // search array
        return sortedNumbers[0];
    }
}
