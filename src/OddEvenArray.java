public class OddEvenArray {
    public  static  void  main(String[] args){
        int number = 7;
        checkEvenOdd(number);

        int[] array = {2, 5, 8, 11, 6, 7, 10};
        countEvenOddInArray(array);
    }

    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }

    public static void countEvenOddInArray(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count in the array: " + evenCount);
        System.out.println("Odd numbers count in the array: " + oddCount);
    }
}
