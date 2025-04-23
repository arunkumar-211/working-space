public class BinarySearch {


    public static int getIndexByBinarySearch(int arr[], int key) {

        int left = 0, right = arr.length-1, mid = 0;

        while(left <= right) {
        
            mid = left + (right-left)/2;

            if(arr[mid] == key) {
                return mid;
            }

            if(arr[left] <= arr[mid]) {

                if(key >= arr[left] && key < arr[mid]){
                    right = mid - 1;
                }else  {
                    left = mid + 1; 
                }
            }else {
                
                if(key > arr[mid] && key <= arr[right]){
                    left = mid + 1; 
                }else  {
                    right = mid - 1;
                }


            }


        }

        return -1; 

    }






    public static void main(String[] args){

        int arr[] = {1, 2, 3, 4, 5};
        int key = 5;

        int searchedElement = getIndexByBinarySearch(arr, key);

        System.out.println("The binary searched element is: "+searchedElement);


    }



} 