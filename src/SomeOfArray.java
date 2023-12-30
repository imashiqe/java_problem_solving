public class SomeOfArray {
    public  static void  main(String[] args){
        int[] array = {1, 2, 3, 4, 5};
        int sum = calculateSum(array);
        System.out.println("Sum of array elements: " + sum);


    }

    public static int calculateSum(int[] arr) {
        int sum = 0;

        // Iterate through the array and add each element to the sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

}


