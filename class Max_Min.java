/*Purpose : a program to find the minimum and the maximum of an integer array
@saiabhi29 Abhinav Penagalapati
Created on : 10/20/2020
*/
class Max_Min
{
	public static void main(String[] args) 
	{
		int[] arr = {5,12,-3,7,3,22,-33};
		int min = arr[0];
        int max = arr[0];
        int min_index = 0;
        int max_index = 0;
	 for (int i =1;i<arr.length;i++){

	   if(min>arr[i]){
         min = arr[i];
         min_index = i;
	   }
	   if (max<arr[i]){
         max = arr[i];
         max_index=i;
	   }
	 }
	 System.out.println(min+" This is at the index "+min_index);
	 System.out.println(max+" This is at the index "+max_index);
	}
}