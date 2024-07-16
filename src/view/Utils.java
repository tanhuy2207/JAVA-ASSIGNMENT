
package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Utils {
    public static String getInputString(String prompt){
        System.out.print(prompt + " : ");
        return new Scanner(System.in).nextLine();
    }

    public static LocalDate convertToLocalDate(String dateString){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dateString, formatter);
    }

    public static String convertToStringDate(LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatter.format(date);
    }

    public static void printList(String header, List<?> itemList){
        System.out.println(header);
        System.out.println("------------------------------");
        for(Object item : itemList) {
            System.out.println(item); 
        }
        System.out.println("------------------------------");
        System.out.println("Total :" + itemList.size());
    }
}

