import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Flights {
    static int counter = 10;
    ArrayList<Flight> flightArrayList = new ArrayList<>();

    public void flightTable() {
        Flight flight = new Flight("XW-23", "Tehran", "Yazd", "1402-12-10", "12:30", 100000, 34);
        flightArrayList.add(flight);
        flight = new Flight("WE-32", "Mashhaad", "Shiraz", "1402-11-20", "14:23", 230000, 200);
        flightArrayList.add(flight);
        flight = new Flight("AF-12", "Ahvaz", "Kish", "1402-03-23", "15:34", 135000, 66);
        flightArrayList.add(flight);
        flight = new Flight("FE-12", "Tabriz", "Yazd", "1402-04-15", "08:00", 450000, 130);
        flightArrayList.add(flight);
        flight = new Flight("GW-54", "Semnan", "Tabriz", "1402-01-12", "20:20", 700000, 89);
        flightArrayList.add(flight);
    }

    public void addFlight() {
        Scanner in = new Scanner(System.in);
        System.out.println(".........ADD FLIGHT..........");
        System.out.println("Enter the details of the flight you want to add");
        System.out.println("flightId:");
        String flightId;
        flightId = in.nextLine();
        System.out.println("origin:");
        String origin;
        origin = in.nextLine();
        System.out.println("destination:");
        String destination;
        destination = in.nextLine();
        System.out.println(" date:");
        String date;
        date = in.nextLine();
        System.out.println("time:");
        String time;
        time = in.nextLine();
        System.out.println(" price:");
        int  price;
        price = in.nextInt();
        System.out.println("  seats:");
        int seats;
        seats = in.nextInt();
        Flight flight = new Flight(flightId, origin, destination, date, time, price, seats);
        flightArrayList.add(flight);
    }

    public void updateFlight() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the flightId of the flight you want to update :");
        String flightId;
        flightId = input.nextLine();
        for (Flight flight : flightArrayList) {
            if (flight.getFlightId().equals(flightId)) {
                System.out.print("Update the origin:");
                String origin = input.next();
                flight.setOrigin(origin);

                System.out.print("Update the destination: ");
                String destination = input.next();
                flight.setDestination(destination);

                System.out.print("Update the date:");
                String date = input.next();
                flight.setDate(date);

                System.out.print("Update the time:");
                String time = input.next();
                flight.setTime(time);

                System.out.print("Update the price:");
                int price = input.nextInt();
                flight.setPrice(price);

                System.out.print("Update the seats: ");
                int seats = input.nextInt();
                flight.setSeats(seats);

                System.out.println("The flight " + flightId + " is updated successfully!");

            }
        }
    }

    public void removeFlight() {
        System.out.println("Enter the flightId of the flight that you want to remove:");
        Scanner in = new Scanner(System.in);
        String flightId;
        flightId = in.nextLine();
        for (Iterator<Flight> iterator = flightArrayList.iterator(); iterator.hasNext(); ) {
            Flight flight = iterator.next();
            if (flight.getFlightId().equals(flightId)) {
                iterator.remove();
            }
        }
    }

    public void viewFlightSchedules() {
        for (int i = 0; i < flightArrayList.size(); i++) {
            System.out.println(flightArrayList.get(i));

        }
    }

    public void searchFlight(){
        System.out.println("Sorry! this section does not work right now.It will be fixed 3 days later. ");
    }
}
