/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealClasses;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Alec
 */
public class PhillipKDick extends SciFi{
    private Date release;
    private Date timePeriod;
    private String subGenre;
    private String title;
    
    private String getDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        return sdf.format(date);
    } 
    @Override
    public final String getTimePeriod() {
        return getDate(timePeriod); 
    }

    @Override
    public final String getSubGenre() {
        return subGenre;
    }

    @Override
    public final String getTitle() {
        return getDate(release);
    }

    @Override
    public final String getAuthor() {
        return "Phillip K Dick";
    }
    
}
