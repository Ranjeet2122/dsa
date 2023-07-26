package dsa;

public class Bubble {

    public static void bubbleSort(int [] arr){
       int passes=arr.length-1;
       int comps=arr.length-1;
       
       
     
       for(int i=0;i<passes;i++) {
    	   
    	   
    	   for(int j=0;j<comps-i;j++) {
    		   if(arr[j]>arr[j+1]) {
    			   int temp = arr[j];
    			   arr[j]=arr[j+1];
    			   arr[j+1]=temp;
    			  
    			   
    		   }
    	   }
    	
    		
    	 
    	   
       }
    	   
    }
}