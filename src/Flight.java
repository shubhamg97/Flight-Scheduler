import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Flight {

    public static ArrayList<String> flightComboPopulation() {
        ArrayList<String> flightsCombo = new ArrayList<String>();

        try {
            DatabaseConnection dC = new DatabaseConnection();
            ResultSet results = dC.flightNames.executeQuery();
            while (results.next()) {
                String input = results.getString("Flight");
                flightsCombo.add(input);
            }
        }
        catch (SQLException sqlexception) {
            sqlexception.printStackTrace();
        }
        return flightsCombo;
    }

    public static String addFlight(String Flight, int numSeats) {
        String s = "";
        try {
            DatabaseConnection dC = new DatabaseConnection();
            dC.addFlight.setString(1, Flight);
            dC.addFlight.setInt(2, numSeats);
            dC.addFlight.executeUpdate();
            s = ("Flight " + Flight + " was added to the list of flights successfully.\n\n");
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return s;
    }
    
    public static void dropFlight (String Flight) {
        try {
            DatabaseConnection dC = new DatabaseConnection();
            dC.dropFlight.setString(1, Flight);
            dC.dropFlight.executeUpdate();
            Booking.rebookFlight(Flight);
        }
        catch (SQLException sqlexception) {
            sqlexception.printStackTrace();
        }
    }
}
