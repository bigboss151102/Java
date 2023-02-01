package dev.lpa.dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};
        List<String> list = List.of(items);
        System.out.println(list);

        System.out.println("--------------------------------");

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        System.out.println("--------------------------------");

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese")
        );
        System.out.println(nextList);

        System.out.println("--------------------------------");

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("--------------------------------");

        System.out.println("Third item = " + groceries.get(2));

        System.out.println("--------------------------------");

        if (groceries.contains("mustard"))
        {
            System.out.println("List contains mustard");
        }
        groceries.add("yogurt");
        System.out.println("First = " + groceries.indexOf("yogurt"));
        System.out.println("Last = " + groceries.lastIndexOf("yogurt"));

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);

        System.out.println("--------------------------------");

        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apples","milk","mustard","cheese"));
        System.out.println(groceries);

        System.out.println("--------------------------------");

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println(groceries);

        System.out.println("--------------------------------");

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        System.out.println("--------------------------------");

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));


    }
}
