package com.cmaxw115;

/**
 * Created by Clint on 4/12/2016.
 */
import java.util.ArrayList;
import java.util.List;

interface StringFilter {
    public boolean accept(String candidate);
}

class Names {
    private List<String> names = new ArrayList<>();

    public void add(String name) {
        names.add(name);
    }

    public List<String> filter(StringFilter filter) {
        List<String> filteredNames = new ArrayList<>();
        for (String name: names) {
            if (filter.accept(name)) {
                filteredNames.add(name);
            }
        }
        return filteredNames;
    }

}

//alternative to anonymous class implementing StringFilter
class BFilter implements StringFilter {
    @Override
    public boolean accept(String candidate) {
        return candidate.startsWith("b");
    }
}

public class Main {
    public static void main(String[] args ) {
        Names friends = new Names();
        friends.add("arthur");
        friends.add("bob");
        friends.add("sue");
        StringFilter bFilter = new BFilter();
        List<String> bNames = friends.filter(bFilter);

        for (String name: bNames) {
            System.out.println(name);
        }
    }
}
