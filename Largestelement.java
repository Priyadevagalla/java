//the largest element of the array 1d
import java.util.*;
class Largestelement{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
int a[]=new int[n];
int max=a[0];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
if(a[i]>max)
	max=a[i];
}
System.out.println("Maximum number is:"+max);
}
}


/*Read the integer n for the size of the array.
Declare an integer array a of size n.
Loop to read n elements into the array a.
Initialize max with the first element of the array a[0].
Loop to find the max element
If a[i] > max, update max with a[i].
Print the maximum value max.
*/