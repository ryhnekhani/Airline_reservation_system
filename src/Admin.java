import java.util.Scanner;

public class Admin
{
    public static int adminMenu() {
        System.out.println(".................ADMIN MENU OPTIONS.................");
        System.out.println("<1> add\n<2> update\n<3> remove\n<4> flight schedules\n<0> Sign out");
        int num;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        Flights flights = new Flights();
        flights.flightTable();
        while (num != 0) {

            switch (num) {
                case 1:
                    flights.addFlight();
                    break;
                case 2:
                    flights.updateFlight();
                    break;
                case 3:
                    flights.removeFlight();
                    break;
                case 4:
                    flights.viewFlightSchedules();
                    break;
                case 0:
                    System.out.println("Back to option menu");
                    break;
                default:
                    System.out.println("Invalid command,try again");
                    adminMenu();
                    break;
            }
            System.out.println("<1> Add\n<2> update\n <3> remove\n <4> flight schedules\n <0> Sign out");
            num = in.nextInt();
        }
        return num;
    }
}