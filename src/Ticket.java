import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Ticket {

    ArrayList<Flight> bookedtickets = new ArrayList<>();

    private ArrayList<String> ticketID = new ArrayList<>();
    public void BookingTicket() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the id of the flight that you want to book ");
        String Id;
        Id = in.nextLine();
        Flights flights = new Flights();
        for (int i = 0; i < flights.flightArrayList.size(); i++) {
            Flight flight = flights.flightArrayList.get(i);
            User user = new User();
            if (flight.getFlightId().equals(Id)) {
                if (flight.getSeats() >= 1) {
                    if (user.getCharge() >= flight.getPrice()) {
                        int x = user.getCharge();
                        int y = flight.getPrice();
                        user.setCharge(x - y);
                        System.out.println("The ticket was paid successfully");
                    } else if (user.getCharge() < flight.getPrice()) {
                        System.out.println("your charge is not enough");
                        Passenger.passengerMenu();

                    } else if (flight.getSeats() < 1) {
                        System.out.println("This flight does not have an empty seat ");
                        Passenger.passengerMenu();
                    }
                }
                bookedtickets.add(flight);
                flight.setSeats(flight.getSeats() - 1);
                System.out.println("The ticket was booked successfully!");
                StringBuilder ticket = generateTicketId();
                ticketID.add(ticket.toString());
                System.out.println("Your ticket ID is " + ticket);
                break;
            } else {
                System.out.println("the flight was not found");
                Passenger.passengerMenu();
            }
        }

    }

    public void ticketCancelation() {
      //  System.out.println("Sorry,this section is not ready");
        System.out.println("Enter Your Ticket ID:");
        Scanner scanner = new Scanner(System.in);
        String ticketid = scanner.next();
        int index  = getTicketIndexByNumber(ticketid);
        if(index >= 0){
            ticketID.remove(index);
            Flights flights =  new Flights();
            Flight canceled = flights.flightArrayList.get(index);
            canceled.setSeats(canceled.getSeats()+1);
            User user = new User();
            int x = user.getCharge();
            int y = canceled.getPrice();
            user.setCharge(x + y);
            bookedtickets.remove(index);
            System.out.println("Your ticket canceled successfully");
        }
        else{
            System.out.println("No ticket found");

        }

    }

    public StringBuilder generateTicketId() {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int stringLength = 4;
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < stringLength; i++) {
            int index = random.nextInt(alphabet.length());
            randomString.append(alphabet.charAt(index));
        }
        return randomString;
    }
    public int getTicketIndexByNumber(String ticket) {
        for (int i = 0; i < this.ticketID.size(); i++) {
            if (ticketID.get(i).equals(ticket)) {
                return i;
            }
        }
        return -1;
    }

    public void viewBookedTickets() {
        for (int i = 0; i < bookedtickets.size(); i++) {
            System.out.println(bookedtickets.get(i));

        }
    }
}