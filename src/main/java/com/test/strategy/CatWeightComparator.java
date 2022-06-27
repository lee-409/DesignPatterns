package com.test.strategy;

public class CatWeightComparator implements Comparator<Cat>{

    @Override
    public int compare(Cat c1, Cat c2) {
        if (c1.weight < c2.weight){
            return -1;
        }else if (c1.weight > c2.weight){
            return 1;
        }
        return 0;
    }
}
