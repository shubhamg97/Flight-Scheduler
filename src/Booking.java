import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

public class Booking {

    public static String bookNewCustomer(String Name, String Flight, Date date) {
        String s = "";
        try {
            DatabaseConnection dC = new DatabaseConnection();
            dC.numSeats.setString(1, Flight);
            dC.getFlightSeats.setString(1, Flight);
            dC.getFlightSeats.setDate(2, date);
            ResultSet totalSeats = dC.numSeats.executeQuery();
            ResultSet takenSeats = dC.getFlightSeats.executeQuery();
            totalSeats.next();
            takenSeats.next();
            java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
            if (totalSeats.getInt("Seats") > takenSeats.getInt(1)) { //Book on the flight
                dC.insertNewBooking.setDate(1, date);
                dC.insertNewBooking.setString(2, Flight);
                dC.insertNewBooking.setString(3, Name);
                dC.insertNewBooking.setTimestamp(4, currentTimestamp);
                dC.insertNewBooking.executeUpdate();
                s = (Name + " has successfully been booked on the flight "
                        + Flight + " on the day " + date);
            }
            else {  //Put on waitlist
                dC.insertNewWaitlist.setDate(1, date);
                dC.insertNewWaitlist.setString(2, Flight);
                dC.insertNewWaitlist.setString(3, Name);
                dC.insertNewWaitlist.setTimestamp(4, currentTimestamp);
                dC.insertNewWaitlist.executeUpdate();
                s = (Name + " was added to the waitlist for flight "
                        + Flight + " on the day " + date);
            }
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return s;
    }

    public static ArrayList<String> checkBooked(String Flight, Date date) {

        ArrayList<String> bookedResults = new ArrayList<String>();
        try {

            DatabaseConnection dC = new DatabaseConnection();
            dC.paxBooked.setString(2, Flight);
            dC.paxBooked.setDate(1, date);

            ResultSet results = dC.paxBooked.executeQuery();
            while (results.next()) {
                String input = results.getString("Name");
                bookedResults.add(input);
            }
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return bookedResults;
    }
    
    public static void rebookFlight(String Flight) {
        try {
            DatabaseConnection dC = new DatabaseConnection();
            ResultSet days = dC.flightDates.executeQuery();
            while (days.next()) {
                dC.paxBooked.setString(2, Flight);
                dC.paxBooked.setDate(1, days.getDate("Date"));
                ResultSet booked = dC.paxBooked.executeQuery();
                while (booked.next()) {
                    Customer.rebookCustomer(booked.getString("Name"), days.getDate("Date"));
                    cancelBooking(days.getDate("Date"), booked.getString("Name"), Flight, true);                    
                }
                dC.paxWaitlist.setDate(1, days.getDate("Date"));
                dC.paxWaitlist.setString(2, Flight);
                ResultSet waitlisted = dC.paxWaitlist.executeQuery();
                while (waitlisted.next()) {
                    dC.cancelWaitlist.setString(1, waitlisted.getString("Name"));
                    dC.cancelWaitlist.setString(2,Flight);
                    dC.cancelWaitlist.setDate(3, days.getDate("Date"));
                    dC.cancelWaitlist.executeUpdate();
                }
            }
        }
        catch (SQLException sqlexception) {
            sqlexception.printStackTrace();
        }
    }
    
    public static void cancelBooking(Date day, String Name, String Flight, boolean dropped) {
        /*try {
            DatabaseConnection dC = new DatabaseConnection();
            dC.cancelCustomer.setString(1, Name);
            dC.cancelCustomer.setString(2, Flight);
            dC.cancelCustomer.setDate(3, day);
            dC.cancelCustomer.executeUpdate();
        }
        catch (SQLException sqlexception) {
            sqlexception.printStackTrace();
        }*/
    }
}
