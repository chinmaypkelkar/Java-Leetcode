package Array;

import java.util.HashSet;
import java.util.Set;

public class ValidDelivery {
    public boolean isValidPath(String[] input){
        Set<Character> pickupSet = new HashSet<>();
        Set<Character> deliverSet = new HashSet<>();
        for(String s : input){
            char type = s.charAt(0);
            char orderNumber = s.charAt(1);
            if(type == 'P'){
                if(pickupSet.contains(orderNumber)){
                    return false;
                }
                pickupSet.add(orderNumber);
            }else if(type == 'D'){
                if(deliverSet.contains(orderNumber) || !pickupSet.contains(orderNumber)){
                    return false;
                }
                deliverSet.add(orderNumber);
            }else{
                return false;
            }
        }
        return pickupSet.size() == deliverSet.size();
    }
}
