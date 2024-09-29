
import java.util.Arrays;
import java.util.Scanner;


public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        float average = 0;

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        average = (float)sum / (float)arr.length;

        bubbleSort(arr);
        System.out.println("The sorted array is: " + Arrays.toString(arr));
        System.out.println("The average sorted array is: " + average);
        System.out.println("The sum of the elements of the array is: " + sum);

        System.exit(0);
    }

    // BubbleSort
    public static void bubbleSort(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
