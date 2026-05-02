package Library_Managment_System.other;

import java.sql.Date;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class InventoryOfBooks {
private String bookname, bookId; 
// LocalDate
// L    ocalTime
static LocalDate localDate = LocalDate.now();
static LocalTime localTime = LocalTime.now(Clock.systemDefaultZone());
static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
static DateTimeFormatter hourFormatter = DateTimeFormatter.ofPattern("hh::mm:ss a");
public static void main(String[] args) {
   System.out.println(localDate.format(formatter));
//    String temp = hourFormatter;
//    System.out.println(hourFormatter);
//    System.out.println(localTime.format(hourformatter));
//    System.out.println(localDate);
}

}
