package net.jgp.pnp.labs.collections;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LinkedHashmapLab {
    @SuppressWarnings("rawtypes")
	public static void main(String args[]) {
    	
         LinkedHashMap<Integer, String> lkhash = new LinkedHashMap<Integer, String>();
         HashMap<Integer, String> hash = new HashMap<Integer, String>();

         lkhash.put(5,"e");
         lkhash.put(6,"f");
         lkhash.put(7,"g");
         lkhash.put(8,"h");
         lkhash.put(1,"a");
         lkhash.put(2,"b");
         lkhash.put(3,"c");
         lkhash.put(4,"d");
         
         hash.put(5,"e");
         hash.put(6,"f");
         hash.put(7,"g");
         hash.put(8,"h");
         hash.put(1,"a");
         hash.put(2,"b");
         hash.put(3,"c");
         hash.put(4,"d");
         
         Set setLinked = lkhash.entrySet();
         Set setHash = hash.entrySet();

         /* Displaying elements of LinkedHashMap */
         Iterator iteratorLinked = setLinked.iterator();
         Iterator iteratorHash = setHash.iterator();
         
         /* Linked hashmap keeps the order by when the key/value entries where created */
         System.out.println("Linked Hashmap:");
         
         while(iteratorLinked.hasNext()) {
            Map.Entry map_entry = (Map.Entry)iteratorLinked.next();
            System.out.print("Key is: "+ map_entry.getKey() + "& Value is: "+map_entry.getValue()+"\n");
         }
         
         /* regular hashmap automatically sorts the entries by key value where created */
         System.out.println("Regular Hashmap:");
         
         while(iteratorHash.hasNext()) {
             Map.Entry map_entry = (Map.Entry)iteratorHash.next();
             System.out.print("Key is: "+ map_entry.getKey() + "& Value is: "+map_entry.getValue()+"\n");
          }
         
    }
}
