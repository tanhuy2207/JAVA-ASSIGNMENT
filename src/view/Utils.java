

    
    package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Utils {
    public static String getString(String string){
        System.out.print(string+" : ");
        return new Scanner(System.in).nextLine();
    }
//------------------------------------------------
    public static LocalDate toLocalDate(String dob){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dob, formatter);
    }
//------------------------------------------------
    public static String toStringDate(LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatter.format(date);
    
}
    

 public static void print(String title, List list){
        System.out.println(title);
        System.out.println("------------------------------");
        for(Object o:list) System.out.println(o); 
        System.out.println("------------------------------");
        System.out.println("Total :"+list.size());
    }
}
