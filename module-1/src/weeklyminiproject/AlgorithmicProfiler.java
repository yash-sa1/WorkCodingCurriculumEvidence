package weeklyminiproject;

public class AlgorithmicProfiler {

    /*
     * write a simple algorithm that contains implementations of both
     * linear search and binary search. Create a large sorted array of numbers
     * and run both searches to find an element. Time their execution and print
     * results to demonstrate the performance difference between O(n) and O(log n)
     * in a practical way.
     */

    public static int linearSearch(int[] array, int target) {

        for ( int i: array ) {
            if (i == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;


        while ( low <= high ) {
            int mid = low + (high-low)/2;

            if (array[mid] == target) return array[mid];
            else if (array[mid] < target) low = mid + 1;
            else high = mid - 1;

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = SortedArrayGenerator.generate(1_000_000);
        int target = array[array.length - 1];

        long linearStart = System.nanoTime();
        int linearResult = linearSearch(array, target);
        long linearTime = System.nanoTime() - linearStart;

        long binaryStart = System.nanoTime();
        int binaryResult = binarySearch(array, target);
        long binaryTime = System.nanoTime() - binaryStart;

        System.out.printf("linear search: found at %d in %d ns%n", linearResult, linearTime);
        System.out.printf("binary search: found at %d in %d ns%n", binaryResult, binaryTime);
    }

}
