import java.util.Scanner;
public class circle_area{
    public static void main(String[] args){

        final float pi = 3.14f;

        // opening Scanner 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for the radius: ");
        String s = input.nextLine();
        int radius = Integer.parseInt(s);

        float area = radius * radius * pi;
        System.out.println("The area for the circle of radius " + s + " is " + area);
 
        
        
        // closing scanner
        input.close();
    }
}
    
