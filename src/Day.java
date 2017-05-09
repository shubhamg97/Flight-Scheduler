import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Day {

    public static ArrayList<String> dateComboPopulation() {
        ArrayList<String> datesCombo = new ArrayList<String>();
        
        try {
            DatabaseConnection dC = new DatabaseConnection();
            ResultSet results = dC.flightDates.executeQuery();
            while (results.next()) {
                String input = results.getString("Date");
                datesCombo.add(input);
            }
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return datesCombo;
    }

    public static String addDate(Date day) {
        String s = "";
        try {
            DatabaseConnection dC = new DatabaseConnection();
            dC.addDate.setDate(1, day);
            dC.addDate.executeUpdate();
            s = ("Date " + day + " was added to the list of dates successfully.\n\n");
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return s;
    }
}
