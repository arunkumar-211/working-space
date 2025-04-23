/*Given an array of strings,
    return the IP address that occurs maximum number of times. 
    [You might have to check for the validity of the IP address before considering it].

Example:
    String [] str = {
                              "10.0.0.1 bytes=32 time=50ms TTL=63",
                              "10.0.0.2 bytes=32 time=50ms TTL=73",
                              "10.0.0.4 bytes=32 time=50ms TTL=83",
                              "10.0.0.2 bytes=32 time=50ms TTL=93",
                            }

    // Return 10.0.0.2*/
//Algorithm :-
//1. extract the ip adresses from the given string array and store it in the separate string array
//2. count the max ip address count
//3. return the ip address, so obtained

import java.util.HashMap;
import java.util.Map;

public class Q16MaxIP {

    public static void main(String[] args) {

        Map<String, Integer> ipMap = new HashMap<>();
        int max = Integer.MIN_VALUE;
        String maxIp = "";

        String[] originalStr = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.2 bytes=32 time=50ms TTL=93",
        };

        for (String oS : originalStr) {
            String[] ipStr = oS.split(" ");
            ipMap.put(ipStr[0], ipMap.getOrDefault(ipStr[0], 0) + 1);

        }

        for (Map.Entry<String, Integer> iM : ipMap.entrySet()) {
            if (iM.getValue() > max) {
                max = iM.getValue();
                maxIp = iM.getKey();
            }
        }

        System.out.println("max ip address: " + maxIp);

    }
}