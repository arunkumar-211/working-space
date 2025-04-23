class Q5MedianNum {

    public static int getMedianNum(int arr[]){

            int med = 0;

            for(int i = 0; i < arr.length; i++) {
                if(arr.length % 2 == 0) {
                    med = (arr[(arr.length/2)-1] + arr[(arr.length/2)-2] )/2;
                }else {
                    med = (arr[(arr.length/2)]);
                }

            }

            return med;
    
    }


    public static void main(String[] args) {
           int arr[] = {12,4,3,5,7,6,7,8};

           int med = getMedianNum(arr);
           
           System.out.println("the median number of an array is:" + med);
    }
}
