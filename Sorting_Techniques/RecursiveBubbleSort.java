class RecursiveBubbleSort{
    static  void bubble_sort(int [] arr, int n){
        // Base condition for recursion.
        if(n == 1) return;

        // Recursion loop
        for(int j = 0; j<= n-2; j++){
            if(arr[j]> arr[j+1]){

                // swap 
                int temp = arr[j];
                arr [j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        // Range reduced after recursion.
        bubble_sort(arr, n - 1);
    }
    public static void main(String[] args) {
        int arr[] = {13,46,24,20,9,52};

        int n = arr.length;
        System.out.println("Before bubble sort");

         for (int i = 0; i < n; i++) {
             System.out.print(arr[i] + " ");            
        }
        System.out.println();
        bubble_sort(arr, n);

        System.out.println("After bubble sort");
         for (int i = 0; i < n; i++) {
            System.out.println( arr [i]+"");             
        }
        System.out.println();
    }
}