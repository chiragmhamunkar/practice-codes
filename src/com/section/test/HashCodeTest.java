package com.section.test;

import java.util.Objects;

public class HashCodeTest {
    static  class Person{
        String name;
        Person(String name){this.name = name;}

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            Person person = (Person) object;
            return name.equals(person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    public static void main(String[] args) {
        Person p = new Person("chirag");
        Person p2 = new Person("chirag");
        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p.hashCode() == p2.hashCode());

        System.out.println(Objects.hash("abb"));
        System.out.println(Objects.hash("bab"));
    }
}
