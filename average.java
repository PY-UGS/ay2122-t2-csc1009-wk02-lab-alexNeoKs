import java.util.Scanner;
public class average {
    public static void main(String[] args){

        // opening Scanner 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 number: ");

        float i_1 = input.nextFloat();
        float i_2 = input.nextFloat();
        float i_3 = input.nextFloat();
        float average_i = (i_1 + i_2 + i_3 )/3;


        System.out.println("The average of " + i_1 + " " +i_2 + " " +i_3 + " is "+ average_i);
        // closing scanner
        input.close();
    }
}
