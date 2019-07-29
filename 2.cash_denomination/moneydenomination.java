import java.util.Scanner;
public class moneydenomination {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount");
		int amt =sc.nextInt();
		int r2000=0,r500=0,r100=0,r50=0,r20=0,r10=0,r5=0,r2=0,r1=0;
		while(amt>=2000)
		{
		    r2000=amt/2000;
		    amt=amt%2000;
		    System.out.println("no.of Rs.2000: "+r2000);
		break;
	}
	while(amt>=500)
		{
		    r500=amt/500;
		    amt=amt%500;
		    System.out.println("no.of Rs.500: "+r500);
		break;
	}
	while(amt>=100)
		{
		    r100=amt/100;
		    amt=amt%100;
		    System.out.println("no.of Rs.100: "+r100);
		break;
	}
	while(amt>=50)
		{
		    r2000=amt/50;
		    amt=amt%50;
		    System.out.println("no.of Rs.50: "+r50);
		break;
	}
	while(amt>=10)
		{
		    r2000=amt/10;
		    amt=amt%10;
		    System.out.println("no.of Rs.10: "+r10);
		break;
	}
	
	while(amt>=5)
		{
		    r5=amt/5;
		    amt=amt%5;
		    System.out.println("no.of Rs.5: "+r5);
		break;
	}
	while(amt>=2)
		{
		    r2=amt/2;
		    amt=amt%2;
		    System.out.println("no.of Rs.2: "+r2);
		break;
	}
	while(amt>=1)
		{
		    r1=amt/1;
		    amt=amt%1;
		    System.out.println("no.of Rs.1: "+r1);
		break;
	}
	int total=r2000+r500+r100+r50+r20+r10+r5+r2+r1;
	System.out.println("TOTAL NO.OF MINIMUM TRASACTION: "+total);
	
	}
}

