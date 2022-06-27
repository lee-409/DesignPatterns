package com.test.strategy;

public class CatHeightComparator implements Comparator<Cat>{

    @Override
    public int compare(Cat c1, Cat c2) {
        if (c1.height > c2.height){
            return -1;
        }else if (c1.height < c2.height){
            return 1;
        }
        return 0;
    }
}
