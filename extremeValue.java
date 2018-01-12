/*
给定一个数组{5,1,6,4,2,8,9}

1,获取数组中的最大值，以及最小值。
*/

class extremeValue
{
	public static void main(String[] args) 
	{
		int arr[] = {5,1,6,4,2,8,9};
		method_read(arr);
		int max=Max(arr);
		sop("max="+max);
		int min=Min(arr);
		sop("min="+min);
	}
	public static int Max(int[] arr)
	{
		int max=arr[0];
		for (int x=1; x<arr.length-1; x++)
		{
			if(max<arr[x])
				max=arr[x];
		}
		return max;
	}
	public static int Min(int[] arr)
	{
			int min=arr[0];
		for (int x=1; x<arr.length-1; x++)
		{
			if(min>arr[x])
				min=arr[x];
		}
		return min;
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void method_read(int[] arr)
	{
		System.out.print("arr=[");
			
		for(int x=0; x<arr.length; x++)
		{
			if(x>arr.length-2)
				System.out.println(arr[x]+"]");
			else
				System.out.print(arr[x]+",");
		}
	}
}
