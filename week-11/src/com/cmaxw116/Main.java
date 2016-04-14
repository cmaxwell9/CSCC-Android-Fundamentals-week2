package com.cmaxw116;

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

class FilterCreator{
    public static StringFilter startsWtihFilter(String prefix) {
        //local class
        class StartsWithFilter implements StringFilter {
            @Override
            public boolean accept(String candidate) {
                return candidate.startsWith(prefix);
            }
        }
        return new StartsWithFilter();
    }
}

public class Main {
    public static void main(String[] args ) {
        Names friends = new Names();
        friends.add("arthur");
        friends.add("bob");
        friends.add("sue");
        StringFilter bFilter = FilterCreator.startsWtihFilter("b");
        List<String> bNames = friends.filter(bFilter);

        for (String name: bNames) {
            System.out.println(name);
        }
    }
}
