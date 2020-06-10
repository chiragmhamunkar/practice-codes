package com.section.test;

import java.util.List;

public class CompositionTest {

    static class House{
        static class Room{
            String type;
            private Room(String type){
                this.type = type;
            }
        }

        List<Room> rooms;

        public void addRoom(String type){
            rooms.add(new Room(type));
        }
    }

    public static void main(String[] args) {

        new House.Room("");
    }
}
