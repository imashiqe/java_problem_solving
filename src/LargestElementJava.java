public class LargestElementJava {
    public static void main(String[] args)
    {
        // Sample array
        int[] array = {10, 5, 8, 15, 7};

        // Call the method to find the largest element
        int largestElement = findLargestElement(array);

        // Display the result
        System.out.println("Largest element in the array: " + largestElement);
    }

    public static int findLargestElement(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }
}
