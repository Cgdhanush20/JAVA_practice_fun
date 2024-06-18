public class SelectionSort 
{
    public void sort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int mid=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[mid])
                {
                    mid=j;
                }
            }
            int temp=arr[mid];
            arr[mid]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={22,4,5,87,10,34};
        SelectionSort s=new SelectionSort();
        s.sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
