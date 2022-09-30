public static void mergeSort(int[] array, int start, int end) {
    if (start == end) return;
    int middle = (start + end) / 2;
    mergeSort(array, start, middle);
    mergeSort(array, middle + 1, end);
    merge(array, start, middle + 1, end);
}

public static void merge(int[] array, int start, int middle, int end) {
    if (start == end || middle > end) return;
    if (array[start] < array[middle])
        merge(array, start + 1, middle, end);
    else {
        shift(array, start, middle);
        merge(array, start + 1, middle + 1, end);
    }
}

public static void shift(int[] array, int start, int end) {
    int temp = array[end];
    for (int i = end; i > start; i--)
        array[i] = array[i - 1];
    array[start] = temp;
}
