import java.util.Scanner;

public class SimpleSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LogInSystem logInSystem;
        
        System.out.println("Welcome to the log-in pannel");
        System.out.println("Choice log-in option\n 1. Admin \n 2. User");
        int option = sc.nextInt();
        if (option == 1) {
            logInSystem = new Admin();
            logInSystem.logIn();
            logInSystem.accountCheck();

        } else if (option == 2) {
            logInSystem = new User();
            logInSystem.logIn();
            logInSystem.accountCheck();

        } else {
            System.out.println("Wrong option!\n Choose between 1 or 2");
        }


        sc.close();
    }
}


