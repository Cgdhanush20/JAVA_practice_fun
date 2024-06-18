interface SortAlgorithm
{
    void sort(int[] array);
}
class BubbleSort implements SortAlgorithm
{
    @Override
    public void sort(int[] array)
    {
        int n=array.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}
class MergeSort implements SortAlgorithm
{
    @Override
    public void sort(int array[])
    {
        mergSort(array,0,array.length-1);
    }
    private void mergSort(int array[],int l,int r)
    {
        if(l<r)
        {
            int m=(l+r)/2;
            mergSort(array,l,m);
            mergSort(array,m+1,r);
            merge(array,l,m,r);
        }
    }
    private void merge(int[] array,int l,int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int[] la=new int[n1];
        int[] ra=new int[n2];
        for(int i=0;i<n1;i++)
        {
            la[i]=array[l+i];
        }
        for(int i=0;i<n2;i++)
        {
            ra[i]=array[m+i+1];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
            if(la[i]<ra[j])
            {
                array[k]=la[i];
                i++;
            }else
            {
                array[k]=ra[j];
                j++;
            }
            k++;
        }
        while (i < n1) 
        {
            array[k] = la[i];
            i++;
            k++;
        }
        while (j < n2) 
        {
            array[k] = ra[j];
            j++;
            k++;
        }
    }
}
public class SortingInterface
{
    public static void main(String args[])
    {
        int[] a={22,11,44,32,10,7,5};
        int[] b={100,99,88,77,66,55,44,11};
        SortAlgorithm s1=new BubbleSort();
        SortAlgorithm s2=new MergeSort();
        s1.sort(a);
        s2.sort(b);
        System.out.println("Bubble sort:"+java.util.Arrays.toString(a));
        System.out.println("Merg sort:"+java.util.Arrays.toString(b));
    }
}