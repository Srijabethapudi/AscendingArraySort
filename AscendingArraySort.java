public class AscendingArraySort {
    public static void main(String[] args)
   {
	   int temp=0;
	   int arr[]= {9,4,10,2,5,8,7,1};
	   
	   
	   for(int i=0; i<arr.length;i++)//sort array in small to big
	   {
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if(arr[i]>arr[j])
			   {
				temp=arr[i];
			    arr[i]=arr[j];
			    arr[j]=temp;
			   }
			}
	   }

	   for(int i=0;i<arr.length;i++)
	   {
		  System.out.println(arr[i]+" "); 
	   }
	   
   } 
}
