import java.util.ArrayList;
import java.util.*;
public class LogInSystem{
    Scanner sc = new Scanner(System.in);
    int password;
    String userName;
    ArrayList<User> userList = new ArrayList<>();
    User user1 = new User("fahim",1234);
    User user2 = new User("mahim",1111);
    adminList.add(admin1);
    LogInSystem(String userName, int password){
        this.userName=userName;
        this.password=password;

    }
    void accountCheck(){
        for (LogInSystem lis : userList) {
            System.out.println("Enter your username:");
            String userNameCheck=sc.nextLine();

            if (lis.userName==userNameCheck){
                System.out.println("Username found.");
                int passwordCheck=0;
                System.out.println("Enter password:");
                sc.nextInt();
                if (lis.password==passwordCheck) {
                    System.out.println("System logged-in");
                    System.out.println("Welcome to the system hub.");
                    
                }
                else{
                    System.out.println("Passward is incorrect!");
                }
            }
            else{
                System.out.println("Username is incorrect!");
            }
        }
    }
    void setUserName(String userName){
        this.userName=userName;
    }
    void setPassword(int password){
        this.password=password;
    }
    String getUserName(){
        return userName;
    }
    int getPassword(){
        return password;
    }
    void logIn(){
        
    }
    
}