public class SqrtBinarySearch 
{
    static float squareroot(int number)
    {
        int start=0,end=number;
        int mid;
        double ans=0.0;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(mid*mid==number)
            {
                ans=mid;
                break;
            }
            if(mid*mid<number)
            {
                start=mid+1;
                ans=mid;
            }
            else{
                end=mid-1;
            }
        }
        double in=0.1;
        for(int i=0;i<4;i++)
        {
            while(ans*ans<=number)
            {
                ans+=in;
            }
            ans=ans-in;
            in=in/10;
        }
        return (float)ans;
    }
    public static void main(String args[])
    {
        System.out.println(squareroot(161));
        System.out.println(squareroot(99));
    }
}
