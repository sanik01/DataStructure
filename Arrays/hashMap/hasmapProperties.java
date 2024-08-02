package hashMap;

import java.util.HashMap;
import java.util.Map;

public class hasmapProperties {
    //hashing technique
// hashmap
public static void main(String[] args) {
    HashMap<Integer,String> map=new HashMap<Integer,String>();
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    map.put(1,"Mango");  //Put elements in Map  
    map.put(2,"Apple");    
    map.put(3,"Banana");   
    map.put(1,"Grapes");//update
    map.get(1);
    map.remove(1); 
    map.containsKey(1);
 
 
 map.putAll(hm);     
        
    System.out.println("Iterating Hashmap...");  
    for(Map.Entry currentMapSet : map.entrySet()){    
         System.out.println(currentMapSet.getKey()+" "+currentMapSet.getValue());    
    } 
}
 
}
