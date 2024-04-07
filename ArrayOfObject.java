import java.util.Scanner;

public class ArrayOfObject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of foods:");
        int size = sc.nextInt(); 
        sc.nextLine(); 

        Food[] lunch = new Food[size]; 
        
        // Populate the array with user input
        for(int i = 0; i < size; i++) {
            System.out.println("Enter the name of food " + (i + 1) + ":");
            String foodName = sc.nextLine();
            lunch[i] = new Food(foodName);
        }

        System.out.println("Foods in lunch:");
        for (Food food : lunch) {
            System.out.println(food.name);
        }

        sc.close();
    }
}

class Food {
    String name;
    
    Food(String name) {
        this.name = name;
    }
}
