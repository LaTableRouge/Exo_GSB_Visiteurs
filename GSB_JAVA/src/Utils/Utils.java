package Utils;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Gaëtan
 */
public class Utils 
{
    
    public static String StringToDate(String format, String value)
    {
        
        DateFormat formatterToDate = new SimpleDateFormat(format,Locale.ENGLISH);
        Date date = null;
        try 
        {
            date = formatterToDate.parse(value);
        } 
        
        catch (ParseException e) 
        {
            e.printStackTrace();
        }
        
        Format formatterToString = new SimpleDateFormat("yyyy-mm-dd");
        return formatterToString.format(date); 
    }
}