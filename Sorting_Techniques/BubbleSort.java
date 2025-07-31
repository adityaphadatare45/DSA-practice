class BubbleSort{
    static void bubble_sort(int arr [], int n){
        // outer loop
        for (int i = n-1; i >=0; i--) {
            int didswap = 0;
            // Inner loop
            for (int j = 0; j <= i-1; j++) {
                if(arr[j]> arr[j+1]){

                    // Swap element
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didswap = 1;
                }
            }
            if(didswap == 0){
                break;
            }
        }
        System.err.println("After bubble sort");
         for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+"");
        }
        System.out.println();

    }

   public static void main(String[] args) {
        int arr[] = { 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before bubble sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubble_sort(arr, n);
    }

}