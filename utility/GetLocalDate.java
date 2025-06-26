package utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetLocalDate {
    
    //private constructor
    private GetLocalDate(){

    }

    public static String getDate(){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateFormartted = localDateTime.format(formatter);
        return dateFormartted;
    }
}
