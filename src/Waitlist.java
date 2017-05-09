import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Waitlist {

    public static ArrayList<String> checkWaitlist(Date date) {
        ArrayList<String> waitlistResults = new ArrayList<String>();
        
        try {
            DatabaseConnection dC = new DatabaseConnection();
            dC.getWaitlist.setDate(1, date);
            ResultSet results = dC.getWaitlist.executeQuery();
            while (results.next()) {
                String input = results.getString("Name");
                waitlistResults.add(input);
            }
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return waitlistResults;
    }
    
    public static void bumpFromWaitlist(String FlightID, Date date) {
        try {
            DatabaseConnection dC = new DatabaseConnection();
            dC.pullFirstWaitlist.setMaxRows(1);
            ResultSet bumpedCustomer = dC.pullFirstWaitlist.executeQuery();
            bumpedCustomer.next();
            dC.cancelWaitlist.setString(1, bumpedCustomer.getString("Name"));
            dC.cancelWaitlist.setString(2,bumpedCustomer.getString("Flight"));
            dC.cancelWaitlist.setDate(3, bumpedCustomer.getDate("Date"));
            dC.cancelWaitlist.executeUpdate();
            Booking.bookNewCustomer(bumpedCustomer.getString("Name"), bumpedCustomer.getString("Flight"), bumpedCustomer.getDate("Date"));                
            FlightScheduler.cancelCustomerTextArea.append(bumpedCustomer.getString("Name") + " has been moved off the waitlist for flight " + 
                    bumpedCustomer.getString("Flight") + " on the day of " + bumpedCustomer.getDate("Date") + " and successfully booked. \n");
        }
        catch (SQLException sqlexception) {
            sqlexception.printStackTrace();
        }
    }
}
