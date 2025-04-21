class Q9StringDistance {

    public static void main(String[] args) {
            String str = "the quick the brown quick brown the frog";
            String strArr[] = str.split(" ");
            int minDistance = (str.length());
            
            for(int i = 0; i < strArr.length; i++) {
                if(strArr[i].equals("quick")) {
                    for(int j = 0; j < strArr.length; j++) {
                        if(strArr[j].equals("frog")) {
                            int minTemp = (Math.abs(j - i) - 1);
                            
                            if(minTemp < minDistance) {
                                minDistance = minTemp;
                            }
                        }    
                        
                    }
                }
            }
            
            System.out.println("minDistance:" +minDistance);
    }
}