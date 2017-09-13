package xzh_6_25_BubbleSort;

public class BubbleSort {   
	public static void BublleSort(int arr[]){
		int temp;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				 if(arr[j]>arr[j+1]){
					 temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
				 }
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[] = {2,4,6,5,8,7};
          System.out.println("Œ¥≈≈–Ú«∞:");
          for(int i=0;i<arr.length;i++){
        	  System.out.print(arr[i]+" ");
          }
          BublleSort(arr);
          System.out.println("\n≈≈–Ú∫Û:");
          for(int i=0;i<arr.length;i++){
        	  System.out.print(arr[i]+" ");
          }
	}

}
