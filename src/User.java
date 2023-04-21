import java.util.ArrayList;
import java.util.Scanner;

public class User {
    public static ArrayList<User> usersinfo = new ArrayList<>();
    String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    int password;
    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }


    int charge;

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }


    public void changePassword()
    {
        Scanner in = new Scanner(System.in);
        int new_password ;
        System.out.println("Enter the new password you want to set:");
        new_password=in.nextInt() ;
        setPassword(new_password);
        System.out.println("Your password is changed successfully!");

    }
    public int addCharge (int charge){
        int x;
        System.out.println("How much you want to charge your account?");;
        Scanner in = new Scanner(System.in);
        x= in.nextInt();
        charge+=x;
        setCharge(charge);
        return charge ;
    }




}
