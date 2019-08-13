//link for reference: https://www.youtube.com/watch?v=fV-TF4OvZpk&t=132s
import java.util.Arrays;
import java.util.Scanner;

public class lis {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length of the sequence");
	int n=sc.nextInt();
	int num[]=new int[n];
	System.out.println("enter the sequence elements");
	for(int i=0;i<n;i++)
		num[i]=sc.nextInt();
	System.out.println("length of longest non-decreasing subsequence: ");
	System.out.println(lengthOfLNDS(num,n));

}
	public static int lengthOfLNDS(int num[],int n)
	{
		if(n==0)
			return 0;
		int maxlength[]=new int[n];
		for(int i=0;i<n;i++)
			maxlength[i]=1;
		int maxlengthsofar=1;
		int i,j;
		for(i=1;i<n;i++)
		{
			for(j=0;j<i;j++)
			{
				if(num[i]>num[j])
					maxlength[i]=Math.max(maxlength[i], maxlength[j]+1);
			}
			maxlengthsofar=Math.max(maxlengthsofar,maxlength[i]);
		}
		return maxlengthsofar;
	}
		
	}
