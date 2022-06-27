package com.test.strategy;

public class DogComparator implements Comparator<Dog>{
    @Override
    public int compare(Dog d1, Dog d2) {
        if (d1.food < d2.food){
            return -1;
        }else if (d1.food > d2.food){
            return 1;
        }
        return 0;
    }
}
