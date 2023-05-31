/**
 * @author fazliberkordek
 */

import java.util.Scanner;

public class Main {
    //This program written to find gcd and cgf
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Taking the inputs from the user:
        int num1, num2;
        System.out.print("Number 1: ");
        num1 = input.nextInt();
        System.out.print("Number 1: ");
        num2 = input.nextInt();

        //Finding the smallest umber. GCD Logic mworks for the smallests.
        int smallest;
        if (num2 > num1) {
            smallest = num1;
        } else {
            smallest = num2;
        }
        System.out.println("the smallest: " + smallest);

        //Check the all number from 1 to smallest;
        int i = 1, gcd = 1;
        while (i <= smallest) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        System.out.println("Greatest Common Divider is : " + gcd);

        //Finding the Least common multiple

        for(int k =1;k<=(num1*num2);k++){
            if(k%num1 == 0 && k%num2==0){
                System.out.println("Least commmon Divider is : "+ k );
                break;
            }
        }
 
    }


}
