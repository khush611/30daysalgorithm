# Method 1:

**Use of divisibilty rule of 3 which says "sum of all the digits of a number if divided by three is equal to 0 then the number is divisible by 3"**


```
import java.util.Scanner;
public class multipleof3simple
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n,d,s=0;
		n=sc.nextInt();
		while(n!=0)
		{
		    d=n%10;
		    s=s+d;
		    n=n/10;
		    
		}
		if(s%3==0)
		System.out.println("divisible by 3");
		else
		System.out.println("not divisible by 3");
		
	}
}
```
# Method 2:

**Use of bitwise operation to check the multiple of 3**

- take the binary representation of the number.
- count the no. of set bits at odd positions and even positions respectively
- subtract the total  no.of bits at odd position and  total  no.of bits at even positions.
- if the difference is a multiple of 3 then the number is also a multiple of 3.

## algorithm:
1. Make n positive if n is negative.
2. If number is 0 then return 1
3. If number is 1 then return 0
4. Initialize: odd_count = 0, even_count = 0
5. Loop while n != 0
    a) If rightmost bit is set then increment odd count.
    b) Right-shift n by 1 bit
    c) If rightmost bit is set then increment even count.
    d) Right-shift n by 1 bit
6. return isMutlipleOf3(odd_count - even_count)