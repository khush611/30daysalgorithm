import java.util.*;

public class multipleof3bin
{
    public static int ismul(int n)
    {
        if(n<0)
        n=-n;
        if(n==0)
        return 1;
        if(n==1)
        return 0;
        int oddc=0,evenc=0;
        while(n!=0)
        {
            if((n&1)!=0)
            oddc++;
            if((n&2)!=0)
            evenc++;
            n=n>>2;
        }
        return ismul(Math.abs(oddc-evenc));
    }
        
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		if(ismul(num)!=0)
		System.out.println(num+" is a multiple of 3");
		else
		System.out.println(num+" is not a multiple of 3");
}
		
		
	
}
