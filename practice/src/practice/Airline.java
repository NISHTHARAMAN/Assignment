package practice;


class SeatAssignment {
 private int row;
 private char seatLetter;

 public SeatAssignment(int row, char seatLetter) {
     this.row = row;
     this.seatLetter = seatLetter;
 }

 public int getRow() {
     return row;
 }
 public void setRow(int row) {
	 this.row = row;
 }

 public char getSeatLetter() {
     return seatLetter;
 }
 public void setSeatLetter(char seatLetter) {
	 this.seatLetter = seatLetter;
 }

 @Override
 public String toString() {
     return row + "" + seatLetter;
 }
}

class AirlineTicket {
 private String departureCity;
 private String arrivalCity;
 private String flightNumber;
 private SeatAssignment seatAssignment;

 public AirlineTicket(String departureCity, String arrivalCity, String flightNumber, SeatAssignment seatAssignment) {
     this.departureCity = departureCity;
     this.arrivalCity = arrivalCity;
     this.flightNumber = flightNumber;
     this.seatAssignment = seatAssignment;
 }

 public String getDepartureCity() {
     return departureCity;
 }
 
 public void setDepartureCity(String departureCity) {
	 this.departureCity = departureCity;
 }
 
 public String getArrivalCity() {
     return arrivalCity;
 }
 
 public void setArrivalCity(String arrivalCity) {
	 this.arrivalCity = arrivalCity;
 }
 
 public String getFlightNumber() {
     return flightNumber;
 }
 
 public void setFlightNumber(String flightNumber) {
	 this.flightNumber = flightNumber;
 }

 public SeatAssignment getSeatAssignment() {
     return seatAssignment;
 }
 
 public void setSeatAssignment(SeatAssignment seatAssignment) {
	 this.seatAssignment = seatAssignment;
 }

 @Override
 public String toString() {
     return "Flight " + flightNumber + " from " + departureCity + " to " + arrivalCity + ", Seat: " + seatAssignment;
 }
}

public class Airline {

	public static void main(String[] args) {
		SeatAssignment seat1 = new SeatAssignment(12, 'F');
        AirlineTicket ticket1 = new AirlineTicket("New York", "Los Angeles", "UA123", seat1);

        SeatAssignment seat2 = new SeatAssignment(25, 'C');
        AirlineTicket ticket2 = new AirlineTicket("Chicago", "Miami", "AA456", seat2);

        System.out.println(ticket1.toString());
        System.out.println(ticket2.toString());
	}

}
