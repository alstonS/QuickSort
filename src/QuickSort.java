public class QuickSort {

    public static int partition(int[] arr, int left, int right) {
        int pivot = right;
        int i = left - 1;
        int placeholder;

        for (int j = left; j < right; j++) {
            if (j <= pivot) {
                i++;
                placeholder = arr[i];
                arr[i] = arr[j];
                arr[j] = placeholder;
            }
        }

        placeholder = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = placeholder;
        return arr[i+1];
    }

    public void quickSort(int[] arr, int left, int right)
    {
        if(left<right)
        {
            int pivot = partition(arr,left,right);
            quickSort(arr, left, pivot-1);
            quickSort(arr, pivot+1, right);



        }
    }
}
