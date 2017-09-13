	package xzh_6_25_BinarySort;

public class BinarySearch {
    
	public static int sort(int arr[],int value){
		int low=0;
		int high=arr.length-1;
		int middle=low + high;
    	while(low<=high){		
    		if(arr[middle]==value){
    			  return middle;
    		}
    		if(value<arr[middle]){
    			  high = middle-1;
    			middle = (low+high)/2;
    		}
    		if(value>arr[middle]){
    			low = middle+1;
    			middle = (low+high)/2;
    		}		
    	}
    	return -1;}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int value=22;
       int arr[] = {1,3,5,6,8,9,11,13,15,22,33};
       int index=sort(arr,22);
       System.out.println(index);
	}

}
