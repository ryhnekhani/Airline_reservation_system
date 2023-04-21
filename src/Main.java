import java.util.Scanner;
/**
 * This project is an airline reservation system that allows customers to book flights,
 * view flight schedules, and manage their reservations. It provides methods for searching and
 * booking available flights, as well as canceling them. The system
 * also has an admin user that is allowed to add,remove and update flights.
 *
 * @author   Ryhne Khani
 * @version  1.0
 * @since    2023-04-21
 */

public class Main {

    public static void main(String[] args) {
        InputMenu inputMenu = new InputMenu();
        inputMenu.inputMenu();

    }
}