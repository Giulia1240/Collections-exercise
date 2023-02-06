package set.hashset.answer;

import java.util.*;

public class HashSetTwo {
    public void hashSetTwo() {

        HashSet<String> familyForlin = new HashSet<>();
        HashSet<String> familyCavalcanti = new HashSet<>();
        familyForlin.add("FATHER");
        familyForlin.add("MOTHER");
        familyForlin.add("DAUGHTER");
        familyForlin.add("SON");
        familyForlin.add("SIBLING");
        familyForlin.add("GRANDMOTHER");
        familyForlin.add("GRANDFATHER");
        familyForlin.add("SON IN LAW");
        familyForlin.add("DAUGHTER IN LAW");
        familyForlin.add("AUNT");
        familyForlin.add("COULER");
        familyForlin.add("COUSIN");
        System.out.println("Append the specified element to the end of a hash set" + familyForlin);

        familyCavalcanti.addAll(familyForlin);

        System.out.println();
        HashSet<String> cloneHash = new HashSet<>();
        cloneHash = (HashSet) familyForlin.clone();
        System.out.println("clone a hash set to another hash set: " + cloneHash);

        System.out.println();
        String[] new_array = new String[familyForlin.size()];
        familyForlin.toArray(new_array);
        System.out.println("convert a hash set to an array" + new_array);

        System.out.println();
        Set<String> convertTree = new TreeSet<>(familyForlin);
        for (String element : convertTree) {
            System.out.println(element);
        }
        System.out.println("convert a hash set to a tree set" + convertTree);

        System.out.println();
        List<String> convert = new ArrayList<>();
        convert.addAll(familyForlin);
        System.out.println("convert a hash set to a List/ArrayList" + convert);

        System.out.println();
        String compare = (familyCavalcanti.contains(familyForlin)) ? "true" : "false";
        System.out.println("compare two hash set" + compare);

    }
}
