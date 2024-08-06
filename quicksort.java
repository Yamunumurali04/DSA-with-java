public class quicksort {

    
    /*   Quick sort = We follow the divide-and-conquer approach, 
                  designating the pivot as the last element in the array.
                  We compare each element with the pivot and ultimately place the pivot in its correct position,
                  where elements smaller than the pivot are on the left and elements larger are on the right. 
                  We repeat this process recursively until we obtain a fully sorted array
                  --> Time Complexity - O(n log n)
                  --> Space Complexity - O(n log n) */
    public static void main(String[] args) {
        int arr[] = {2,3,1,4,9,5};
        Quicksort(arr,0,arr.length -1);
        for(int num : arr)
        {
            System.out.println(num);
        }
    }
    static void Quicksort(int arr[],int start,int end)
    {
        if(end <= start) return;

        int pivot = partition(arr,start,end);
        Quicksort(arr,start,pivot-1);
        Quicksort(arr,pivot+1,end);
    }
    static int partition(int arr[],int start,int end)
    {
        int pivot = arr[end];
        int j= start;
        int i= start-1;
        for(;j<= end-1;j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp;
        temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }
}