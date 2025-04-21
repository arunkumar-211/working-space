//Q. Check whether the given strings are valued or not, if valued return the value else return -1.
 //A. 1. get the string 
 //   2. pass it to the valueOf method
 
 
 
 public class Q10CheckVal {
 
    public int getvalue(String str) {

        int intStr;
        try {
        intStr = Integer.parseInt(str);
        }catch(Exception e) {
            return -1;
        }
        
        return intStr;
        
    
    }



    public static void main(String[] strings) {
       // String str = "123";
       // String str = "-123";
        String str = "1a23";
        
        Q10CheckVal checkValue = new Q10CheckVal();
        System.out.println("The string value is: "+checkValue.getvalue(str));

    }
}
