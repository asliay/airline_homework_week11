import java.util.Random;

public class Passenger {

    //Each passenger bag weighs the same
    //Planes reserve half of their total weight for passenger bags
    //The weight of bag per person is the weight reserved for passenger bags divided by the capacity
    //Passengers exist for a single flight only

    //MORE EXTENSIONS:
    // Add a 'flight' property to the Passenger class which is assigned
    //  when a passenger is added to a flight
    // Add a 'seat number' property to the Passenger class as an integer.
    // Set it to a random number which is assigned when a Passenger is booked on a flight
    // Make sure the flight doesn't double book the same seat number to more than one passenger

    private String name;
    private int numberOfBags;
    private int seatNumber; // assigned randomly only when passenger is booked onto flight
    private Flight bookedFlight;

    public Passenger(String name, int numberOfBags) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.seatNumber = 0;
        this.bookedFlight = null;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBagCount() {
        return this.numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;

    }

    public Flight getBookedFlight() {
        return this.bookedFlight;
    }

    public void setBookedFlight(Flight bookedFlight) {
        this.bookedFlight = bookedFlight;
    }
}
