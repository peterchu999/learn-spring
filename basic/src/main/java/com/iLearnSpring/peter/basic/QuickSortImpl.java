package com.iLearnSpring.peter.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Way to tell spring that this class is a bean
@Component
// Choose This class over other class with the same usage
@Primary
public class QuickSortImpl implements Sort{
    @Override
    public int[] sort(int[] num) {
        return num;
    }
}
