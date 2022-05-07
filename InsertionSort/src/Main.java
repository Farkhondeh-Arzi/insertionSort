import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String[] splitted = string.split(" ");

        for (String s : splitted) {
            arr.add(Integer.parseInt(s));
        }

        InsertionSort sort = new InsertionSort(arr);
        sort.sort();
        sort.printArray();
    }
}

class InsertionSort {

    ArrayList<Integer> arrayList;

    InsertionSort(ArrayList<Integer> arr) {
        arrayList = arr;
    }


    public void sort() {
        for (int i = 1; i < arrayList.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arrayList.get(i) < arrayList.get(j)) Collections.swap(arrayList, i, j);
            }
        }
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == arrayList.size() - 1) System.out.print(arrayList.get(i));
            else System.out.print(arrayList.get(i) + ", ");
        }
        System.out.println("]");
    }
}

