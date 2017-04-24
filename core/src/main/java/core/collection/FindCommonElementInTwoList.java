package core.collection;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by ehimnay on 03/04/2017.
 */
public class FindCommonElementInTwoList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Himansu");
        list1.add("Chaminda");

        List<String> list2 = new ArrayList<>();
        list2.add("Chaminda");
        list2.add("Dinesh");

        Collection<String> list3 = apacheCollectionUtils(list1, list2);
        System.out.println(list3);

        list1.retainAll(list2);
        System.out.println(list1);

    }

    private static void retainAll(final List<String> list1, final List<String> list2) {
        list1.retainAll(list2);
    }

    private static Collection<String> apacheCollectionUtils(final List<String> list1, final List<String> list2) {
        return CollectionUtils.intersection(list1, list2);
    }
}
