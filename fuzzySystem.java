import java.util.*;
public class fuzzySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();

        if(weight == 0){
            System.out.println("Time Estimate: " + 0 + " minutes");
        }
        else if(weight > 0 && weight <= 2000){ 
            System.out.println("Time Estimate: " + 25 + " minutes");
        }
        else if(weight > 2000 && weight <= 4000){
            System.out.println("Time Estimate: " + 35 + " minutes");
        }
        else if(weight > 4000 && weight <= 7000){
            System.out.println("Time Estimate: " + 45 + " minutes");
        }
        else{
            if(weight < 0){
                System.out.println("Invalid Input");
            }
            else{
                System.out.println("Overload");
            }
        }
    }
}
