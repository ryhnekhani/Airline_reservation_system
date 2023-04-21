import java.util.Scanner;

public class Passenger {


    public static int passengerMenu() {
        System.out.println("....................PASSENGER MENU OPTION..................");
        System.out.println("<1> change password\n<2> search flight ticket\n <3> booking ticket\n <4> ticket cancellation\n <5> booked tickets\n <6> add charge\n <0> sign out");
        int command;
        Scanner in = new Scanner(System.in);
        command = in.nextInt();
        Flights flights = new Flights();
        User user = new User();
        Ticket ticket= new Ticket();
        switch (command) {
            case 1:
                user.changePassword();
                break;
            case 2:
                flights.searchFlight();
                break;
            case 3:
                ticket.BookingTicket();
                break;
            case 4:
                ticket.ticketCancelation();
                break;
            case 5 :
                ticket.viewBookedTickets();
                break;
            case 6:
                user.addCharge(user.getCharge());
            case 0:
                System.out.println("Back to passenger menu");
                break;
            default:
                System.out.println("invalid command,try again");
                passengerMenu();
                break;
        }
        return command;
    }

}
