

import java.util.Scanner;

public class InputMenu {
    public void inputMenu() {
        while (true) {
            System.out.println("................MENU OPTION..............");
            System.out.println("\n<1> Sign in\n<2> Sign up");
            Scanner in = new Scanner(System.in);
            int command = in.nextInt();
            if (command == 1)
                signIn();

            Passenger.passengerMenu();

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
            int find_user = 1;
            User user = new User();
            InputMenu inputMenu = new InputMenu();
            if (username2.equals("Admin") && password2 == 12881288) {
                Admin.adminMenu();
                break;
            }
            User user1 = new User();
            for (User fuser : user1.usersinfo) {
                if (fuser == null)
                    break;

                if (password2 == user.getPassword() && username2.equals(user.getUsername())) {
                    System.out.println("You have successfully signed in.");
                    find_user = 0;
                    break;
                }

            }
            if (find_user == 1) {
                System.out.println("Sorry!you don't have an account.Please sign up.");
                inputMenu.inputMenu();
            }
        }
    }
    public void signUp()
    {
        System.out.println("Set a password and username to make an account:\n");
        System.out.println("username:");
        Scanner in = new Scanner(System.in);
        User user =new User();
        String username= in.nextLine();
        //user.setUsername(username);
        System.out.println("password:");
        int  password=  in.nextInt();
        // user.setPassword(password);
        User user1 = new User() ;
        User.usersinfo.add(user) ;
        System.out.println("Your account is created successfully! now you can sign in.");
        inputMenu();


    }


}