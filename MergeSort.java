class MergeSort 
{
    /*MergeSort - In this sorting,it utilizes the divide and conquer strategy,
              wherein the problem is recursive partitioning the problem into smaller sub-parts
              followed by merging of the solutions to achieve the sorted output.
    *            --> The time complexity is - O(n log n).
    *            -->The space complexity is - O(n).
    */
    public static void main(String args[])
    {
        int array[] = {4,2,7,1,8,3,9,6};
        mergesort(array);
        for(int num : array)
        {
            System.out.println(num);
        }
    }
    public static void mergesort(int array[])
    {
        int length = array.length;
        if(length <= 1) return;//base condition
        int middle = length/2;
        int leftarray[] = new int[middle];
        int rightarray[] = new int[length-middle];
        int i=0;
        int j=0;
        for(;i<length;i++)
        {
            if(i < middle)
            {
                leftarray[i] = array[i];
            }
            else
            {
                rightarray[j] = array[i];
                j++;
            }
        }
        mergesort(leftarray);
        mergesort(rightarray);
        merge(leftarray, rightarray, array);
    }
    public static void merge(int leftArray[], int rightArray[], int array[])
    {
        int leftsize = array.length / 2;
        int rightsize = array.length - leftsize;
        int i=0,l=0,r=0;
        while(l < leftsize && r < rightsize)
        {
            if(leftArray[l] < rightArray[r])
            {
                array[i] = leftArray[l];
                i++;l++;
            }
            else
            {
                array[i] = rightArray[r];
                i++;r++;
            }
        }
        while(l<leftsize)
        {
            array[i] = leftArray[l];
            i++;l++;
        }
        while(r < rightsize)
        {
            array[i] = rightArray[r];
            i++;r++;
        }
    }
}
