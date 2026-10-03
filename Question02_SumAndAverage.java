// Q --> Calculate the sum and average of all elements in an array.


package phase1;

import java.util.Scanner;

public class Question02_SumAndAverage {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of the element : ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter " + n + " element:");

        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0 ;
        for(int i = 0 ; i < n ; i++){
            sum+=arr[i];
        }

        double average = (double) sum/n;

        System.out.println("Sum : "+sum);
        System.out.println("Average : "+average);;

    }
}



//Output

//Enter the number of the element :
//        5
//Enter 5 element:
//        10
//        20
//        30
//        40
//        50
//Sum : 150
//Average : 30.0
//
//Process finished with exit code 0
