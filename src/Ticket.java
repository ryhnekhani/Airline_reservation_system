import java.util.ArrayList;
import java.util.Scanner;

public class Ticket {

    ArrayList<Flight> bookedtickets = new ArrayList<>();


    public void BookingTicket() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the id of the flight that you want to book ");
        String Id;
        Id = in.nextLine();
        Flights flights = new Flights();
        for (int i = 0; i < flights.flightArrayList.size(); i++) {
            Flight flight = flights.flightArrayList.get(i);
            User  user  = new  User();
            if (flight.getFlightId().equals(Id)) {
                if (flight.getSeats()>=1) {
                    if (user.getCharge() >= flight.getPrice()) {
                        int x = user.getCharge();
                        int y = flight.getPrice();
                        user.setCharge(x - y);
                        System.out.println("The ticket was paid successfully");
                    }
                    else if (user.getCharge() < flight.getPrice()) {
                        System.out.println("your charge is not enough");
                        Passenger.passengerMenu();

                    }
                    else if(flight.getSeats() < 1){
                        System.out.println("This flight does not have an empty seat ");
                        Passenger.passengerMenu();
                    }
                }
                bookedtickets.add(flight);
                System.out.println("The ticket was booked successfully!");
                break;
            }
            else {
                System.out.println("the flight was not found");
                Passenger.passengerMenu();
            }
        }

    }

    public void viewBookedTickets() {
        for (int i = 0; i <  bookedtickets.size(); i++) {
            System.out.println(bookedtickets.get(i));

        }
    }

    public void ticketCancelation()
    {
        System.out.println("sorry,this section is not ready now");
    }
}

