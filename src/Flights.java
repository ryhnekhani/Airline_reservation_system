import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Flights {
    ArrayList<Flight> flightArrayList = new ArrayList<>();

    public void flightTable() {
        Flight flight = new Flight("xr-45", "Tehran", "Yazd", "1402-12-10", "12:30", 100000, 34);
        flightArrayList.add(flight);
        flight = new Flight("ws-12", "Mashhad", "Shiraz", "1402-11-20", "14:23", 230000, 200);
        flightArrayList.add(flight);
        flight = new Flight("sx-54", "Tehran", "Kish", "1402-03-23", "15:34", 135000, 66);
        flightArrayList.add(flight);
        flight = new Flight("rf-47", "Isfahan", "Khoramshahr", "1402-04-15", "08:00", 450000, 130);
        flightArrayList.add(flight);
        flight = new Flight("gm-69", "Mashhad", "Tabriz", "1402-01-12", "20:20", 700000, 3);
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
        System.out.println("date:");
        String date;
        date = in.nextLine();
        System.out.println("time:");
        String time;
        time = in.nextLine();
        System.out.println(" price:");
        int  price;
        price = in.nextInt();
        System.out.println("seats:");
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
        //System.out.println("Sorry! this section does not work right now.");
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.Search based on flight ID");
            System.out.println("2.Search based on origin");
            System.out.println("3.Search based on destination");
            System.out.println("4.Search based on date");
            System.out.println("5.Search based on time");
            System.out.println("6.Search based on price");

            int  command = 0;
             command = scanner.nextInt();

            switch( command){
                case 1 ->{
                    System.out.println("Enter your flight ID");
                    String flightID = scanner.next();
                    for (Flight flight :flightArrayList) {
                        if(flight.getFlightId().contains(flightID))
                            System.out.print(flight.toString());
                    }
                }

                case 2 ->{
                    System.out.println("Enter your origin");
                    String origin = scanner.next();

                    for (Flight flight : flightArrayList) {
                        if(flight.getOrigin().contains(origin))
                            System.out.print(flight.toString());
                    }
                }
                case 3 ->{
                    System.out.println("Enter your destination");
                    String destination = scanner.next();

                    for (Flight flight : flightArrayList) {
                        if(flight.getDestination().contains(destination))
                            System.out.print(flight.toString());
                    }
                }
                case 4 ->{
                    System.out.println("Enter your date(YYYY/MM/DD)");
                    String date = scanner.next();

                    for (Flight flight : flightArrayList) {
                        if(flight.getDate().equals(date))
                            System.out.print(flight.toString());
                    }
                }
                case 5 ->{
                    System.out.println("Enter your time(HH:MM)");
                    String time = scanner.next();
                    for (Flight flight : flightArrayList) {
                        if(flight.getTime().equals(time))
                            System.out.print(flight.toString());
                    }
                }
                case 6 ->{
                    System.out.println("Enter your min Price");
                    int min = scanner.nextInt();
                    System.out.println("Enter your max Price");
                    int max = scanner.nextInt();
                    for (Flight flight : flightArrayList) {
                        if(flight.getPrice() >= min && flight.getPrice() <= max)
                            System.out.print(flight.toString());
                    }
                }
            }
        }
    }

