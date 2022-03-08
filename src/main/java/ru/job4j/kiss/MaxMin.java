package ru.job4j.kiss;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class MaxMin {
    public <T> T max(List<T> value, Comparator<T> comparator) {
        return null;
    }

    public <T> T min(List<T> value, Comparator<T> comparator) {
        return null;
    }

    public <T> T maxValue(List<T> value, Comparator<T> comparator) {
        if (value == null) {
            throw new NoSuchElementException();
        }
        int index = 0;
        int counter = 0;
        Iterator<T> itr = new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }
        };
            T iMax = value.get(0);
            while (itr.hasNext()) {
                counter++;
                if (comparator.compare(itr.next(), iMax) > 0) {
                    iMax = itr.next();
                    index = counter;
                }
            }
            return iMax;
        }
}