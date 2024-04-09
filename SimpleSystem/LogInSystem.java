import java.util.ArrayList;
import java.util.*;
public class LogInSystem{
    Scanner sc = new Scanner(System.in);
    int password;
    String userName;
     ArrayList<UserList> userList = new ArrayList<>();
    



    public LogInSystem(){
        UserList user1 = new UserList("mike",2222);
        UserList user2 = new UserList("trevor",1111);
        userList.add(user1);
        userList.add(user2);

    }
    void accountCheck() {
        boolean found = false;
        for (UserList user : userList) {
            System.out.println("Enter your username:");
            String userNameCheck = sc.nextLine();

            if (user.getUserName().equals(userNameCheck)) {
                found = true;
                System.out.println("Username found.");
                System.out.println("Enter password:");
                int passwordCheck = sc.nextInt();
                sc.nextInt();
                if (user.getPassword() == passwordCheck) {
                    System.out.println("System logged-in");
                    System.out.println("Welcome to the system hub.");

                } else {
                    System.out.println("Password is incorrect!");
                }
            } else {
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