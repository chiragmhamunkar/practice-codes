package com.section.unknown;

import java.io.*;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class YearMonthTest {

    static class MyCollection<T> {
        private Set<T> set;
        public Set<T> getCollection() {
            return this.set;
        }
    }

    public void TestCollection(MyCollection<?> collection) {
        Set set = collection.getCollection();
    }
    public static void main(String[] args) throws FileNotFoundException {
        YearMonth ym1 = YearMonth.of(2015, Month.SEPTEMBER);
        YearMonth ym2 = YearMonth.of(2016, Month.FEBRUARY);
        System.out.println(ym1.until(ym2, ChronoUnit.MONTHS));
        System.out.println(ym1.minus(Period.ofMonths(4)).getMonthValue());


        new Integer("123");

    }
}
