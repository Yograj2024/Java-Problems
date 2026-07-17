# Java `java.time` Package — Classes aur Unke Use Cases

Java 8 me aaya `java.time` package date aur time handle karne ka **modern aur recommended** tarika hai. Neeche har class ka use case explain kiya gaya hai.

---

## 1. `LocalDate`

```java
import java.time.LocalDate;
```

**Kya hai:** Sirf **date** (year, month, day) store karta hai — koi time ya timezone nahi.

**Kab use karo:**
- Jab tumhe sirf date chahiye, time ki zarurat nahi
- Birthday, joining date, deadline jaisi cheezein store karne ke liye
- Calendar-based calculations (jaise "aaj se 10 din baad kaunsi date hogi")

**Example:**
```java
LocalDate today = LocalDate.now();
LocalDate birthday = LocalDate.of(2000, 5, 20);
System.out.println(today); // 2026-07-15
```

---

## 2. `LocalTime`

```java
import java.time.LocalTime;
```

**Kya hai:** Sirf **time** (hour, minute, second) store karta hai — koi date ya timezone nahi.

**Kab use karo:**
- Jab tumhe sirf clock time chahiye (date matter nahi karti)
- Office opening/closing time, alarm time, schedule time jaisi cheezein store karne ke liye

**Example:**
```java
LocalTime now = LocalTime.now();
LocalTime meetingTime = LocalTime.of(14, 30); // 2:30 PM
System.out.println(now); // 14:23:45.123
```

---

## 3. `LocalDateTime`

```java
import java.time.LocalDateTime;
```

**Kya hai:** **Date aur Time dono** ek saath store karta hai — lekin timezone nahi.

**Kab use karo:**
- Jab tumhe exact date aur time dono chahiye, jaise "record kab create hua"
- Log entries, appointment booking, event scheduling ke liye
- Sabse **commonly used class** hai jab timezone ka concern nahi hota (jaise single-country application)

**Example:**
```java
LocalDateTime dateTime = LocalDateTime.now();
LocalDateTime appointment = LocalDateTime.of(2026, 7, 20, 10, 0);
System.out.println(dateTime); // 2026-07-15T14:23:45.123
```

---

## 4. `ZonedDateTime`

```java
import java.time.ZonedDateTime;
```

**Kya hai:** **Date, Time aur Timezone** teeno ek saath store karta hai.

**Kab use karo:**
- Jab application **multiple countries/timezones** ke liye kaam kare
- International meetings, flight booking, global events schedule karne ke liye
- Jab tumhe pata hona chahiye ki "yeh time kis timezone ka hai" (jaise IST, UTC, EST)

**Example:**
```java
ZonedDateTime zonedDateTime = ZonedDateTime.now();
System.out.println(zonedDateTime); // 2026-07-15T14:23:45.123+05:30[Asia/Calcutta]
```

---

## 5. `Instant`

```java
import java.time.Instant;
```

**Kya hai:** Ek **exact machine timestamp** hai — **epoch time** (1 January 1970, 00:00:00 UTC) se leke ab tak ke seconds/nanoseconds count karta hai. Human-readable date/month nahi dikhata, sirf technical timestamp hota hai.

**Kab use karo:**
- Jab tumhe **precise timestamp** chahiye logging, database records, ya API responses ke liye
- Do events ke beech ka time difference calculate karne ke liye
- Backend systems, servers, aur databases me widely use hota hai (kyunki timezone-independent hota hai)

**Example:**
```java
Instant instant = Instant.now();
System.out.println(instant); // 2026-07-15T08:53:45.123Z
```

---

## 6. `DateTimeFormatter`

```java
import java.time.format.DateTimeFormatter;
```

**Kya hai:** Yeh koi date/time class nahi hai — yeh ek **formatter tool** hai jo date/time ko **custom readable format** me convert karta hai (jaise `dd-MM-yyyy`).

**Kab use karo:**
- Jab tumhe date/time ko specific format me **display** karna ho (UI pe, report me, ya file me)
- User-friendly format banane ke liye (jaise `15-07-2026` instead of `2026-07-15T14:23:45.123`)

**Example:**
```java
LocalDateTime now = LocalDateTime.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
String formatted = now.format(formatter);
System.out.println(formatted); // 15-07-2026 14:23:45
```

---

## Quick Comparison Table

| Class | Date | Time | Timezone | Use Case |
|---|:---:|:---:|:---:|---|
| `LocalDate`         | ✅ | ❌ | ❌         | Birthday, deadline, joining date |
| `LocalTime`         | ❌ | ✅ | ❌         | Alarm, opening/closing time |
| `LocalDateTime`     | ✅ | ✅ | ❌         | Log entry, appointment, single-timezone app |
| `ZonedDateTime`     | ✅ | ✅ | ✅         | International meeting, flight booking |
| `Instant`           | ✅ | ✅ | UTC(fixed) |Server logs, database timestamp, API |
| `DateTimeFormatter` | -  | -  | -           |Date/time ko custom format me display karna |

---

## Simple Rule of Thumb

- **Sirf date chahiye?** → `LocalDate`
- **Sirf time chahiye?** → `LocalTime`
- **Date + Time chahiye (ek hi timezone me)?** → `LocalDateTime`
- **Date + Time + Timezone chahiye (global app)?** → `ZonedDateTime`
- **Backend/database ke liye technical timestamp chahiye?** → `Instant`
- **Date/time ko sundar format me dikhana hai?** → `DateTimeFormatter`