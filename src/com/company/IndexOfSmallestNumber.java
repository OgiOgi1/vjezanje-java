package com.company;

public class IndexOfSmallestNumber {
    public static void main(String[] args) {
        int[] niz ={ 10, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(indexOfSmallestElement(niz));
    }

    public static int indexOfSmallestElement(int[] array) {

        int minIndex = 0;
        int duzinaNiza = array.length;
        int minVrjednostUNizu = array[0];
        for (int i = 0; i < duzinaNiza; i++) {
            if (array[i]< minVrjednostUNizu) {
                minIndex = i;
                minVrjednostUNizu = array[i];
            }

        }

        return minIndex;

    }
}
