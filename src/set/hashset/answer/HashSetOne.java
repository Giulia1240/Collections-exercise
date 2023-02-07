package set.hashset.answer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetOne {
    public void hashSetOne() {

        Set<String> family = new HashSet<>();
        family.add("FATHER");
        family.add("MOTHER");
        family.add("DAUGHTER");
        family.add("SON");
        family.add("SIBLING");
        family.add("GRANDMOTHER");
        family.add("GRANDFATHER");
        family.add("SON IN LAW");
        family.add("DAUGHTER IN LAW");
        family.add("MOTHER IN LAW");
        family.add("AUNT");
        family.add("COULER");
        family.add("COUSIN");
        System.out.println("Append the specified element to the end of a hash set" + family);

        System.out.println();
        Iterator<String> iterator = family.iterator();
        System.out.println("Iterate through all elements in a hash list: " + iterator);

        System.out.println();
        family.size();
        System.out.println("Get the number of elements in a hash set" + family);

        System.out.println();
        family.removeAll(family);
        System.out.println("Empty an hash set" + family);

        System.out.println();
        String teste = (family.isEmpty()) ? "true" : "false";
        System.out.println("Test a hash set is empty or not" + teste);

    }
}
