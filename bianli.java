/*
���幦�ܣ����ڴ�ӡ�����е�Ԫ�أ�Ԫ�ؼ��ö��Ÿ���
*/
class bianli
{
	public static void main(String[] args) 
	{
		int[] arr = {1,5,2,7,9,0,56,32};
		method_read(arr);
	}
	public static void method_read(int[] arr)
	{
		System.out.print("arr=[");
			
		for(int x=0; x<arr.length; x++)
		{
			if(x>arr.length-2)
				System.out.print(arr[x]+"]");
			else
				System.out.print(arr[x]+",");
		}
	}
}
		//Ԫ������[] ������ = new Ԫ������[Ԫ�ظ��������鳤��];

		//����: �붨��һ�����Դ洢3������������.
//		int[] x = new int[2];