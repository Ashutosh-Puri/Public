//import java.text.ParseException;  
//import java.util.Locale;  
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class date 
{  
    public static void main(String[] args) 
    {  
        Date date = new Date();  
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");  
        String dt = ft.format(date);  
        System.out.println("Current date is: "+dt);  

    }
}

// o/p : Current date is: 20/02/2022
