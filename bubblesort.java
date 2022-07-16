public class bubblesort {
    static void bubbleSort(int[] arr) {
        int n= arr.length;
        int temp = 0;
        for (int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    static void binarySearch(int [] arr,int element){
        int beg = 0;
        int end = arr.length-1;
        int mid = (int) (beg+end)/2;
        while (beg<=end){
            if(arr[mid]==element){
                System.out.println("Element found at index: "+mid);
                return;
            }
            else if(element>arr[mid]){
                beg = mid+1;
            }
            else{
                end = mid-1;
            }
            mid=(int) (beg+end)/2;
        }
        System.out.println("Element not found.");

    }
    public static void main(String[] args){ 
        int arr[] ={10,12,3,4,19,7,17};
        System.out.println("Array before the bubble sort ");
        for(int i=0; i < arr.length; i++){  
            System.out.println(arr[i] + " ");  
        }
        bubbleSort(arr);
        System.out.println( "Array after the bubble sort");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " "); 
        }
        binarySearch(arr,12);
    }
}