package searching.BinarySearch;

import java.util.Arrays;

public class StringBinarySearcher {

    public int  search(String[] names, String key, int firstIndex, int lastIndex) {
        while (firstIndex<=lastIndex) {
            int middleIndex = lastIndex + ((firstIndex - lastIndex) / 2);
            if (names[middleIndex].equalsIgnoreCase(key)) return middleIndex;
            else if (names[middleIndex].compareTo(key) < 0) firstIndex = middleIndex + 1;
            else if (names[middleIndex].compareTo(key) > 0) lastIndex = middleIndex - 1;
        }
        return -1;
    }
}

class Sorter {
    public void sort(String[] names) {
        for (int counter = 0; counter < names.length; counter++) {
            for (int index = 0; index < names.length - 1; index++) {
                if (names[index].compareTo(names[index + 1]) > 0) {
                    String temp = names[index];
                    names[index] = names[index + 1];
                    names[index + 1] = temp;
                }
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        String[] names = new String[]{"rohan", "krishna", "mukund", "nikhil bansal"};
        System.out.println("names = " + Arrays.toString(names));
        Sorter sorter = new Sorter();
        sorter.sort(names);
        System.out.println("names = " + Arrays.toString(names));
        StringBinarySearcher stringBinarySearcher = new StringBinarySearcher();
        int search = stringBinarySearcher.search(names, "mukund", 0, names.length - 1);
        System.out.println("search = " + search);
    }
}