package com.section.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        Collections.reverse(integers);
    }
}
