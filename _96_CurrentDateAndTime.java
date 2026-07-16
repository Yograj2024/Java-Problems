import java.util.*;

/* 
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

 */

import java.time.*; // simple 



class _96_CurrentDateAndTime {
    public static void main(String[] args){

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println(date);
        System.out.println(time);
    }
}