class Q11MinNum {

    public static int getMinNum(int arr[]){

            int min = Integer.MAX_VALUE;

            for(int i = 0; i < arr.length; i++) {
                if(arr[i] < min) {
                    min = arr[i];
                }

            }

            return min;
    
    }


    public static void main(String[] args) {
           int arr[] = {12,4,3,5,7,6,2,1};

           int min = getMinNum(arr);
           
           System.out.println("the minimum number in an array is:" + min);
    }
}
