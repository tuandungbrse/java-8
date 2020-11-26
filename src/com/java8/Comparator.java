package com.java8;

import java.util.function.Function;

/**
 *
 * @param <T>
 */
@FunctionalInterface
public interface Comparator<T> {

    static Comparator<Person> comparing(Function<Person, Comparable> f1) {
        return (p1, p2) -> f1.apply(p1).compareTo(f1.apply(p2));

    }



    int compare(T t1, T t2);





}
