package activities1_2;
import java.util.Scanner;
public class Activities1_2 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter the number: ");
        int number=input.nextInt();
        int sum=0;
        while(number !=0)
            
        {
        int digit = number % 10;
        sum+=digit;
        number = number /10;
        }
        System.out.println(sum); 
    }
    
}
