/*
����һ������{5,1,6,4,2,8,9}

1,��ȡ�����е����ֵ���Լ���Сֵ��
*/
class Extreme
{
	public static void main(String[] args) 
	{
		int[] arr ={5,1,6,4,2,8,9};
		bianli(arr);
		int max = getMax(arr);
		sop("max="+max);
		int min = getMin(arr);
		sop("min="+min);
	}

	public static void bianli(int[] arr)
	{
		System.out.print("arr[]={");
		for (int x=0; x<arr.length; x++)
		{
			if(x<arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"};");
		}
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static int getMax(int[] arr)
	{
		int max=arr[0];
		for (int x=1; x<arr.length; x++)
		{
			if(arr[x]>max)
				max=arr[x];
		}return max;
	}
	public static int getMin(int[] arr)
	{
		int min=arr[0];
		for (int x=1; x<arr.length; x++)
		{
			if(arr[x]<min)
				min=arr[x];
		}return min;
	}
}
