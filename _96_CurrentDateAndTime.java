import java.util.*;
import java.time.*; // ek hi import se java.time package ki saari classes mil jaati hain (LocalDate, LocalTime, ZonedDateTime, etc.)
import java.time.format.DateTimeFormatter;

/*
   Is program me hum sikhenge:
   1. Current Date lena aur uske parts (year, month) nikalna
   2. Current Time lena aur uske parts (hour, min, sec) nikalna
   3. Date aur Time ko custom pattern me format karna
   4. System ka time zone aur kisi specific zone ka time lena
*/

class _96_CurrentDateAndTime {
    public static void main(String[] args){

        // ================= 1. DATE ================= //

        // LocalDate.now() -> system ki current date return karta hai (yyyy-MM-dd format me)
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);

        // Date ke individual parts nikalna
        System.out.println("Year: " + date.getYear());
        System.out.println("Month (name): " + date.getMonth());       // jaise JULY
        System.out.println("Month (number): " + date.getMonthValue()); // jaise 7



        // ================= 2. TIME ================= //

        // LocalTime.now() -> system ka current time return karta hai (HH:mm:ss.nnn format me)
        LocalTime time = LocalTime.now();
        System.out.println("\nCurrent Time: " + time);

        // Time ke individual parts nikalna
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());



        // ================= 3. FORMATTING ================= //

        System.out.println("\n--- Formatted Time ---");

        // "hh" -> 12-hour format, "a" -> AM/PM
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(time.format(timeFormatter));

        System.out.println("\n--- Formatted Date ---");

        // dd-MM-yyyy format
        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(date.format(dateFormatter1));

        // dd MMM yyyy format (jaise 15 Jul 2026)
        DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(date.format(dateFormatter2));

        // EEEE, dd MMMM yyyy format (jaise Wednesday, 15 July 2026)
        DateTimeFormatter dateFormatter3 = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
        System.out.println(date.format(dateFormatter3));



        // ================= 4. TIME ZONE ================= //

        System.out.println("\n--- Time Zone ---");

        // System ka default time zone
        ZoneId defaultZone = ZoneId.systemDefault();
        System.out.println("Default Zone: " + defaultZone);

        // Current date-time uss zone ke hisaab se
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned DateTime: " + zonedDateTime);

        // Kisi specific zone ka time chahiye ho, jaise Tokyo ka
        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")); // india ki time zone id :- "Asia/Kolkata"
        System.out.println("India Time: " + tokyoTime);

        
        
        // ================= 5. TIME ZONE ================= //

        System.out.println("\n--- ZoneIDs ---");

        Set<String> allZones = ZoneId.getAvailableZoneIds();
        for (String zone : allZones) {
            if (zone.contains("Asia")) {   // sirf Asia wale zones filter karne ke liye
                System.out.println(zone);
            }
        }
    }
}