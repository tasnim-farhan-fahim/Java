public class User extends LogInSystem{
    User(String userName, int password) {
        super(userName, password);
        //TODO Auto-generated constructor stub
    }

    @Override
    void logIn(){
        System.out.println("Welcome to the User pannel");

    }
}