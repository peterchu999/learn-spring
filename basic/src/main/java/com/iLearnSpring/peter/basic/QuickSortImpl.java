package com.iLearnSpring.peter.basic;

import org.springframework.stereotype.Component;

// Way to tell spring that this class is a bean
@Component
public class QuickSortImpl implements Sort{
    @Override
    public int[] sort(int[] num) {
        return num;
    }
}
