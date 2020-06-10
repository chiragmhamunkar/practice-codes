package com.section.unknown;

import com.section.test.PrivateVariablesClass2;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class EnumTest {
    static class Helper {
        private int data = 5;
        public void bump(int inc) {
            inc++;
            data = data + inc;
        }
    }

    static class B{
        void tp(){
            Helper h = new Helper();
            h.data = 1;
        }
    }

    public static void main(String []args) {
        Helper h = new Helper();
        int data = 2;
        h.bump(data);
        System.out.println(h.data + " " + data);

        PrivateVariableTest p = new PrivateVariableTest();
        System.out.println(p.pro);
        System.out.println(p.pub);

        PrivateVariablesClass2 pp = new PrivateVariablesClass2();
        System.out.println(Stream.of("green", "yellow", "blue")
                .max((s1,s2) -> s1.compareTo(s2))
                .filter(s -> s.endsWith("n"))
                .orElse("yellow"));
        Supplier<String> i = () -> "Car";
        Consumer<String> c = x -> System.out.print(x.toLowerCase());
        Consumer<String> d = x -> System.out.print(x.toUpperCase());
        c.andThen(d).accept(i.get());
        System.out.println();

    }
}
