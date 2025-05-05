import java.util.*;
public class Room_temp {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is the room temperature? ");
    double temperature = scanner.nextDouble();

    if(temperature < 25){
        System.out.println("The room is cold");
    }
    else if(temperature < 27){
        System.out.println("The room is warm");
    }
    else {
        System.out.println("The room is hot");
    }

 }
}
