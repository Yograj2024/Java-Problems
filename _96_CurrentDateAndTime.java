import java.util.*;

/* 
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

 */

import java.time.*; // simple - ek hi import se java.time package ki saari classes mil jaati hain.


class _96_CurrentDateAndTime {
    public static void main(String[] args){

        // LocalDate.now() -> system ki current date return karta hai (yyyy-MM-dd format me)
        // Isme time zone/time include nahi hota, sirf date hota hai
        LocalDate date = LocalDate.now();

        // LocalTime.now() -> system ka current time return karta hai (HH:mm:ss.nnn format me)
        // Isme sirf time hota hai, date include nahi hoti
        LocalTime time = LocalTime.now();

        // Current date print karna
        System.out.println(date);

        // Current time print karna
        System.out.println(time);
    }
}