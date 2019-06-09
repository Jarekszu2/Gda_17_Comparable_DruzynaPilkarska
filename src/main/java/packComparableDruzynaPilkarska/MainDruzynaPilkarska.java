package packComparableDruzynaPilkarska;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainDruzynaPilkarska {
    public static void main(String[] args) {
        System.out.println();

        DruzynaPilkarska dp1 = new DruzynaPilkarska("n1", 12, 7, 4, 6, 9);
        DruzynaPilkarska dp2 = new DruzynaPilkarska("n11", 5, 7, 4, 6, 11);
        DruzynaPilkarska dp3 = new DruzynaPilkarska("n7", 1, 7, 4, 6, 4);
        DruzynaPilkarska dp5 = new DruzynaPilkarska("n12", 9, 7, 4, 6, 11);
        DruzynaPilkarska dp8 = new DruzynaPilkarska("n15", 9, 4, 4, 6, 11);
        DruzynaPilkarska dp4 = new DruzynaPilkarska("n16", 9, 4, 4, 6, 11);
        DruzynaPilkarska dp6 = new DruzynaPilkarska("n8", 2, 7, 4, 6, 11);
        DruzynaPilkarska dp7 = new DruzynaPilkarska("n5", 12, 7, 4, 6, 7);

        List<DruzynaPilkarska> druzynaPilkarskaList = new ArrayList<DruzynaPilkarska>();

        druzynaPilkarskaList.add(dp1);
        druzynaPilkarskaList.add(dp2);
        druzynaPilkarskaList.add(dp3);
        druzynaPilkarskaList.add(dp5);
        druzynaPilkarskaList.add(dp6);
        druzynaPilkarskaList.add(dp7);
        druzynaPilkarskaList.add(dp4);
        druzynaPilkarskaList.add(dp8);

        System.out.println();
        System.out.println("Lista drużyn piłkarskich:");
        druzynaPilkarskaList.forEach(System.out::println);

        System.out.println();
        System.out.println("Lista drużyn piłkarskich posortowana:");
        Collections.sort(druzynaPilkarskaList);
        druzynaPilkarskaList.forEach(System.out::println);
    }
}
