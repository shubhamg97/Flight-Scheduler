import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Customer {

    public static SortedSet<String> customerList() {
        ArrayList<String> data = new ArrayList<String>();
        
        try {
            DatabaseConnection dC = new DatabaseConnection();
            ResultSet results = dC.getCustomerName.executeQuery();
            while (results.next()) {
                String names1 = results.getString("Name");
                data.add(names1);
            }
            ResultSet results2 = dC.getCustomerName2.executeQuery();
            while (results2.next()) {
                String names2 = results2.getString("Name");
                data.add(names2);
            }                        
        }
        catch (SQLException sqlexception) {
            sqlexception.printStackTrace();
        }
        SortedSet<String> customers = new TreeSet<>(data);
        return customers;
    }
    
    public static Map<String,ArrayList<String>> statusCheck(String name,  Date date, Boolean print) {
        ArrayList<String> bookedFlightData = new ArrayList<String>();
        ArrayList<String> bookedDateData = new ArrayList<String>();
        ArrayList<String> waitlistFlightData = new ArrayList<String>();
        ArrayList<String> waitlistDateData = new ArrayList<String>();
        ArrayList<String> cancelCustomerBooking = new ArrayList<String>();
        ArrayList<String> cancelCustomerWaitlist = new ArrayList<String>();
        try
        {
            
            DatabaseConnection dC = new DatabaseConnection();
            dC.customerStatus.setString(1, name);
            dC.checkWaitlist.setString(1, name);
            ResultSet bookedResults = dC.customerStatus.executeQuery();
            ResultSet waitlistResults = dC.checkWaitlist.executeQuery();
            while (bookedResults.next()) {
                String flights = bookedResults.getString("Flight");
                bookedFlightData.add(flights);
                String dates = bookedResults.getString("Day");
                bookedDateData.add(dates);
                if (bookedResults.getDate("Day") == date) {
                    cancelCustomerBooking.add(flights);
                }
            }
            while (waitlistResults.next()) {
                String flights = waitlistResults.getString("Flight");
                waitlistFlightData.add(flights);
                String dates = waitlistResults.getString("Date");
                waitlistDateData.add(dates);
                if (waitlistResults.getDate("Date") == date) {
                    cancelCustomerWaitlist.add(flights);
                }
            }
            
            FlightScheduler.customerStatusTextArea.append(name + " is booked for:\n");
            if (bookedFlightData.size() == 0 && print == true) {
                FlightScheduler.customerStatusTextArea.append("No flights at the moment. \n");
            }
            else if (print == true) {
                for ( int i = 0; i < bookedFlightData.size(); i++) {
                    FlightScheduler.customerStatusTextArea.append("Flight " + bookedFlightData.get(i).toString() + " on " + 
                        bookedDateData.get(i).toString() + "\n");
                }
            }
            FlightScheduler.customerStatusTextArea.append(name + " is waitlisted for:\n");
            if (waitlistFlightData.size() == 0 && print == true) {
                FlightScheduler.customerStatusTextArea.append("No flights at the moment. \n");
            }
            else if (print == true) {
                for ( int i = 0; i < waitlistFlightData.size(); i++) {
                    FlightScheduler.customerStatusTextArea.append("Flight " + waitlistFlightData.get(i).toString() + " on " + 
                        waitlistDateData.get(i).toString() + "\n\n");
                }
            }
        }
        catch (SQLException sqlexception) {
            sqlexception.printStackTrace();
        }
        Map<String,ArrayList<String>> map = new HashMap();
        map.put("cancelCustomerBooking", cancelCustomerBooking);
        map.put("cancelCustomerWaitlist", cancelCustomerWaitlist);
        return map;
    }
    
    public static void rebookCustomer(String customer, Date date) {
        try {
            DatabaseConnection dC = new DatabaseConnection();
            ResultSet flights = dC.flightNames.executeQuery();
            boolean gotRebooked = false;
            
            while (flights.next() && gotRebooked == false) {
                dC.numSeats.setString(1, flights.getString("Flight"));
                dC.getFlightSeats.setString(1, flights.getString("Flight"));
                dC.getFlightSeats.setDate(2, date);
                ResultSet totalSeats = dC.numSeats.executeQuery();
                ResultSet occupiedSeats = dC.getFlightSeats.executeQuery();
                totalSeats.next();
                occupiedSeats.next();
                
                if (totalSeats.getInt("Seats") > occupiedSeats.getInt(1)) {                    
                    Booking.bookNewCustomer(customer, flights.getString("Flight"), date);
                    gotRebooked = true;
                    FlightScheduler.dropFlightTextArea.append(customer + " has been rebooked on flight " +
                            flights.getString("Flight") + " on the day of " + date + "\n");
                }
            }
            if (gotRebooked == false) {                
                FlightScheduler.dropFlightTextArea.append("There was no available flight to rebook " + customer +
                        " to, so their booking had to be cancelled.\n");
            }
        }
        catch (SQLException sqlexception) {
            sqlexception.printStackTrace();
        }
    }
    
    public static void cancelCustomer(String Name, Date day, boolean dropped) {
        try {
            Map<String,ArrayList<String>> data = new HashMap();
            data = statusCheck(Name, day, false);
            FlightScheduler.cancelCustomerTextArea.append("success 1\n\n");
            for ( Map.Entry<String, ArrayList<String>> entry : data.entrySet()) {
                ArrayList<String> mapData = entry.getValue();
                String key = entry.getKey();
                FlightScheduler.cancelCustomerTextArea.append("success 2\n\n");
                if (key == "cancelCustomerBooking") {
                    FlightScheduler.cancelCustomerTextArea.append("success 2.5\n\n");
                    for (String Flight : mapData) {
                        FlightScheduler.cancelCustomerTextArea.append("success 3\n\n");
                        DatabaseConnection dC = new DatabaseConnection();
                        dC.cancelCustomer.setDate(3, day);
                        dC.cancelCustomer.setString(1, Name);
                        dC.cancelCustomer.setString(2, Flight);
                        dC.cancelCustomer.executeUpdate();
                        FlightScheduler.cancelCustomerTextArea.append(Name + " has had their booking on " + Flight + " on the day of " + day 
                                + " cancelled successfully.\n\n");
                        if (dropped == false) {
                            FlightScheduler.cancelCustomerTextArea.append("success 4\n\n");
                            Waitlist.bumpFromWaitlist(Flight, day);
                        }
                    }
                }
                if (key == "cancelCustomerWaitlist") {
                    for (String Flight : mapData) {
                        DatabaseConnection dC = new DatabaseConnection();
                        dC.cancelWaitlist.setString(1, Name);                        
                        dC.cancelWaitlist.setString(2, Flight);
                        dC.cancelWaitlist.setDate(3, day);
                        FlightScheduler.cancelCustomerTextArea.append(Name + " has had their position on the waitlist for " 
                                + Flight + " on the day of " + day + " cancelled successfully.\n\n");
                    }
                }
            }
        }
        catch (SQLException sqlexception) {
            sqlexception.printStackTrace();
        }
    }
}
