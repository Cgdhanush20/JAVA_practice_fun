public class InsertionSort 
{
    public void sort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int[] arr={22,14,3,7,88,1};
        InsertionSort is=new InsertionSort();
        is.sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
