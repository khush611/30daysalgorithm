//link for reference:https://www.youtube.com/watch?v=ASoaQq66foQ
import java.util.Scanner;

public class lcs {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the 1st string");
	String str1=sc.next();
	System.out.println("enter the 2nd string");
	String str2=sc.next();
	char ch1[]=str1.toCharArray();
	char ch2[]=str2.toCharArray();
	int l1=ch1.length;
	int l2=ch2.length;
	System.out.println("length of longest non-decreasing subsequence: ");
	
	System.out.println(lengthOfLCS(ch1,ch2,l1,l2));

}
	public static int lengthOfLCS(char ch1[],char ch2[],int l1,int l2)
	{
	int L[][]=new int[l1+1][l2+1];
	for(int i=0;i<=l1;i++)
	{
		for(int j=0;j<=l2;j++)
		{
			if(i==0||j==0)
			{
				L[i][j]=0;
			}
			else if(ch1[i-1]==ch2[j-1])
				L[i][j]=L[i-1][j-1]+1;
			else 
				L[i][j]=Math.max(L[i-1][j],L[i][j-1]);
		}
	}
	return L[l1][l2];
	}
		
	}
