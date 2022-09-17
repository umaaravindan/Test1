import java.util.*;

class HashSet7
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        // number of the elements
        int n = in.nextInt();

        int array[] = new int[n];

        //storing the input integers to an array
        for(int i =0;i<n;i++){
            array[i] = in.nextInt();
        }
        
        // getting the target sum from input
        int targetSum = in.nextInt();
        
        printpairs(array,targetSum);
        
    }
	
	static void printpairs(int arr[], int sum)
    {
		int flag=0;
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i)
        {
            int temp = sum - arr[i];
            if (s.contains(temp)) {
               /* System.out.println(
                    "Pair with given sum "
                    + sum + " is (" + arr[i]
                    + ", " + temp + ")");*/
				flag=1;				
            }
            s.add(arr[i]);			
            
			
        }
		if(flag==1)
		{
			System.out.println("true");
		}
		else
		{
		System.out.println("false");
		}	
		
    }
}