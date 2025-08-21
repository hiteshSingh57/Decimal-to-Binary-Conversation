import java.util.*;
import java.math.BigInteger;
public class decimaltobinary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       while (true)
       {
            System.out.println("Enter a decimal number :");
                String input = sc.nextLine();
            if(input.equalsIgnoreCase("exit"))
            {
            System.out.println("GoodBye!!");
            break;
            }
            try{
            BigInteger decimalNum = new BigInteger(input);
            String binary = decimalNum.toString(2);
            System.out.println("Binary representation: " + binary);
            }catch (NumberFormatException e){
            System.out.println("Invalid Inpiut Please enter a valid Number");

            }
        }   sc.close();
       
    }
}   