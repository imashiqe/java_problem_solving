public class ReversArray {
    public static  void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5};


        reverseArray(array);
        System.out.print("Reversed array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Swap elements from start to end until the midpoint is reached
        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }
}
