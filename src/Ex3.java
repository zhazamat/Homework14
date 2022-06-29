import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int n,count=0,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Please enter the numbers. Enter 0 to stop.: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            if(array[i]==0){
                System.out.println("Number "+(i+1)+" : "+array[i]);
                break;
            }
            else
            System.out.println("Number "+(i+1)+" : "+array[i]);count++;
            sum=sum+array[i];

        }
        System.out.println("You has entered " +count+ " numbers.");
        System.out.println( "Their sum is  "+ sum);
        System.out.println("Average of numbers is "+sum/count);

    }
}

