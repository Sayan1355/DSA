//Q.1 --> Find the largest and smallest element in an integer array without using built-in min/max function.

package phase1;
import java.util.Scanner;

public class Question01_LargestAndSmallest {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();

        int [] arr = new int [n];

        System.out.println("Enter " + n +  " Elements : ");

        for (int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i= 1 ;i < n ; i++ ){

            if (arr[i]>largest){
                largest = arr[i];
            }
            if ( arr[i] < smallest ){
                smallest = arr[i];
            }
        }

        System.out.println(" Largest Element = " +largest);
        System.out.println("Smallest Element : "+smallest);
    }
}

/*output

Enter the size of the Array : 5
Enter 5 Elements :
        10
        20
        30
        04
        70
Largest Element = 70
Smallest Element : 4

Process finished with exit code 0
*/
