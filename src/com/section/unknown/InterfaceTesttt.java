package com.section.unknown;

import java.sql.Connection;
import java.sql.ResultSet;
import java.time.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class InterfaceTesttt {

    public static void main(String[] args) {
        ZoneId ny = ZoneId.of("America/New_York");
        ZoneId la = ZoneId.of("America/Los_Angeles");

        LocalDateTime localDT = LocalDateTime.of(2015,Month.MARCH,14,8,13,55);
        ZonedDateTime nyDT  = ZonedDateTime.of(localDT, ny );
        ZonedDateTime laDT  = ZonedDateTime.of(localDT, la );

        System.out.println(nyDT);
        System.out.println(laDT);
        if (nyDT.equals(laDT))
            System.out.println("EQUAL");
        Duration d = Duration.between(nyDT,laDT);
        System.out.println("Duration="+d);
    }
}
