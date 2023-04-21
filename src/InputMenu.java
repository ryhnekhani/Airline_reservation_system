

import java.util.ArrayList;
import java.util.Scanner;

public class InputMenu {
    public void inputMenu() {
        while (true) {
            System.out.println("................MENU OPTION..............");
            System.out.println("\n<1> Sign in\n<2> Sign up");
            Scanner in = new Scanner(System.in);
            int command = in.nextInt();
            if (command == 1) {
                signIn();
                // Passenger.passengerMenu();
            }
            if (command == 2)
                signUp();

        }
    }

    public void signIn() {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your username:");
            String username2;
            username2 = in.nextLine();
            System.out.println("Enter your password:");
            int password2;
            password2 = in.nextInt();
            boolean find_user = false;
            User user = new User();
            InputMenu inputMenu = new InputMenu();
            if (username2.equals("Admin") && password2 == 12881288) {
                Admin.adminMenu();
                break;
            }

            //for (User fuser : userr.usersinfo)
            for (int  i= 0;  i<User.usersinfo.size() ; i++) {
                User fuser = User.usersinfo.get(i) ;

                if (fuser == null)
                    break;

                if (username2.equals(fuser.getUsername()) && password2 == fuser.getPassword() ) {
                    System.out.println("You have successfully signed in.");
                    Passenger.passengerMenu();
                    find_user = true;
                    break;
                }

            }
            if (!find_user) {
                System.out.println("Sorry!you don't have an account.Please sign up.");
                inputMenu.inputMenu();
            }
        }
    }

    public void signUp() {
        while (true){
            System.out.println("Set a password and username to make an account:\n");
        System.out.println("username:");
        Scanner in = new Scanner(System.in);
        String username = in.nextLine();

        System.out.println("password:");
        int password = in.nextInt();

            int charge=0;
            User newuser = new User(username,password,charge);
            newuser.setPassword(password);
            newuser.setUsername(username);
        User.usersinfo.add(newuser);
        System.out.println("done");
break;
    }

}
}