package job002day.Enums;

enum Level{
    LOW,
    MEDIUM,
    HIGH
}

enum days{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
enum months{
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

public class Enum { 
    public static void main(String[] args) { 
        Level myVar = Level.MEDIUM; 
        System.out.println(myVar); 
        Level myVar2 = Level.LOW;
        System.out.println(myVar2);
        Level myVar3 = Level.HIGH;
        System.out.println(myVar3);

        
        System.out.println(" ");

        // Enum days loop
        for( days DayAll : days.values()){
            System.out.println(DayAll);
        }//
        System.out.println(" ");
        // Enum months loop
        for(months allMoths: months.values()){
            System.out.println(allMoths);
        }
    } 
}