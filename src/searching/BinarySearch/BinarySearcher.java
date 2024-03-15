package searching.BinarySearch;

import java.util.Arrays;

public class BinarySearcher {

    static class Sorter {
        public void sort(int[] numbers) {
            for (int counter = 0; counter < numbers.length; counter++) {
                for (int index = 0; index < numbers.length - 1; index++) {
                    if (numbers[index] > numbers[index + 1]) {
                        int temp = numbers[index];
                        numbers[index] = numbers[index + 1];
                        numbers[index + 1] = temp;
                    }
                }
            }
        }
    }

    static class BinarySearch {
        public int search(int[] numbers, int key, int firstIndex, int lastIndex) {
            while (firstIndex <= lastIndex) {
                int middleIndex = lastIndex + ((firstIndex - lastIndex) / 2);
                if (numbers[middleIndex] == key) return middleIndex;
                else if (numbers[middleIndex] > key) lastIndex = middleIndex - 1;

                else if (numbers[middleIndex] < key) firstIndex = middleIndex + 1;

            }
            return -1;
        }
    }

    static class Main {
        public static void main(String[] args) {
            int[] numbers = new int[]{99, 1, 2, 7, 3, 5};
            System.out.println("numbers = " + Arrays.toString(numbers));
            Sorter sorter = new Sorter();
            sorter.sort(numbers);
            System.out.println("numbers = " + Arrays.toString(numbers));
            BinarySearch binarySearch = new BinarySearch();
            int search = binarySearch.search(numbers, 7, 0, numbers.length - 1);
            System.out.println("search = " + search);
        }
    }
}
