import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:derby://localhost:1527/FlightSchedulerShubhamGoyalsjg5530";
    private static final String username = "java";
    private static final String password = "java";

    private Connection connection;
    public PreparedStatement numSeats;
    public PreparedStatement flightNames;
    public PreparedStatement flightDates;
    public PreparedStatement insertNewBooking;
    public PreparedStatement insertNewWaitlist;
    public PreparedStatement paxBooked;
    public PreparedStatement getWaitlist;
    public PreparedStatement paxWaitlist;
    public PreparedStatement getFlightSeats;
    public PreparedStatement getCustomerName;
    public PreparedStatement getCustomerName2;
    public PreparedStatement addDate;
    public PreparedStatement addFlight;
    public PreparedStatement dropFlight;
    public PreparedStatement cancelCustomer;
    public PreparedStatement customerStatus;
    public PreparedStatement checkWaitlist;
    public PreparedStatement pullFirstWaitlist;
    public PreparedStatement cancelWaitlist;

    public DatabaseConnection() {

        try {
            connection = DriverManager.getConnection(URL, username, password);

            numSeats = connection.prepareStatement("SELECT Seats FROM FLIGHTS WHERE FLIGHT = ?");
            flightNames = connection.prepareStatement("SELECT Flight FROM FLIGHTS");
            flightDates = connection.prepareStatement("SELECT Date FROM DATES");
            insertNewBooking = connection.prepareStatement("INSERT INTO BOOKINGS (Day, Flight, Name, Timestamp) VALUES (?, ?, ?, ?)");
            insertNewWaitlist = connection.prepareStatement("INSERT INTO WAITLIST (Date, Flight, Name, Timestamp) VALUES (?, ?, ?, ?)");
            paxBooked = connection.prepareStatement("SELECT * FROM BOOKINGS WHERE Day = ? and Flight = ?");
            getWaitlist = connection.prepareStatement("SELECT Name FROM WAITLIST WHERE Date = ?");
            paxWaitlist = connection.prepareStatement("SELECT Name FROM WAITLIST WHERE Date = ? and Flight = ?");
            getFlightSeats = connection.prepareStatement("SELECT count(Name) FROM BOOKINGS WHERE Flight = ? and Day = ?");
            getCustomerName = connection.prepareStatement("SELECT Name FROM BOOKINGS WHERE NAME = ?");
            getCustomerName2 = connection.prepareStatement("SELECT Name FROM WAITLIST WHERE NAME = ?");
            addDate = connection.prepareStatement("INSERT INTO DATES (Date) VALUES (?)");
            addFlight = connection.prepareStatement("INSERT INTO FLIGHTS (Flight, Seats) VALUES (?, ?)");
            dropFlight = connection.prepareStatement("DELETE FROM FLIGHTS WHERE Flight = ?");
            cancelCustomer = connection.prepareStatement("DELETE FROM BOOKINGS WHERE Name = ? AND Flight = ? AND Day = ?");
            customerStatus = connection.prepareStatement("SELECT Flight, Day FROM BOOKINGS WHERE Name = ?");
            checkWaitlist = connection.prepareStatement("SELECT Flight, Date FROM WAITLIST WHERE Name = ?");
            pullFirstWaitlist = connection.prepareStatement("SELECT * FROM WAITLIST ORDER BY Timestamp");
            cancelWaitlist = connection.prepareStatement("DELETE FROM WAITLIST WHERE Name = ? AND Flight = ? AND Date = ?");
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
