package p_collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample //Assignment-104
 {
	public static void main(String[] args) 
	{
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Manu");
        linkedHashSet.add("char");
        linkedHashSet.add("Chaitra");
        linkedHashSet.add(true);
        linkedHashSet.add('c');
        System.out.println(linkedHashSet);
	}
}
