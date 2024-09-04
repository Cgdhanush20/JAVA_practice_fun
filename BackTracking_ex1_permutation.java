import java.util.*;
public class BackTracking_ex1_permutation
{
	public static void main(String[] args) 
	{
	    	int a[]={1,2,3};
		List<List<Integer>> r=new ArrayList<>();
		backtracking(a,new ArrayList<>(),r);
		System.out.println(r);
	}
	public static void backtracking(int a[], List<Integer> c,List<List<Integer>> r)
	{
	    if(c.size()==a.length)
	    {
	        r.add(new ArrayList<>(c));
	    }
	    else
	    {
            for(int i=0;i<a.length;i++)
            {
                if(c.contains(a[i])) 
                {
                    continue;
                }
                c.add(a[i]);
                backtracking(a,c,r);
                c.remove(c.size()-1);
            }
	    }
	}
}
