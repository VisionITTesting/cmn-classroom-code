package basics.exceptionHandling;

public class G
{
	public static void main(String[] args)
	{
		int[] arr1={10,20,30,40,50,60,70,80};
		int[] arr2={10,0,30,0,50};
		for(int i=0;i<arr1.length;i++)
		{
			try
			{
				System.out.println(arr1[i]/arr2[i]);
				//arr[5]/arr[5];
				//60/no values
				
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("No such index");
			}catch(Exception e) {
				//genetic exception
			}
			
		}
	}
}
